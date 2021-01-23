package com.piyush.barclays.ui.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.piyush.barclays.R
import com.piyush.barclays.adapters.SearchAdapter
import com.piyush.barclays.base.MyBaseFragment
import com.piyush.barclays.response.search.Quote
import com.piyush.barclays.ui.details.DetailBottomSheet
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : MyBaseFragment(), SearchAdapter.ItemClickListener {

    private lateinit var viewModel: SearchViewModel

    private val searchList: ArrayList<Quote> = ArrayList()
    private var searchAdapter: SearchAdapter? = null
    override fun onErrorCalled(it: String?) {
       // emptyText.visibility = View.VISIBLE
    }

    override fun initObservers() {
        viewModel.searchLiveData.observe(this, {
            searchList.clear()
            searchList.addAll(it)
            emptyText.visibility = View.GONE
            searchRecyclerView.visibility = View.VISIBLE
            searchAdapter?.notifyDataSetChanged()
        })

        viewModel.emptyLiveData.observe(this, {
            emptyText.visibility = View.VISIBLE
            searchRecyclerView.visibility = View.GONE
            emptyText.text = it

        })
        viewModel.stockDetailsLiveData.observe(this, {
            super.hideProgress()
            val stockDetails = it
            activity!!.supportFragmentManager.let {
                DetailBottomSheet.newInstance(stockDetails).apply {
                    show(it, tag)
                }
            }

        })

    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        super.hideProgress()
        progressBar.visibility = View.GONE
        hideKeyboard()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    private fun initView() {
        initEditText()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val linearLayoutManager = LinearLayoutManager(
            activity!!,
            LinearLayoutManager.VERTICAL,
            false
        )
        searchRecyclerView.layoutManager = linearLayoutManager
        searchAdapter = SearchAdapter(searchList, this)
        searchRecyclerView.adapter = searchAdapter
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initEditText() {

        searchET.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().length > 2) {
                    val bool = viewModel.searchJob?.isActive
                    if (bool == true) {
                        viewModel.searchJob?.cancel()
                    }
                    viewModel.searchStocks(p0.toString())
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
//        searchET.setOnTouchListener(OnTouchListener { v, event ->
//            val DRAWABLE_LEFT = 0
//            if (event.action == MotionEvent.ACTION_UP) {
//                if (event.rawX >= searchET.left - searchET.getCompoundDrawables()
//                        .get(DRAWABLE_LEFT).getBounds().width()
//                ) {
//                    // your action here
//                    activity?.onBackPressed()
//                    return@OnTouchListener true
//                }
//            }
//            false
//        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = SearchFragment()
    }

    override fun onClick(position: Int) {
        val item = searchList[position]
        super.showProgress()
        item.exchange?.let { viewModel.searchStockDetails(it) }
    }
}