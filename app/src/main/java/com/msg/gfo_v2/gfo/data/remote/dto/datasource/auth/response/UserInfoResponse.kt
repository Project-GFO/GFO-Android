package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response

import com.google.gson.annotations.SerializedName

data class UserInfoResponse(
    @SerializedName("userData")
    val userData: UserData
)
