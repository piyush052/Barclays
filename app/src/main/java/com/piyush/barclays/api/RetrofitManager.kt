package com.piyush.barclays.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.piyush.barclays.constants.AppConstants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitManager private constructor() {

    companion object {
        private var INSTANCE: RetrofitManager? = null

        private var defaultRetrofit: Retrofit? = null

        fun getInstance(): RetrofitManager {
            if (INSTANCE == null) {
                initManager()
            }
            return INSTANCE!!
        }

        private fun initManager() {
            INSTANCE = RetrofitManager()
        }
    }

    fun getDefaultRetrofit(): Retrofit {

        val interceptor = Interceptor { chain ->
            val request = chain.request().newBuilder()
                .header("x-rapidapi-key", "0f6eed49d2msh2c14b335aa0af9dp1a98afjsn9457146ddb08")
                .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .build()
            chain.proceed(request)
        }

        val httpClient: OkHttpClient.Builder =
            OkHttpClient.Builder().addInterceptor(interceptor)
                // .addInterceptor(ConnectivityInterceptor(baseContext))
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(200, TimeUnit.SECONDS);

        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        httpClient.addInterceptor(logInterceptor)



        defaultRetrofit = Retrofit.Builder()
            .baseUrl(AppConstants.baseUrl())// + context.getString(R.string.url_version))
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(httpClient.build())
            .build()

        return defaultRetrofit!!
    }

    fun getEndPointAPI(): ApiEndPoints {
        return getDefaultRetrofit().create(ApiEndPoints::class.java)
    }

}