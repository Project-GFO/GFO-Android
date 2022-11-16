package com.msg.gfo_v2.gfo.ui.component.login

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityLoginBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    override fun viewSetting() {

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
        }
        val intent = Intent(this, act)
        startActivity(intent)
    }

    private fun login() {

    }
}