package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response

data class RegisterResponse(
    val accessToken: String,
    val refreshToken: String,
    val expiredAt: String
)

