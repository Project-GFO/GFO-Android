package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.CodeIssuanceRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.RegisterResponse
import com.msg.gfo_v2.gfo.data.remote.network.CommonAPI
import retrofit2.Response
import javax.inject.Inject

class CommonDataSourceImpl @Inject constructor(
    private val service: CommonAPI
) : CommonDataSource {
    override suspend fun postRegistration(body: RegisterRequest): Response<RegisterResponse> {
        return service.postRegistration(body)
    }

    override suspend fun postEmail(body: CodeIssuanceRequest): Response<Void> {
        TODO("Not yet implemented")
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