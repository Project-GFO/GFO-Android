package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request

import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("email")
    var email: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("password")
    var password: String,
)
