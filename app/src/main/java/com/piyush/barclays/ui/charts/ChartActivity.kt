package com.piyush.barclays.ui.charts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.piyush.barclays.R
import com.piyush.barclays.constants.AppConstants

class ChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)
        val symbol = intent.getStringExtra(AppConstants.SYMBOL)
        if (symbol != null) {
            loadFragment(symbol)
        } else {
            loadFragment("NMS")
        }
    }

    private fun loadFragment(symbol: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = ChartFragment.newInstance(symbol)
        fragmentTransaction.add(R.id.main_frame, fragment)
        fragmentTransaction.commit()
    }
}