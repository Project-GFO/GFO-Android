package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.UserInfoResponse
import retrofit2.Response
import retrofit2.http.*

interface UserAPI {

    @GET("user/my")
    suspend fun getUserInfo(): Response<UserInfoResponse>

    @DELETE("user")
    suspend fun deleteUser(): Response<Unit>
}