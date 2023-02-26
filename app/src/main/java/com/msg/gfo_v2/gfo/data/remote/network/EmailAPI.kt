package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.VerifyCodeRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.HEAD
import retrofit2.http.POST
import retrofit2.http.Query

interface EmailAPI {

    @POST("email/verify")
    suspend fun postVerifyCode(
        @Body body: VerifyCodeRequest
    ): Response<Unit>

    @HEAD("email")
    suspend fun headCheckCode(
        @Query("email") email: String,
        @Query("code") code: String
    ): Response<Void>
}