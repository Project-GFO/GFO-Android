package com.msg.gfo_v2.gfo.data.remote.datasource

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.CommentRequest
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.response.MyPostResponse
import com.msg.gfo_v2.gfo.data.remote.network.PostingAPI
import retrofit2.Response
import javax.inject.Inject

class PostDataSourceImpl @Inject constructor(
    private val service: PostingAPI
): PostDataSource {
    override suspend fun postComment(body: CommentRequest): Response<Void> {
        return service.postComment(body)
    }

    override suspend fun getMyPost(ty: String): Response<List<MyPostResponse>> {
        return service.getMyPost(ty)
    }
}