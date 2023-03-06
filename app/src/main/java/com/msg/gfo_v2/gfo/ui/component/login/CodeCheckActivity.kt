package com.msg.gfo_v2.gfo.ui.component.login

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityCodeCheckBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity

class CodeCheckActivity : BaseActivity<ActivityCodeCheckBinding>(R.layout.activity_code_check) {
    override fun viewSetting() {
        binding.goBack = this
        onConfirmBtnClicked()
    }

    override fun observeEvent() {}

    fun onClickPageBtn(view : View){
        finish()
    }

    private fun onConfirmBtnClicked(){
        binding.btnConfirm.setOnClickListener {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }
}