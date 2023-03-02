package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.CommentRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.MyPostResponse
import retrofit2.Response

interface PostDataSource {
    suspend fun postComment(body: CommentRequest): Response<Unit>

    suspend fun getMyPost(ty: String): Response<List<MyPostResponse>>
}