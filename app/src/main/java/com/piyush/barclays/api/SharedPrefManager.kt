package com.piyush.barclays.api

import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.piyush.barclays.constants.AppConstants
import com.piyush.barclays.models.Watchlist


class SharedPrefManager private constructor(context: Context) : ContextWrapper(context) {

    companion object {
        private const val PREFERENCE_FILE = "BarclaysPref"
        private lateinit var INSTANCE: SharedPrefManager
        private lateinit var sharedPreferences: SharedPreferences
        private var isInitialized = false

        fun getInstance(context: Context): SharedPrefManager {
            if (!isInitialized) {
                isInitialized = true
                initManager(context)
            }
            return INSTANCE;
        }

        private fun initManager(context: Context) {
            sharedPreferences = context.getSharedPreferences(
                PREFERENCE_FILE, Context.MODE_PRIVATE
            )
            INSTANCE = SharedPrefManager(context)
        }
    }

    fun getWatchListData(): HashMap<String, Watchlist> {
        val storedHashMapString:String? = sharedPreferences.getString(
            AppConstants.WATCHLIST_DATA, ""
        )
        if(storedHashMapString.isNullOrEmpty()){
            return HashMap<String, Watchlist>()
        }

        val type = object : TypeToken<HashMap<String?, Watchlist>?>() {}.type
        return Gson().fromJson(storedHashMapString, type)
    }


    fun setWatchListData(data: HashMap<String, Watchlist>) {
        val da = Gson().toJson(data)
        getInstance(baseContext).setPreference(AppConstants.WATCHLIST_DATA, da)
    }


    fun getBooleanPreference(key: String): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }

    fun removePreference(key: String) {
        val editor = sharedPreferences.edit()
        editor.remove(key)
        editor.apply()
    }

    fun setPreference(key: String, value: String?) {
        value?.let {
            val editor = sharedPreferences.edit()
            editor.putString(key, it)
            editor.apply()
        }
    }

    fun setPreference(pref: String, trueOrFalse: Boolean) {
        val edit = sharedPreferences.edit()
        edit.putBoolean(pref, trueOrFalse)
        edit.apply()
    }

    fun setPreference(key: String, value: Long) {
        val editor = sharedPreferences.edit()
        editor.putLong(key, value)
        editor.apply()
    }

    fun setPreference(key: String, value: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun setPreference(key: String, value: Double) {
        val editor = sharedPreferences.edit()
        editor.putLong(key, java.lang.Double.doubleToRawLongBits(value))
        editor.apply()
    }

    fun clearPreference() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun getPreferenceDefNull(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun getPreference(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun getLongPreference(key: String): Long {
        return sharedPreferences.getLong(key, 0)
    }

    fun getIntPreference(key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }

    fun getFloatPreference(key: String): Float {
        return sharedPreferences.getFloat(key, 0f)
    }

    fun getDoublePreference(key: String, value: Double): Double {
        // SharedPreferences.Editor editor = sharedPreferences.edit();
        return java.lang.Double.longBitsToDouble(
            sharedPreferences.getLong(
                key,
                java.lang.Double.doubleToRawLongBits(value)
            )
        )
    }

    fun getContainsPreference(key: String): Boolean {
        return sharedPreferences.contains(key)
    }

    fun removeAll() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }
}