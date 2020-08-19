package com.example.a3rdlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables

        //integer

        var x = 5
        val y = 4

        x = 6

        println(x * y)

        var age = 20

        age = 23

        val result = age * 5 / 4

        println(result)

        //double & float

        val pi = 3.14

        val age2 = 23.0

        val result2 = age2 * 5 / 4

        println(result2)

    }
}