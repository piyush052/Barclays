package com.piyush.barclays.response.recomondation

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Recomondation {
    @SerializedName("finance")
    @Expose
    var finance: Finance? = null
}