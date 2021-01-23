package com.piyush.barclays.response

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class ErrorResponse(jsonString:String){
    @SerializedName("status")
    var errorCode: String? = null
    @SerializedName("message")
    var message: String? = null

    init {
        val jsonObject = JSONObject(jsonString)
        if(jsonObject.has("message"))
            message = jsonObject.getString("message")
        if(jsonObject.has("status"))
            errorCode = jsonObject.getString("status")
    }
}