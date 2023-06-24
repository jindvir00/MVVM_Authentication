 package com.jindvir.mvvmauthentication.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.ViewModelProvider
import com.jindvir.mvvmauthentication.R
import com.jindvir.mvvmauthentication.databinding.ActivityLoginPageBinding
import com.jindvir.mvvmauthentication.utils.toast

 class LoginPage : AppCompatActivity() , AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginPageBinding = DataBindingUtil.setContentView(this , R.layout.activity_login_page)
        val viewModel  = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListener = this
    }

     override fun onStarted() {
         toast("Login Started")
     }

     override fun onSuccess() {
         toast("Login Success")
     }

     override fun onFailure(message: String) {
         toast(message)
     }
 }