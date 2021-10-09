package com.vitaly.vivalapizza.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vitaly.vivalapizza.R
import kotlinx.coroutines.*

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        GlobalScope.launch(Dispatchers.IO) {
            delay(3000)
            withContext(Dispatchers.Main) {
                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            }
        }
    }
}