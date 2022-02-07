package com.cagatayinyurt.oopexample.model

import com.cagatayinyurt.oopexample.service.HouseDecor
import com.cagatayinyurt.oopexample.service.Instrument

// Interface
class Piano : HouseDecor, Instrument {

    var brand: String? = null
    var digital: String? = null

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    override fun info() {
        println("instrument info")
    }
}