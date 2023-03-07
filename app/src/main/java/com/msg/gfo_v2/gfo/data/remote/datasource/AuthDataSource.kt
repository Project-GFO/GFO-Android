package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.*
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.*
import retrofit2.Response

interface AuthDataSource {
    suspend fun postRegistration(body : RegisterRequest): Response<Unit>

    suspend fun postLogin(body: LoginRequest): Response<LoginResponse>

    suspend fun headCheckCode(email: String, code: String): Response<Unit>

    suspend fun postVerifyCode(body: VerifyCodeRequest): Response<Unit>

    suspend fun postLogout(): Response<Unit>

    suspend fun postRefresh(): Response<RegisterResponse> }