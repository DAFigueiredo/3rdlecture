package com.example.a3rdlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables


        //Integer

        var x = 5
        val y = 4

        x = 6

        //println(x * y)

        var age = 20

        age = 23

        val result = age * 5 / 4

        //println(result)

        val myInteger : Int = 5


        //Double & Float

        val pi = 3.14

        val r : Double = 5.0

        val age2 = 23.0

        val result2 = age2 * 5 / 4

        //println(result2)


        //String

        val name = "Jack"
        val surname = "Doe"

        val fullname = name + " " + surname

        //println(fullname)

        val myName : String = "Jess"


        //Boolean

        var isAlive : Boolean = true
        isAlive = false


        //Arrays

        val myArray = arrayOfNulls<String>(4)

        myArray [0] = "Jack"
        myArray [1] = "Jess"
        myArray [2] = "Jim"
        myArray [3] = "Joan"

        //println(myArray[2])


        val myNumberArray = intArrayOf(10,20,30,40,50)

        //println(myNumberArray.size)
        myNumberArray.set(2,35)
        //println(myNumberArray[2])


        //List

        val myFriend = arrayListOf<String>()

        myFriend.add("Jack")
        myFriend.add("Jim")

        //println(myFriend)

        myFriend.add(1,"Jess")
        myFriend.add("Jack")
        //println(myFriend)


       //Set

        val mySet = HashSet<String>()

        mySet.add("Jack")
        mySet.add("Jack")

       //println(mySet.size)


        //Map

        val myHashMap = HashMap<String, String>()

        myHashMap.put("name", "Jack")
        myHashMap.put("instrument", "Guitar")

        //println(myHashMap["instrument"])


        //Operators

        var m = 5
        //println(m)
        m = m + 1
        //println(m)
        m++
        //println(m)
        m--
        //println(m)

        var n = 6

        //println(m>n)
        //println(n>m)

        //>
        //<
        //>=
        //<=
        //== "if is equal"
        //!= "different
        //&& "and"
        //|| "or"


        //if

        if (m>n) {
            //println("m is greater than n")
        } else if (n>m) {
            //println("n is greater than m")
        } else {
            //println("m = n")
        }


        //Switch

        val day = 6
        var dayString = ""

        if (day == 1) {
            dayString = "Monday"
        } else if (day == 2) {
            dayString = "Tuesday"
        } else if (day == 3) {
            dayString = "Wednesday"
        } else if (day == 4) {
            dayString = "Thursday"
        } else if (day == 5){
            dayString = "Friday"
        }

        when (day) {

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            else -> dayString ="Weekend"

        }

        //println(dayString)


        //For loops

        val myNumbers = intArrayOf(12,15,18,21,24)

        val q = myNumbers[0] / 3 * 5
        //println(q)


        for (number in myNumbers) {
            val z = number / 3 * 5
            //println(z)
        }

        //println("-----")

        for (i in myNumbers.indices) {
            val y = myNumbers[i] / 3 * 5
            //println(y)
        }

        //println("-----")

        for (a in 0..5) {
            val b = a * 2
            //println(b)
        }
        

    }
}