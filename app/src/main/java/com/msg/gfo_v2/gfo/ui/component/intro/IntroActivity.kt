package com.msg.gfo_v2.gfo.ui.component.intro

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityIntroBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.main.MainActivity

class IntroActivity : BaseActivity<ActivityIntroBinding>(R.layout.activity_intro) {
    override fun viewSetting() {
        binding.login = this
    }

    override fun observeEvent() {

    }

    fun onClickPageBtn(view: View){
        val intent= Intent(this, MainActivity::class.java)
        when(view.id){
            binding.btnLogin.id -> {
                intent.putExtra("parse", "login")
                startActivity(intent)
            }
            binding.btnSign.id -> {
                intent.putExtra("parse", "signin")
                startActivity(intent)
            }
        }
    }

}