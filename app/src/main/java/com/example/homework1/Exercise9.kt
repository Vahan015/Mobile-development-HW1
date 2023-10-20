package com.example.homework1

open class Exercise9(val name: String, val age: Int) {

    fun getLifeStage(): String {
        return when {
            age in 0..12 -> "Child"
            age in 13..19 -> "Teenager"
            age in 20..64 -> "Adult"
            else -> "Senior"
        }
    }


    fun main() {
        val person = Exercise9("John Doe", 30)

        println("Name: ${person.name}")
        println("Age: ${person.age}")

        val lifeStage = person.getLifeStage()
        println("Life Stage: $lifeStage")
    }
}
