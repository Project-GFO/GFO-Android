package com.msg.gfo_v2.gfo.data.remote.network

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.CommentRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.MyPostResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PostingAPI {

    @POST("posting/comment")
    suspend fun postComment(
        @Body body: CommentRequest
    ): Response<Void>

    @GET("posting/my")
    suspend fun getMyPost(): Response<List<MyPostResponse>>
}