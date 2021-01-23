package com.piyush.barclays.response.recomondation

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Quote {
    @SerializedName("language")
    @Expose
    var language: String? = null

    @SerializedName("region")
    @Expose
    var region: String? = null

    @SerializedName("quoteType")
    @Expose
    var quoteType: String? = null

    @SerializedName("triggerable")
    @Expose
    var triggerable: Boolean? = null

    @SerializedName("quoteSourceName")
    @Expose
    var quoteSourceName: String? = null

    @SerializedName("shortName")
    @Expose
    var shortName: String? = null

    @SerializedName("regularMarketPrice")
    @Expose
    var regularMarketPrice: Double? = null

    @SerializedName("regularMarketTime")
    @Expose
    var regularMarketTime: Int? = null

    @SerializedName("regularMarketChange")
    @Expose
    var regularMarketChange: Double? = null

    @SerializedName("exchange")
    @Expose
    var exchange: String? = null

    @SerializedName("postMarketChangePercent")
    @Expose
    var postMarketChangePercent: Double? = null

    @SerializedName("postMarketTime")
    @Expose
    var postMarketTime: Int? = null

    @SerializedName("postMarketPrice")
    @Expose
    var postMarketPrice: Double? = null

    @SerializedName("postMarketChange")
    @Expose
    var postMarketChange: Double = 0.0

    @SerializedName("regularMarketChangePercent")
    @Expose
    var regularMarketChangePercent: Double? = null

    @SerializedName("regularMarketPreviousClose")
    @Expose
    var regularMarketPreviousClose: Double? = null

    @SerializedName("fullExchangeName")
    @Expose
    var fullExchangeName: String? = null

    @SerializedName("sourceInterval")
    @Expose
    var sourceInterval: Int? = null

    @SerializedName("exchangeTimezoneName")
    @Expose
    var exchangeTimezoneName: String? = null

    @SerializedName("exchangeTimezoneShortName")
    @Expose
    var exchangeTimezoneShortName: String? = null

    @SerializedName("market")
    @Expose
    var market: String? = null

    @SerializedName("gmtOffSetMilliseconds")
    @Expose
    var gmtOffSetMilliseconds: Int? = null

    @SerializedName("esgPopulated")
    @Expose
    var esgPopulated: Boolean? = null

    @SerializedName("tradeable")
    @Expose
    var tradeable: Boolean? = null

    @SerializedName("marketState")
    @Expose
    var marketState: String? = null

    @SerializedName("exchangeDataDelayedBy")
    @Expose
    var exchangeDataDelayedBy: Int? = null

    @SerializedName("priceHint")
    @Expose
    var priceHint: Int? = null

    @SerializedName("symbol")
    @Expose
    var symbol: String? = null
}