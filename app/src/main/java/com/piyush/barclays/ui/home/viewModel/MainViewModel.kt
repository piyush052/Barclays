package com.piyush.barclays.ui.home.viewModel

import com.piyush.barclays.api.RetrofitManager
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.enums.LoaderStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainViewModel : MyBaseViewModel(){

    fun getStocks() {
        isLoading.postValue(LoaderStatus.loading)
        CoroutineScope(exceptionHandler).launch {
            val request = RetrofitManager.getInstance().getEndPointAPI().getFinanicial("AMRN","US")
            val response = request.await()

            if (isResponseSuccess(response)) {
                val apiResponse = response.body()!!


                isLoading.postValue(LoaderStatus.success)
            }
        }
    }
}