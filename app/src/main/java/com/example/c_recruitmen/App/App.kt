package com.example.c_recruitmen.App

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

abstract class App(): AppCompatActivity(), View.OnClickListener {
    protected inline fun <reified Activity>BaseActivity(context:Context){
        context.startActivity(Intent(context, Activity::class.java))

    }
    protected fun app(){
        val w: Window = window
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        supportActionBar?.hide()
    }
}






















