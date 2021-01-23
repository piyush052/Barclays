package com.piyush.barclays.api

import com.google.gson.GsonBuilder
import com.piyush.barclays.constants.AppConstants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInstance {
    companion object {
        private val interceptor = HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.BODY
        }

        fun getRetrofitInstance(type: HttpClientType? = HttpClientType.default): Retrofit {
            return Retrofit.Builder()
                .baseUrl(AppConstants.baseUrl())
                .client(configureClient(type))
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }

        private fun configureClient(type: HttpClientType?): OkHttpClient {
            when (type) {


                HttpClientType.default -> {
                    val defaultInterceptor = Interceptor { chain ->
                        val request = chain.request().newBuilder()
                            .header(
                                "x-rapidapi-key",
                               "0f6eed49d2msh2c14b335aa0af9dp1a98afjsn9457146ddb08"
                            )
                            .header(
                                "x-rapidapi-host",
                                "apidojo-yahoo-finance-v1.p.rapidapi.com"
                            )
                            .header(
                                "useQueryString",
                                "true"
                            )
                            .build()
                        chain.proceed(request)
                    }

                    return OkHttpClient.Builder().apply {
                        this.addInterceptor(defaultInterceptor)
                            .connectTimeout(AppConstants.CONNECTION_TIME_OUT, TimeUnit.SECONDS)
                            .readTimeout(AppConstants.READ_TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(AppConstants.WRITE_TIME_OUT, TimeUnit.SECONDS)
                    }.build()
                }



                else -> {
                    val defaultInterceptor = Interceptor { chain ->
                        val request = chain.request().newBuilder()
                            // yet to change access token
                            .build()
                        chain.proceed(request)
                    }

                    return OkHttpClient.Builder().apply {
                        this.addInterceptor(defaultInterceptor)
                            .connectTimeout(AppConstants.CONNECTION_TIME_OUT, TimeUnit.SECONDS)
                            .readTimeout(AppConstants.READ_TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(AppConstants.WRITE_TIME_OUT, TimeUnit.SECONDS)
                    }.build()
                }
            }
        }


    }


    fun getRetrofitEndPoint(): ApiEndPoints {
        return getRetrofitInstance().create(ApiEndPoints::class.java)
    }
}