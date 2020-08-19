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

        val myInteger : Int = 5

        //double & float

        val pi = 3.14

        val r : Double = 5.0

        val age2 = 23.0

        val result2 = age2 * 5 / 4

        println(result2)

        //string

        val name = "John"
        val surname = "Doe"

        val fullname = name + " " + surname

        println(fullname)

        val myName : String = "Jane"

        //boolean

        var isAlive : Boolean = true
        isAlive = false

        //arrays

        val myArray = arrayOfNulls<String>(4)

        myArray [0] = "Jack"
        myArray [1] = "Jess"
        myArray [2] = "Jim"
        myArray [3] = "Joan"

        println(myArray[2])


        val myNumberArray = intArrayOf(10,20,30,40,50)

        println(myNumberArray.size)
        myNumberArray.set(2,35)
        println(myNumberArray[2])

        //list

        val myFriend = arrayListOf<String>()

        myFriend.add("Jack")
        myFriend.add("Jim")

        println(myFriend)

        myFriend.add(1,"Jess")

        println(myFriend)

       
    }
}