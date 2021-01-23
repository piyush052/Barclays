package com.piyush.barclays.ui.search

import androidx.lifecycle.MutableLiveData
import com.piyush.barclays.api.RetrofitManager
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.constants.AppConstants
import com.piyush.barclays.enums.LoaderStatus
import com.piyush.barclays.response.search.Quote
import com.piyush.barclays.response.stockDetails.StockDetails
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SearchViewModel : MyBaseViewModel() {
    var searchLiveData: MutableLiveData<ArrayList<Quote>> = MutableLiveData()
    var emptyLiveData: MutableLiveData<String> = MutableLiveData()
     var searchJob : Job? = null

    fun searchStocks(query: String) {
       isLoading.postValue(LoaderStatus.loading)
        searchJob =   CoroutineScope(exceptionHandler).launch {
            val request = RetrofitManager.getInstance().getEndPointAPI().searchStocks(query, "US")
            val response = request.await()

            if (isResponseSuccess(response)) {
                val apiResponse = response.body()!!
                val quote: ArrayList<Quote>? = apiResponse.quotes as ArrayList<Quote>?
                if(quote?.size!! >0) {
                    searchLiveData.postValue(quote)
                }else{
                    emptyLiveData.postValue(AppConstants.OOPs)
                }
                isLoading.postValue(LoaderStatus.success)
            }
        }
    }


}