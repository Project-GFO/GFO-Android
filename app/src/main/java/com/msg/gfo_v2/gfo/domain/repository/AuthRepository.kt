package com.msg.gfo_v2.gfo.domain.repository

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import retrofit2.Response

interface AuthRepository {
    suspend fun postRegistration(
        body: RegisterRequest
    ): Response<Unit>
}