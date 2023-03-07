package com.msg.gfo_v2.gfo.ui.component.register

import android.view.View
import androidx.activity.viewModels
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityRegisterBinding
import com.msg.gfo_v2.gfo.data.remote.dto.datasource.auth.request.RegisterRequest
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.viewmodel.RegistrationViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
    private val registerViewModel by viewModels<RegistrationViewModel>()

    override fun viewSetting() {
        binding.goBack = this

    }

    override fun observeEvent() {
        binding.btnRegister.setOnClickListener{
            isNameConfirmed()
        }
    }
    fun onClickPageBtn(view : View){
        finish()
    }

    private fun isNameConfirmed(){
        if(!binding.etName.text.toString().isNullOrBlank()){
            isEmailConfirmed()
        }
    }
    private fun isEmailConfirmed(){
        if(!binding.etEmail.text.toString().isNullOrBlank()){
            isPasswordConfirmed()
        }
    }
    private fun isPasswordConfirmed(){
        var password = binding.etPassword.text.toString()
        var newPassword = binding.etPasswordRe.text.toString()
        if(password == newPassword && !password.isNullOrBlank()){
            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val userInfo = RegisterRequest(
                name,
                email,
                password,
                " ",
                0
            )
            registerViewModel.login(userInfo)
        }
    }

}


