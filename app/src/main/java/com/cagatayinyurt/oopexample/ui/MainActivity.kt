package com.cagatayinyurt.oopexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cagatayinyurt.oopexample.model.*
import com.cagatayinyurt.oopexample.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Constructor
        val myUser = User(
            "Çağatay", 26
        )
        println(myUser.age)

        // Encapsulation
        val james = Musician("James", "Guitar", 58)
        //james.age = 60
        println(james.returnBandName("Cliff Burton"))
        println(james.returnBandName("Kirk"))
        println(james.age)

        // Inheritance
        val larsUlrich = SuperMusician(
            "Lars",
            "Drums",
            57
        )
        println(larsUlrich.name)
        println(larsUlrich.age)
        println(larsUlrich.returnBandName("Cliff Burton"))
        larsUlrich.sing()

        // Polymorphism
        // Static Polymorphism
        val mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        // Dynamic Polymorphism
        val animal = Animal()
        animal.sing()

        val dog = Dog()
        dog.test()
        dog.sing()

        // Abstract & Interface
        println(myUser.information())
        //val myPeople = People() --> Cannot create an instance of an abstract class

        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false.toString()
        println(myPiano.roomName)
        myPiano.info()

        // Lambda Expressions
        fun printString(myString: String) {
            println(myString)
        }
        printString("myTestString")

        val testString = { myString: String -> println(myString) }
        testString("myLambdaString")

        val multiplyLambda = { a: Int, b: Int -> a * b }
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,6))
    }
}