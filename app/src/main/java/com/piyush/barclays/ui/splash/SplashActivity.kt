package com.piyush.barclays.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.piyush.barclays.R
import com.piyush.barclays.constants.AppConstants
import com.piyush.barclays.ui.home.MainActivity

/**
 *
 */
class SplashActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
//                   startActivityForResult(Intent(this@SplashActivity, LoginActivity::class.java),AppConstants.loginResult)
        },3000)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==AppConstants.loginResult){
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }

}