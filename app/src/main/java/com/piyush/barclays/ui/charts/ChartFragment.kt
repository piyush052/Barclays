package com.piyush.barclays.ui.charts

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
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
    private var interval = "1d"
    private var range = "1mo"
    override fun onErrorCalled(it: String?) {
    }

    override fun initObservers() {
        viewModel.chartLiveData.observe(this, {
            // prepare data
            any_chart_view.setProgressBar(progress_bar)
            val cartesian: Cartesian = AnyChart.financial()
            val data: MutableList<DataEntry> = ArrayList()
            data.clear()
            it.time.forEachIndexed { index, element ->
                // ...
                Log.e(TAG, CommonUtils.getHour(element) + "--initObservers: " + it.value[index])
                data.add(ValueDataEntry(CommonUtils.getHour(element), it.value[index]))
            }
            Log.e("---", "initObservers: "+data.toString(), )

            val column: Column = cartesian.column(data)
            column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(Anchor.CENTER_BOTTOM)
                .offsetX(0.0)
                .offsetY(5.0)
                .format("\${%Value}{groupsSeparator: }")

            cartesian.animation(true)
            cartesian.title("${symbol} History")

            cartesian.yScale().minimum(0.0)

            cartesian.yAxis(0).labels().format("\${%Value}{groupsSeparator: }")

            cartesian.tooltip().positionMode(TooltipPositionMode.POINT)
            cartesian.interactivity().hoverMode(HoverMode.BY_X)

            cartesian.xAxis(0).title("Time")
            cartesian.yAxis(0).title("Price in $")

            any_chart_view.setChart(cartesian)
            any_chart_view.invalidate()

        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChartViewModel::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        callApi ()
    }

    private fun callApi() {
        viewModel.getChartData(symbol, interval, range)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpLoader(viewModel)
        backButton.setOnClickListener {
            if (activity != null) activity!!.onBackPressed()
        }
        filterButton.setOnClickListener {
            showAlertDialogButtonClicked()
        }
    }
    private fun showAlertDialogButtonClicked() {

        // Create an alert builder
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity!!)

        // set the custom layout
        val customLayout: View = layoutInflater
            .inflate(
                R.layout.custom_dialog_layout,
                null
            )
        builder.setView(customLayout)

        val dialog: AlertDialog = builder.create()

       val day1= customLayout.findViewById<RadioButton>(R.id._1day)
       val day5= customLayout.findViewById<RadioButton>(R.id._5day)
       val month6= customLayout.findViewById<RadioButton>(R.id._6months)
       val yr1= customLayout.findViewById<RadioButton>(R.id._1yr)
       val yr5= customLayout.findViewById<RadioButton>(R.id._5yr)
       //val rGrop= customLayout.findViewById<RadioGroup>(R.id.radioGrp)

//        rGrop?.setOnCheckedChangeListener({_,_ ->
//            dialog.dismiss()
//        })

        day1?.setOnClickListener {
            interval = "60m"
            range = "1d"
            callApi()
            dialog.dismiss()
        }
        day5?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, _ ->
            interval = "1d"
            range = "5d"
            callApi()
            dialog.dismiss()
        })
        month6?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            interval = "1d"
            range = "6mo"
            callApi()
            dialog.dismiss()
        })
        yr1?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            interval = "1d"
            range = "1y"
            callApi()
            dialog.dismiss()
        })
        yr5?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            interval = "1d"
            range = "5y"
            callApi()
            dialog.dismiss()
        })

        dialog.show()
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