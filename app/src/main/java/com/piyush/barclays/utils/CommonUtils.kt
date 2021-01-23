package com.piyush.barclays.utils

import java.text.SimpleDateFormat
import java.util.*

class CommonUtils {
    companion object{
        fun getHour(timeStamp: Int): String {
            val date = Date(timeStamp * 1000L)
//            val jdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val jdf = SimpleDateFormat("yyyy-MM-dd")
            jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"))
            val javaDate: String = jdf.format(date)
            return javaDate
        }
    }
}