package com.example.c_recruitmen.App.Login

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.example.c_recruitmen.App.App
import com.example.c_recruitmen.App.Home.HomeActivity
import com.example.c_recruitmen.R
import com.example.c_recruitmen.databinding.ActivityLoginBinding

class LoginActivity : App() {
    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        app()
    }

    override fun onClick(v: View?) {

    }
    fun onLogin(v: View?){
        val signin = Intent(this, HomeActivity::class.java)
        startActivity(signin)
    }
}

























