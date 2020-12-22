package com.example.c_recruitmen.App.Register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.c_recruitmen.App.App
import com.example.c_recruitmen.R

class Register : App() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        app()
    }
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}