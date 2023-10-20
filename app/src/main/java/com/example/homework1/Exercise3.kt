package com.example.homework1;

class Exercise3 {
    fun main() {

        val myMap = mapOf(
                "apple" to 5,
                "banana" to 3,
                "cherry" to 7,
                "date" to 2,
                "elderberry" to 4
        )

        println("Keys and Values in the Map:")
        for ((key, value) in myMap) {
            println("Key: $key, Value: $value")
        }
    }
}
