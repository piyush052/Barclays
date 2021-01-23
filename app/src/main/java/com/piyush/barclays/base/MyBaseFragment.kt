package com.piyush.barclays.base

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton
import com.google.android.material.snackbar.Snackbar
import com.piyush.barclays.R
import com.piyush.barclays.api.SharedPrefManager
import com.piyush.barclays.enums.ErrorMessageType
import com.piyush.barclays.enums.LoaderStatus

abstract class MyBaseFragment : Fragment() {
    protected val TAG = this.javaClass.simpleName
    private var mBaseView: ViewGroup? = null
    private var mLoaderView: View? = null
    private var progressShown = false
    private var futureShowProgress = false
    private var button: CircularProgressButton? = null
    private var swipeRefreshLayout: SwipeRefreshLayout? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initProgress(view)
    }

    //Call this function to set up loaders
    protected fun setUpLoader(
        viewModel: MyBaseViewModel,
        button: CircularProgressButton? = null,
        swipeRefreshLayout: SwipeRefreshLayout? = null) {

        this.button = button
        this.swipeRefreshLayout = swipeRefreshLayout
        val color = ContextCompat.getColor(activity!!, R.color.secondary)

        viewModel.isLoading.observe(viewLifecycleOwner, Observer {
            if (swipeRefreshLayout != null) {
                if (swipeRefreshLayout.isRefreshing) {
                    if (it != LoaderStatus.loading) {
                        swipeRefreshLayout.isRefreshing = false
                        hideProgress()
                    }
                } else {
                    if (it == LoaderStatus.loading)
                        showProgress()
                    else
                        hideProgress()
                }
            } else if (button == null) {
                if (it == LoaderStatus.loading)
                    showProgress()
                else
                    hideProgress()
            } else {
                if (it == LoaderStatus.loading)
                    button.startAnimation()
                else if (it == LoaderStatus.success)
//                    button.doneLoadingAnimation(color, doneBitmap)
                //TODO("Not yet implemented")
                else if (it == LoaderStatus.failed)
                    button.revertAnimation()
            }
        })

        viewModel.errorMediatorLiveData.observe(this, Observer
        {
            it?.let {
                var updatedErrorMessage: String? = null
                if (it.contains("_")){
                    updatedErrorMessage = it.replace("_", " ")
                    showSnackbar(updatedErrorMessage)
                }else{
                    updatedErrorMessage = it
                    showSnackbar(updatedErrorMessage)
                }
                onErrorCalled(updatedErrorMessage)
            }
        })
        initObservers()
    }

    protected abstract fun onErrorCalled(it: String?)

    protected abstract fun initObservers()

    private fun initProgress(view: View) {
        mBaseView = view as ViewGroup
        mLoaderView = View.inflate(activity, R.layout.loader, null)
        mBaseView?.let {
            if (futureShowProgress)
                showProgress()
        }
    }

    fun getSharedPrefManager(): SharedPrefManager {
        return SharedPrefManager.getInstance(activity!!)
    }

    fun hideKeyboard() {
        activity?.let {
            val imm = it.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            //Find the currently focused view, so we can grab the correct window token from it.
            var view = it.currentFocus
            //If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = View(it)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showKeyboard() {
        activity?.let {
            val inputManager = it.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            // check if no view has focus:
            val view = it.currentFocus
            view?.let {
                inputManager.toggleSoftInputFromWindow(view.windowToken, InputMethodManager.SHOW_FORCED, 0)
            }
        }
    }


    fun showSnackbar(text: String, errorMessageType: ErrorMessageType = ErrorMessageType.snackbar) {
        mBaseView?.let {
            val snackbar = Snackbar.make(activity?.findViewById(android.R.id.content)!!, text, Snackbar.LENGTH_LONG)
            snackbar.duration = 4000
            val snackbarView = snackbar.view
            var snackbarBg = R.color.black
            var snackbarTextColor = R.color.secondary
            activity?.let {
                if (errorMessageType == ErrorMessageType.snackbarError) {
                    snackbarBg = R.color.black
                    snackbarTextColor = R.color.red_btn
                }
                snackbarView.setBackgroundColor(ContextCompat.getColor(it, snackbarBg))
                val tv = snackbarView.findViewById(R.id.snackbar_text) as TextView
                tv.setTextColor(ContextCompat.getColor(activity!!, snackbarTextColor))
                tv.gravity = Gravity.CENTER
                snackbar.show()
            }
        }
    }

    fun showProgress() {
        hideKeyboard()
        if (mBaseView == null) {
            futureShowProgress = true
        } else if (!progressShown) {
            mBaseView!!.addView(mLoaderView)
            progressShown = true
            futureShowProgress = false
        } else {
            futureShowProgress = false
        }
    }

    fun hideProgress() {
        futureShowProgress = false
        if (progressShown) {
            mBaseView?.removeView(mLoaderView)
            progressShown = false
        }
    }

    protected fun showToast(s: String) {
        activity?.let {
            Toast.makeText(it, s, Toast.LENGTH_LONG).show()
        }
    }

    protected fun showAlertDialogOk(title: String, message: String, listener: DialogInterface.OnClickListener) {
        context?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(title)
            builder.setMessage(message)
            builder.setPositiveButton("OK", listener)
            val mAlertDialog = builder.create()
            mAlertDialog.setCanceledOnTouchOutside(false)
            mAlertDialog.setCanceledOnTouchOutside(false)
            mAlertDialog.setOnShowListener {
                context?.let {
                    mAlertDialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
                        .setTextColor(ContextCompat.getColor(it, R.color.secondary))
                }
            }
            mAlertDialog.show()
        }
    }

    protected fun showConfirmation(
        negativeText: String,
        positiveText: String,
        title: String,
        message: String,
        listener: DialogInterface.OnClickListener) {
        context?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(title)
            builder.setMessage(message)
            builder.setPositiveButton(positiveText, listener)
            builder.setNegativeButton(negativeText, DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            val mAlertDialog = builder.create()
            mAlertDialog.setCanceledOnTouchOutside(false)
            mAlertDialog.setCancelable(false)
            mAlertDialog.setOnShowListener {
                context?.let {
                    mAlertDialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
                        .setTextColor(ContextCompat.getColor(it, R.color.colorPrimary))
                    mAlertDialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE)
                        .setTextColor(ContextCompat.getColor(it, R.color.colorPrimary))
                }
            }
            mAlertDialog.show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        button?.dispose()
    }
}