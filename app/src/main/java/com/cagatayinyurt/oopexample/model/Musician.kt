package com.cagatayinyurt.oopexample.model

open class Musician(
    name: String,
    instrument: String,
    age: Int
) {
    //Encapsulation
    var name: String? = name
        private set
        get

    private var instrument: String? = instrument

    var age: Int? = age
        get
        private set

    private val bandName: String = "Metallica"

    fun returnBandName(password: String) : String {
        return if (password == "Cliff Burton") {
            bandName
        } else {
            "Cannot Accessing"
        }
    }
}