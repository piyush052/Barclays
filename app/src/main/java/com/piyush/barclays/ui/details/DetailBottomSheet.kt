package com.piyush.barclays.ui.details

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.piyush.barclays.R
import com.piyush.barclays.constants.AppConstants
import com.piyush.barclays.response.stockDetails.StockDetails
import com.piyush.barclays.ui.charts.ChartActivity
import kotlinx.android.synthetic.main.detail_bottom_sheet.*


class DetailBottomSheet: BottomSheetDialogFragment()  {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detail_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    @SuppressLint("SetTextI18n")
    private fun setUpViews() {
        cTitle.text = stockDetails.price?.longName
        exchangeName.text = stockDetails?.symbol
        price1.text = stockDetails.price?.regularMarketOpen?.fmt
        price2.text = stockDetails.price?.regularMarketChange?.fmt + "% change"

        volume.text= "Regular Market Volume  "+stockDetails.price?.regularMarketVolume?.fmt?.toString()
        averageDailyVolume10Day.text= "Avg Vol 10 day "+stockDetails.price?.averageDailyVolume10Day?.fmt?.toString()
        postMarketPrice.text= "Post mkt Price "+stockDetails.price?.postMarketPrice?.fmt?.toString()
        regularMarketPrice.text= "Regular Market Price " +stockDetails.price?.regularMarketPrice?.fmt?.toString()
        regularMarketVolume.text= "Regular Market Volume " +stockDetails.price?.regularMarketVolume?.fmt?.toString()
        regularMarketChangePercent.text="Regular market change % "+ stockDetails.price?.regularMarketChangePercent?.fmt?.toString()


        regularMarketOpen.text=  "Regular Market Open "+ stockDetails.summaryDetail?.regularMarketOpen?.fmt?.toString()
        twoHundredDayAverage.text= "200 Day Avg "+stockDetails.summaryDetail?.twoHundredDayAverage?.fmt?.toString()


        chartButton.setOnClickListener {
            if(activity!=null) {
                val intent = Intent(activity!!, ChartActivity::class.java)
                intent.putExtra(AppConstants.SYMBOL, stockDetails?.symbol)
                activity!!.startActivity(intent)
            }
        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog
            setupFullHeight(bottomSheetDialog)
        }
        return dialog
    }
    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {
        val bottomSheet = bottomSheetDialog.findViewById<View>(R.id.design_bottom_sheet) as FrameLayout
        val behavior: BottomSheetBehavior<*> = BottomSheetBehavior.from(bottomSheet)
        val layoutParams = bottomSheet!!.layoutParams
        val windowHeight = getWindowHeight()
        if (layoutParams != null) {
            layoutParams.height = windowHeight
        }
        bottomSheet.layoutParams = layoutParams
        behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
    }

    private fun getWindowHeight(): Int {
        // Calculate window height for fullscreen use
        val displayMetrics = DisplayMetrics()
        (context as Activity?)!!.windowManager.defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }

    companion object {
       lateinit var stockDetails:StockDetails
        @JvmStatic
        fun newInstance(stockDetails1: StockDetails): DetailBottomSheet {
            stockDetails = stockDetails1
            val fragment = DetailBottomSheet()
            return fragment
        }
    }

}