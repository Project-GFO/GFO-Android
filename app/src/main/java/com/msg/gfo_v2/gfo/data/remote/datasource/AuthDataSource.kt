package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.CodeIssuanceRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.RegisterResponse
import retrofit2.Response

interface AuthDataSource {
    suspend fun postRegistration(body : RegisterRequest): Response<RegisterResponse>

    suspend fun postEmail(body: CodeIssuanceRequest): Response<Void>

    suspend fun headCheckCode(email: String, code: String): Response<Void>

    suspend fun postLogout(): Response<Void>

    suspend fun postRefresh(): Response<RegisterResponse>
}