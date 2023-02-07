package com.msg.gfo_v2.gfo.data.remote.datasource

interface UserDataSource {
    suspend fun getUserInfo()
}