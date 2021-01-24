package com.piyush.barclays.ui.home.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.piyush.barclays.R
import com.piyush.barclays.adapters.RecommendationAdapter
import com.piyush.barclays.adapters.WatchListAdapter
import com.piyush.barclays.api.SharedPrefManager
import com.piyush.barclays.base.MyBaseFragment
import com.piyush.barclays.models.Watchlist
import com.piyush.barclays.response.recomondation.Quote
import com.piyush.barclays.ui.home.viewModel.WatchListViewModel
import com.piyush.barclays.ui.search.SearchViewModel
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.emptyText
import kotlinx.android.synthetic.main.fragment_watch_list.*

class WatchListFragment : MyBaseFragment(), RecommendationAdapter.ItemClickListener {
    private lateinit var viewModel: WatchListViewModel

    private val watchList: ArrayList<Watchlist> = ArrayList()
    private val cloneWatchList: ArrayList<Watchlist> = ArrayList()
    private var watchListAdapter: WatchListAdapter? = null

    override fun onErrorCalled(it: String?) {
    }

    override fun initObservers() {
        viewModel.emptyLiveData.observe(this, {
            emptyText.visibility = View.VISIBLE
            watchListRecyclerView.visibility = View.GONE
            watchListSearchET.visibility = View.GONE
        })

        viewModel.watchListViewModel.observe(this, {
            if (activity != null) {
                emptyText.visibility = View.GONE
                watchListRecyclerView.visibility = View.VISIBLE
                watchListSearchET.visibility = View.VISIBLE
                watchList.clear()
                watchList.addAll(it)
                watchListAdapter?.notifyDataSetChanged()
            }
        })

        viewModel.cloneListViewModel.observe(this, {
            if (activity != null) {
                cloneWatchList.clear()
                cloneWatchList.addAll(it)
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WatchListViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)
        initViews()


    }

    override fun onResume() {
        super.onResume()
        if (activity != null)
            viewModel.getWatchListData(SharedPrefManager.getInstance(activity!!).getWatchListData())
    }

    private fun initViews() {
        val linearLayoutManager = LinearLayoutManager(
            activity!!,
            LinearLayoutManager.VERTICAL,
            false
        )
        watchListRecyclerView.layoutManager = linearLayoutManager
        watchListAdapter = WatchListAdapter(activity!!, watchList, this)
        watchListRecyclerView.adapter = watchListAdapter

        initEditText()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_watch_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = WatchListFragment()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initEditText() {

        watchListSearchET.addTextChangedListener(object : TextWatcher {
            val searchWatchList: ArrayList<Watchlist> = ArrayList()
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().length >= 2) {
                    searchWatchList.clear()
                    cloneWatchList.forEach {
                        if (it.cName != null && it.cName.toLowerCase().contains(p0.toString().toLowerCase())){
                           searchWatchList.add(it)
                        }
                    }
                    viewModel.filterWatchList(searchWatchList)
                }else if(p0.toString().isEmpty()){
                    viewModel.filterWatchList(cloneWatchList)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
    }


    override fun onClick(position: Int) {
        val item = watchList[position]
        if (item.symbol == null) {
            showSnackbar(resources.getString(R.string.could_not))
        } else {
            super.showProgress()
            item.symbol.let { viewModel.searchStockDetails(it) }
        }

    }
}