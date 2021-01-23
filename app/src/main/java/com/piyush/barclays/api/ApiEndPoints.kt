package com.piyush.barclays.api

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndPoints {
    @GET("/get-histories")
    fun getHistorys()  : Deferred<Response<Any>>

    @GET("/v2/get-financials")
    fun getFinanicial(@Query("symbol") symbol:String, @Query("region") region:String )  : Deferred<Response<Any>>

}