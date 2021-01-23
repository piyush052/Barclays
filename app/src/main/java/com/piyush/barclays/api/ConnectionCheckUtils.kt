package com.piyush.barclays.api

import android.content.Context
import android.net.ConnectivityManager

object ConnectionCheckUtils {

    fun checkOnline(ctx : Context) : Boolean{
        return try {
            val cm = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            netInfo != null && netInfo.isConnected
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
}
