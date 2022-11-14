package com.msg.gfo_v2.gfo.ui.component.intro

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityIntroBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.login.LoginActivity
import com.msg.gfo_v2.gfo.ui.component.register.RegisterActivity

class IntroActivity : BaseActivity<ActivityIntroBinding>(R.layout.activity_intro) {
    override fun viewSetting() {
        binding.login = this
    }

    override fun observeEvent() {

    }

    fun onClickPageBtn(view: View) {
        lateinit var act: Class<*>
        when(view.id){
            binding.btnLogin.id -> {
                act = LoginActivity::class.java
            }
            binding.btnSign.id -> {
                act = RegisterActivity::class.java
            }
        }
        val intent = Intent(this, act)
        startActivity(intent)
    }

}