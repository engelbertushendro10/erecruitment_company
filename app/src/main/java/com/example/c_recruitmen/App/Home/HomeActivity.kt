package com.example.c_recruitmen.App.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.c_recruitmen.App.App
import com.example.c_recruitmen.R

class HomeActivity : App() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        app()
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}