package com.piyush.barclays.response.recomondation

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Finance {
    @SerializedName("result")
    @Expose
    var result: List<Result>? = null

    @SerializedName("error")
    @Expose
    var error: Any? = null
}
