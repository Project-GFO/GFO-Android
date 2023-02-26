package com.msg.gfo_v2.gfo.base.di

import android.app.Application
import com.msg.gfo_v2.gfo.data.local.dao.LoginToken
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GFOApplication : Application() {
    companion object{
        lateinit var prefs : LoginToken
    }

    override fun onCreate() {
        super.onCreate()
        prefs = LoginToken(applicationContext)
    }
}