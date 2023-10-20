package com.example.homework1

class Exercise4 {
    fun main() {

        println(determineSign(5))
        println(determineSign(-3))
        println(determineSign(0))
    }

    fun determineSign(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }
}