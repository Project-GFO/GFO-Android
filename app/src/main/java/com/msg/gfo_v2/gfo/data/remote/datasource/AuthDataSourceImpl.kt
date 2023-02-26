package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.*
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.*
import com.msg.gfo_v2.gfo.data.remote.network.AuthAPI
import com.msg.gfo_v2.gfo.data.remote.network.EmailAPI
import retrofit2.Response
import javax.inject.Inject

class AuthDataSourceImpl @Inject constructor(
    private val authService: AuthAPI,
    private val emailService: EmailAPI
) : AuthDataSource {
    override suspend fun postRegistration(body: RegisterRequest): Response<RegisterResponse> {
        return authService.postRegistration(body)
    }

    override suspend fun postLogin(body: LoginRequest): Response<LoginResponse> {
        return authService.postLogin(body)
    }

    override suspend fun headCheckCode(email: String, code: String): Response<Void> {
        return emailService.headCheckCode(email, code)
    }

    override suspend fun postVerifyCode(body: VerifyCodeRequest): Response<Void> {
        return emailService.postVerifyCode(body)
    }

    override suspend fun postLogout(): Response<Void> {
        TODO("Not yet implemented")
    }

    override suspend fun postRefresh(): Response<RegisterResponse> {
        TODO("Not yet implemented")
    }

}