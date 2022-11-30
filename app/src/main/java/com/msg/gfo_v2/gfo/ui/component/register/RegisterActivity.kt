package com.msg.gfo_v2.gfo.ui.component.register

import android.content.Intent
import android.view.View
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityRegisterBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.intro.IntroActivity
import com.msg.gfo_v2.gfo.ui.component.main.MainActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {

    override fun viewSetting() {
        binding.goBack = this
    }

    override fun observeEvent() {

    }
    fun onClickPageBtn(view : View){

    }

}


private fun userInfo(){

}

private fun isConfirmed(){

}
