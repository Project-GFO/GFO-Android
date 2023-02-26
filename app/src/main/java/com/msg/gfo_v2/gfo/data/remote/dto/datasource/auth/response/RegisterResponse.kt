package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("refreshToken")
    val refreshToken: String,
    @SerializedName("expiredAt")
    val expiredAt: String
)

