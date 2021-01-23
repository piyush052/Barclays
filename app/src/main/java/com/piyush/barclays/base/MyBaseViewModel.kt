package com.piyush.barclays.base

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.piyush.barclays.enums.LoaderStatus
import com.piyush.barclays.response.ErrorResponse
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import retrofit2.Response
import kotlin.coroutines.CoroutineContext

open class MyBaseViewModel : ViewModel(), CoroutineScope {
    override val coroutineContext: CoroutineContext get() = Dispatchers.IO + rootJob

    protected val TAG: String = this.javaClass.simpleName
    protected var errorLiveData = MutableLiveData<String?>()
    // ...because this is what we'll want to expose
    val errorMediatorLiveData = MediatorLiveData<String?>()
    var isLoading = MutableLiveData<LoaderStatus>()
    private val rootJob = Job()

    init {
        errorMediatorLiveData.addSource(errorLiveData) { result: String? ->
            result?.let {
                errorMediatorLiveData.value = result
            }
        }
    }



    protected val exceptionHandler: CoroutineContext =
        CoroutineExceptionHandler { coroutineContext, throwable ->
            isLoading.postValue(LoaderStatus.failed)
            errorLiveData.postValue(throwable.message)
            throwable.printStackTrace()
        }




    protected fun <T : Any> isResponseSuccess(response: Response<T>): Boolean {
        if (!response.isSuccessful) {
            isLoading.postValue(LoaderStatus.failed)
            if (response.errorBody() != null) {
                val jsonString = response.errorBody()!!.string()
                if (jsonString.contains("{")) {
                    val errorModel = ErrorResponse(jsonString.replace("Response",""))
                    errorLiveData.postValue(errorModel.message)
                } else {
                    errorLiveData.postValue(response.message())
                }
            } else if (response.message().isNotEmpty())
                errorLiveData.postValue(response.message())
        }
        return response.isSuccessful
    }

    override fun onCleared() {
        super.onCleared()
        rootJob.cancel()
    }
}