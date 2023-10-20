package com.example.homework1

class Exercise1 {
    fun main() {

        val myArray = arrayOf(1, 2, 3, 4, 5)

        val myList = listOf("apple", "banana", "cherry", "date", "elderberry")
        println("Array elements:")
        for (element in myArray) {
            println(element)
        }

        println("\nList elements:")
        for (element in myList) {
            println(element)
        }
    }
}