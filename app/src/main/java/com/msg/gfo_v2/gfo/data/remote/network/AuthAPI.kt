package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.LoginRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.LoginResponse
import retrofit2.Response
import retrofit2.http.*

interface AuthAPI {

    @POST("auth/signup")
    suspend fun postRegistration(
        @Body body: RegisterRequest
    ): Response<Unit>


    @POST("auth")
    suspend fun postLogin(
        @Body body: LoginRequest
    ): Response<LoginResponse>

}