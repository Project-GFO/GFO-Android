package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request

import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @SerializedName("id")
    var id: String,
    @SerializedName("password")
    var password: String
)