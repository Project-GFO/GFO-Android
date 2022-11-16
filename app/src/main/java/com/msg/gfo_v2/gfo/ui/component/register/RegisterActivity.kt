package com.msg.gfo_v2.gfo.ui.component.register

import android.content.Intent
import com.msg.gfo_v2.R
import com.msg.gfo_v2.databinding.ActivityRegisterBinding
import com.msg.gfo_v2.gfo.ui.base.BaseActivity
import com.msg.gfo_v2.gfo.ui.component.intro.IntroActivity
import com.msg.gfo_v2.gfo.ui.component.main.MainActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {

    private var position = REGISTER_POSITION
    override fun viewSetting() {
        transactionEvent()
    }

    override fun observeEvent() {

    }

    private fun transactionEvent(){
        val registerFragment = RegisterFragment()
        val emailAuthenticationFragment = EmailAuthenticationFragment()
        val transaction = supportFragmentManager.beginTransaction()
        val container = R.id.registerContainer

        transaction.add(container, registerFragment).commit()

        binding.btnConfirm.setOnClickListener {
            when(position){
                REGISTER_POSITION -> {
                    transaction.replace(container, emailAuthenticationFragment)
                    position = EMAIL_POSITION
                }
                EMAIL_POSITION -> {
                    userInfo()
                    isConfirmed()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        binding.btnGoBack.setOnClickListener {
            when(position){
                REGISTER_POSITION -> {
                    val intent = Intent(this, IntroActivity::class.java)
                    startActivity(intent)
                }
                EMAIL_POSITION -> {
                    transaction.replace(container, registerFragment)
                }
            }
        }

    }

    companion object{
        const val REGISTER_POSITION = 1
        const val EMAIL_POSITION = 2
    }

    private fun userInfo(){

    }

    private fun isConfirmed(){

    }
}