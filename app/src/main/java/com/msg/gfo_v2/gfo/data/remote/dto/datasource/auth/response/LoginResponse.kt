package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String,
    @SerializedName("expiredAt")
    val expiredAt: String
)
