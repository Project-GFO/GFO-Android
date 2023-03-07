package com.msg.gfo_v2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.domain.usecase.auth.RegistrationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val registerUseCase: RegistrationUseCase
): ViewModel() {

    private val _emailRequest = MutableLiveData<String>()
    val emailRequest : LiveData<String> get() = _emailRequest

    private fun emailRequest(email: String){
        _emailRequest.value = email
    }

    private val _nameRequest = MutableLiveData<String>()
    val nameRequest : LiveData<String> get() = _nameRequest

    private fun nameRequest(name: String){
        _nameRequest.value = name
    }

    private val _passwordRequest = MutableLiveData<String>()
    val passwordRequest : LiveData<String> get() = _passwordRequest

    private fun passwordRequest(password: String){
        _passwordRequest.value = password
    }

    fun login(clientInfo: RegisterRequest){
        viewModelScope.launch {
            registerUseCase.postRegistration(clientInfo)
        }
    }

}