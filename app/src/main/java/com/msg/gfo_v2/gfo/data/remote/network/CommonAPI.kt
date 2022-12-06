package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.RegisterResponse
import retrofit2.Response
import retrofit2.http.*

interface CommonAPI {

    @POST("auth/signup")
    suspend fun postRegistration(
        @Body body : RegisterRequest
    ) : Response<RegisterResponse>
}