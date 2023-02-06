package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.*
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.*
import com.msg.gfo_v2.gfo.data.remote.network.AuthAPI
import retrofit2.Response
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val service: AuthAPI
) : AuthDataSource {
    override suspend fun postRegistration(body: RegisterRequest): Response<RegisterResponse> {
        return service.postRegistration(body)
    }

    override suspend fun postLogin(body: LoginRequest): Response<LoginResponse> {
        return service.postLogin(body)
    }

    override suspend fun headCheckCode(email: String, code: String): Response<Void> {
        TODO("Not yet implemented")
    }

    override suspend fun postLogout(): Response<Void> {
        TODO("Not yet implemented")
    }

    override suspend fun postRefresh(): Response<RegisterResponse> {
        TODO("Not yet implemented")
    }

}