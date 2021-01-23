package com.piyush.barclays.ui.charts

import androidx.lifecycle.MutableLiveData
import com.piyush.barclays.api.RetrofitManager
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.enums.LoaderStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class ChartViewModel : MyBaseViewModel() {
    var chartLiveData: MutableLiveData<ChartData> = MutableLiveData()

    fun getChartData(query: String) {
        isLoading.postValue(LoaderStatus.loading)
        CoroutineScope(exceptionHandler).launch {
            val request = RetrofitManager.getInstance().getEndPointAPI().getChartData(
                query,
                "1d",
                "1y",
                "US"
            )
            val response = request.await()

            if (isResponseSuccess(response)) {
                val apiResponse = response.body()!!
                var high : ArrayList<Double> = apiResponse.chart.result[0].indicators.quote[0].high as ArrayList<Double>
                var x :ArrayList<Int> = apiResponse.chart.result[0].timestamp as ArrayList<Int>
                chartLiveData.postValue(ChartData(x, high))
                isLoading.postValue(LoaderStatus.success)
            }
        }
    }



    data class ChartData(val time :ArrayList<Int>, val value:  ArrayList<Double>)
}