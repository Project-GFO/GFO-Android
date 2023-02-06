package com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response

import java.io.Serializable

data class UserData(
    val email: String,
    val name: String,
    val grade: Int,
    val userImg: String
): Serializable
