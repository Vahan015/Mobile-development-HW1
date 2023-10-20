package com.example.homework1

import java.util.Locale

class Exercise2 {
    fun main() {
        var myString = "Hello, World!"

        myString += " Welcome to Kotlin"

        val subString = myString.substring(7, 12)

        val uppercaseString = myString.toUpperCase(Locale.ROOT)
        val lowercaseString = myString.toLowerCase(Locale.ROOT)

        println("Original string: $myString")
        println("Concatenated string: $myString")
        println("Substring: $subString")
        println("Uppercase: $uppercaseString")
        println("Lowercase: $lowercaseString")
    }
}