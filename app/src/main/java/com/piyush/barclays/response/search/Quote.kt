package com.piyush.barclays.response.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Quote {
    @SerializedName("exchange")
    @Expose
    var exchange: String? = null

    @SerializedName("shortname")
    @Expose
    var shortname: String? = null

    @SerializedName("quoteType")
    @Expose
    var quoteType: String? = null

    @SerializedName("symbol")
    @Expose
    var symbol: String? = null

    @SerializedName("index")
    @Expose
    var index: String? = null

    @SerializedName("score")
    @Expose
    var score: Double? = null

    @SerializedName("typeDisp")
    @Expose
    var typeDisp: String? = null

    @SerializedName("longname")
    @Expose
    var longname: String? = null

    @SerializedName("isYahooFinance")
    @Expose
    var isYahooFinance: Boolean? = null
}
