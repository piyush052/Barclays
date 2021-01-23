package com.piyush.barclays.api

import com.piyush.barclays.response.chart.ChartResponse
import com.piyush.barclays.response.recomondation.Recomondation
import com.piyush.barclays.response.search.Search
import com.piyush.barclays.response.stockDetails.StockDetails
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndPoints {
    @GET("/get-histories")
    fun getHistorys(): Deferred<Response<Any>>

    @GET("/v2/get-financials")
    fun getFinanicial(
        @Query("symbol") symbol: String,
        @Query("region") region: String
    ): Deferred<Response<Any>>

    @GET("stock/v2/get-recommendations")
    fun getRecommendation(@Query("symbol") symbol: String): Deferred<Response<Recomondation>>

    @GET("auto-complete")
    fun searchStocks(@Query("q") query: String,  @Query("region") region: String): Deferred<Response<Search>>

    @GET("stock/v2/get-profile")
    fun getStockDetails(@Query("symbol") symbol: String,  @Query("region") region: String): Deferred<Response<StockDetails>>

 @GET("market/get-charts")
    fun getChartData(
     @Query("symbol") symbol: String,
     @Query("interval") interval: String,
     @Query("range") range: String,
                     @Query("region") region: String)
    : Deferred<Response<ChartResponse>>

}