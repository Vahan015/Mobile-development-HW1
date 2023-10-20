package com.example.homework1

class Exercise5 {
    fun main() {
        
        println("Please enter your name:")
        val name = readLine()
        
        println("Please enter your age:")
        val age = readLine()?.toIntOrNull()
        
        if (age != null) {
            when {
                age < 0 -> println("Invalid age! Please enter a positive age.")
                age < 18 -> println("Hello, $name! You are under 18 years old.")
                age in 18..59 -> println("Hello, $name! You are an adult.")
                else -> println("Hello, $name! You are a senior citizen.")
            }
        } else {
            println("Invalid age input. Please enter a valid age as a positive integer.")
        }
    }
}