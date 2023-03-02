package com.msg.gfo_v2.gfo.ui.component.login

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityLoginBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.main.MainActivity
import com.msg.gfo_v2.gfo.ui.component.register.RegisterActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    override fun viewSetting() {
        binding.login = this
    }

    override fun observeEvent() {

    }

    fun onClickPageBtn(view: View) {
        lateinit var act: Class<*>
        when(view.id) {
            binding.btnLogin.id -> {
                act = MainActivity::class.java
                login()
            }
            binding.btnFindPassword.id -> {
                act = FindPasswordActivity::class.java
            }
            binding.btnRegister.id -> {
                act = RegisterActivity::class.java
            }
        }
        val intent = Intent(this, act)
        startActivity(intent)
    }

    private fun login() {

    }
}