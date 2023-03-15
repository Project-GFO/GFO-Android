package com.msg.gfo_v2.gfo.data.remote.network

import android.util.Log
import com.msg.gfo_v2.gfo.base.di.GFOApplication
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class LoginInterceptor @Inject constructor(): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response = with(chain) {
        val request = chain.request()
        val response = chain.proceed(request)
        when(response.code()){
            201 -> {
                Log.d("response.code", response.code().toString())
            }
            409 -> {
                Log.d("response.code", response.code().toString())
            }
        }
        return response
    }
}