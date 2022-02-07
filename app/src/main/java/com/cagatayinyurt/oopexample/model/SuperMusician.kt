package com.cagatayinyurt.oopexample.model

//Inheritance
class SuperMusician(
    name: String,
    instrument: String,
    age: Int
) : Musician(
    name,
    instrument,
    age
) {
    fun sing() {
        println("Dyers Eve")
    }
}