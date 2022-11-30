package com.msg.gfo_v2.gfo.ui.component.login

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityFindPasswordBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity

class FindPasswordActivity : BaseActivity<ActivityFindPasswordBinding>(R.layout.activity_find_password) {
    override fun viewSetting() {
        binding.goBack = this
        onConfirmBtnClicked()
    }

    override fun observeEvent() {

    }

    fun onClickPageBtn(view : View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun onConfirmBtnClicked() {
        binding.btnConfirm.setOnClickListener {
            emailCheck()
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }

    fun emailCheck(){}
}