package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.base.di.GFOApplication
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class LoginInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response = with(chain) {
        val req =
            request().newBuilder().addHeader("Authorization", "Bearer ${GFOApplication.prefs.accessToken}").build()
        return proceed(req)
    }
}