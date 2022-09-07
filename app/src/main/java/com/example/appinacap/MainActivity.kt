package com.example.appinacap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun Clickboton(v: View?) {
        Log.w("Hola Mundo", "Mi Primera Aplicacion")
    }
}