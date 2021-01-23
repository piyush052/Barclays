package com.piyush.barclays.response.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class News {
    @SerializedName("uuid")
    @Expose
    var uuid: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("publisher")
    @Expose
    var publisher: String? = null

    @SerializedName("link")
    @Expose
    var link: String? = null

    @SerializedName("providerPublishTime")
    @Expose
    var providerPublishTime: Int? = null

    @SerializedName("type")
    @Expose
    var type: String? = null
}
