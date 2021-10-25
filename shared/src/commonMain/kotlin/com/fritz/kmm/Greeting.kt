package com.fritz.kmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}