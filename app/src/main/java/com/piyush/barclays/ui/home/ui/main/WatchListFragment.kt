package com.piyush.barclays.ui.home.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.piyush.barclays.R
import com.piyush.barclays.base.MyBaseFragment
import com.piyush.barclays.ui.home.viewModel.WatchListViewModel
import com.piyush.barclays.ui.search.SearchViewModel
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.emptyText
import kotlinx.android.synthetic.main.fragment_watch_list.*

class WatchListFragment : MyBaseFragment() {
    private lateinit var viewModel : WatchListViewModel

    override fun onErrorCalled(it: String?) {
    }

    override fun initObservers() {
        viewModel.emptyLiveData.observe(this, {
            emptyText.visibility = View.VISIBLE
            watchListRecyclerView.visibility = View.GONE
            watchListSearchET.visibility = View.GONE
        })

        viewModel.watchListViewModel.observe(this, {
            emptyText.visibility = View.GONE
            watchListRecyclerView.visibility = View.VISIBLE
            watchListSearchET.visibility = View.VISIBLE
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =  ViewModelProvider(this).get(WatchListViewModel::class.java)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)
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
}