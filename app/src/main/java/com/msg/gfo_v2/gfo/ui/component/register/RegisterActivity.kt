package com.msg.gfo_v2.gfo.ui.component.register

import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityRegisterBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {

    override fun viewSetting() {
        binding.goBack = this
    }

    override fun observeEvent() {

    }
    fun onClickPageBtn(view : View){
        finish()
    }

}


private fun userInfo(){

}

private fun isConfirmed(){

}
