package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request

import com.google.gson.annotations.SerializedName

data class CodeIssuanceRequest(
    @SerializedName("email")
    val email: String
)