package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request

import com.google.gson.annotations.SerializedName

data class VerifyCodeRequest(
    @SerializedName("verifyCode")
    var verifyCode: String,
    @SerializedName("email")
    val email: String
)
