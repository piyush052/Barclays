package com.piyush.barclays.constants

object AppConstants {
    val SYMBOL = "SYMBOL"
    val OOPs: String= "OOPs did not find anything!!\n try something new :)"
    val LOGIN_ACCESS_TOKEN: String= ""
    const val loginResult = 1001

    const val STAGE_URL = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/"
    const val PROD_URL = "https://apidojo-yahoo-finance-v1.p.rapidapi.com/"
   // https://apidojo-yahoo-finance-v1.p.rapidapi.com/auto-complete
    private val APP_CONFIG_TYPE =  Config.PROD

    val CONNECTION_TIME_OUT : Long = 30
    val READ_TIME_OUT: Long= 20
    val WRITE_TIME_OUT: Long = 25


    fun baseUrl(): String {
        return when(APP_CONFIG_TYPE) {
            Config.PROD -> PROD_URL
            Config.DEV  -> STAGE_URL
        }
    }
    private enum class Config {
        PROD, DEV
    }
}