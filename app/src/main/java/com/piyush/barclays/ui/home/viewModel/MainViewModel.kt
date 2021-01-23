package com.piyush.barclays.ui.home.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.piyush.barclays.api.RetrofitManager
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.enums.LoaderStatus
import com.piyush.barclays.response.recomondation.Quote
import com.piyush.barclays.response.recomondation.Recomondation

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : MyBaseViewModel() {

    var recomondationLiveData: MutableLiveData<ArrayList<Quote>> = MutableLiveData()
    var emptyLiveData: MutableLiveData<Boolean> = MutableLiveData()


    fun getStocks() {
        isLoading.postValue(LoaderStatus.loading)
        CoroutineScope(exceptionHandler).launch {
            val request = RetrofitManager.getInstance().getEndPointAPI().getFinanicial("AMRN", "US")
            val response = request.await()

            if (isResponseSuccess(response)) {
                val apiResponse = response.body()!!
                isLoading.postValue(LoaderStatus.success)
            }
        }
    }

    fun getRecommendation() {
        isLoading.postValue(LoaderStatus.loading)
        CoroutineScope(exceptionHandler).launch {
            val request = RetrofitManager.getInstance().getEndPointAPI().getRecommendation("INTC")
            val response: Response<Recomondation> = request.await() // different thread
            Log.e(TAG, "getRecommendation: ")

            if (isResponseSuccess(response)) {
                val apiResponse = response.body()!!
                val quote: ArrayList<Quote>? = apiResponse.finance?.result?.get(0)?.quotes as ArrayList<Quote>?
                if(quote?.size!! >0)
                recomondationLiveData.postValue(quote)
                else
                    emptyLiveData.postValue(true)
                isLoading.postValue(LoaderStatus.success)
            }
        }
    }


}