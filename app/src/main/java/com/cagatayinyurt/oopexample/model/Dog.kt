package com.cagatayinyurt.oopexample.model

class Dog : Animal() {

    // Dynamic Polymorphism
    fun test() {
        super.sing()
    }

    override fun sing() {
        println("dog class")
    }
}