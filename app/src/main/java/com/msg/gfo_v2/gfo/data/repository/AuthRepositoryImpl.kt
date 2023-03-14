package com.msg.gfo_v2.gfo.data.repository

import com.msg.gfo_v2.gfo.data.remote.datasource.AuthDataSourceImpl
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.domain.repository.AuthRepository
import retrofit2.Response
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val datasource: AuthDataSourceImpl
): AuthRepository {
    override suspend fun postRegistration(body: RegisterRequest): Response<Unit> {
        return datasource.postRegistration(body = body)
    }
}