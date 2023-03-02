package com.msg.gfo_v2.gfo.ui.component.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.msg.gfo_v2.R
import com.msg.gfo_v2.gfo.ui.component.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}