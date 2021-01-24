package com.piyush.barclays.ui.home.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.piyush.barclays.R
import com.piyush.barclays.adapters.RecommendationAdapter
import com.piyush.barclays.base.MyBaseFragment
import com.piyush.barclays.response.recomondation.Quote
import com.piyush.barclays.ui.home.viewModel.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : MyBaseFragment(), RecommendationAdapter.ItemClickListener {

    private val recomondationList : ArrayList<Quote> = ArrayList()
    private var recomendationAdapter: RecommendationAdapter? = null

    private lateinit var pageViewModel: PageViewModel
    override fun onErrorCalled(it: String?) {
        Log.e(TAG, "onErrorCalled: " )
    }

    override fun initObservers() {
        viewModel.recomondationLiveData.observe(this, Observer {
            if(activity!=null){
            recomondationList.clear()
            recomondationList.addAll(it)
            homeRecyclerView.visibility= View.VISIBLE
            emptyTextFra.visibility = View.GONE
            recomendationAdapter?.notifyDataSetChanged()
            }

        })
        viewModel.emptyLiveData.observe(this, Observer {
            homeRecyclerView.visibility= View.GONE
            emptyTextFra.visibility = View.VISIBLE
        })
    }

    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)
        initViews()

    }

    private fun initViews() {
        val linearLayoutManager = LinearLayoutManager(
            activity!!,
            LinearLayoutManager.VERTICAL,
            false
        )
        homeRecyclerView.layoutManager = linearLayoutManager
        recomendationAdapter = RecommendationAdapter(activity!!,recomondationList, this)
        homeRecyclerView.adapter = recomendationAdapter


    }

    override fun onResume() {
        super.onResume()
        //viewModel.getRecommendation()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
       viewModel =  ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)


        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onClick(position: Int) {
        val item = recomondationList[position]
        super.showProgress()
        item.symbol?.let { viewModel.searchStockDetails(it) }
    }
}