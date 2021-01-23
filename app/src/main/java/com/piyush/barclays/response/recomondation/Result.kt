package com.piyush.barclays.response.recomondation

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Result {
    @SerializedName("count")
    @Expose
    var count: Int? = null

    @SerializedName("quotes")
    @Expose
    var quotes: List<Quote>? = null
}