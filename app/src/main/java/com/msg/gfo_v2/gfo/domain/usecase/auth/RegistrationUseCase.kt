package com.msg.gfo_v2.gfo.domain.usecase.auth

import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.domain.repository.AuthRepository
import javax.inject.Inject

class RegistrationUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(body: RegisterRequest) = kotlin.runCatching {
        repository.postRegistration(body)
    }
}