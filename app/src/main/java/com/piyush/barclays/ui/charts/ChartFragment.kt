package com.piyush.barclays.ui.charts

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.anychart.AnyChart
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Cartesian
import com.anychart.core.cartesian.series.Column
import com.anychart.enums.Anchor
import com.anychart.enums.HoverMode
import com.anychart.enums.Position
import com.anychart.enums.TooltipPositionMode
import com.piyush.barclays.R
import com.piyush.barclays.base.MyBaseFragment
import com.piyush.barclays.utils.CommonUtils
import kotlinx.android.synthetic.main.fragment_chart.*


class ChartFragment : MyBaseFragment() {

    lateinit var viewModel: ChartViewModel
    override fun onErrorCalled(it: String?) {
    }

    override fun initObservers() {
        viewModel.chartLiveData.observe(this, {
            // prepare data
            any_chart_view.setProgressBar(progress_bar)
            val cartesian: Cartesian = AnyChart.column()
            val data: MutableList<DataEntry> = ArrayList()

            it.time.forEachIndexed { index, element ->
                // ...
                Log.e(TAG, CommonUtils.getHour(element) + "--initObservers: "+it.value[index] )
                data.add(ValueDataEntry(CommonUtils.getHour(element), it.value[index]))

            }


            val column: Column = cartesian.column(data)

            column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(Anchor.CENTER_BOTTOM)
                .offsetX(0.0)
                .offsetY(5.0)
                .format("\${%Value}{groupsSeparator: }")

            cartesian.animation(true)
            cartesian.title("Top 10 Cosmetic Products by Revenue")

            cartesian.yScale().minimum(0.0)

            cartesian.yAxis(0).labels().format("\${%Value}{groupsSeparator: }")

            cartesian.tooltip().positionMode(TooltipPositionMode.POINT)
            cartesian.interactivity().hoverMode(HoverMode.BY_X)

            cartesian.xAxis(0).title("Product")
            cartesian.yAxis(0).title("Revenue")

            any_chart_view.setChart(cartesian)

        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChartViewModel::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getChartData(symbol)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)
        backButton.setOnClickListener {
            if (activity != null) activity!!.onBackPressed()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chart, container, false)
    }

    companion object {
        var symbol = "NMS"
        @JvmStatic
        fun newInstance(sym: String):ChartFragment{
            symbol =sym
           return ChartFragment()
        }
    }
}