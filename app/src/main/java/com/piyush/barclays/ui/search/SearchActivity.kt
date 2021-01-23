package com.piyush.barclays.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.piyush.barclays.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        loadFragment()
    }

    private fun loadFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = SearchFragment.newInstance()
        fragmentTransaction.add(R.id.main_frame, fragment)
        fragmentTransaction.commit()
    }
}