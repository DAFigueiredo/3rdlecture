package com.example.a3rdlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables

        val x = 5
        val y = 4

        println(x * y)

        val age = 20

        val result = age * 5 / 4

        println(result)


    }
}