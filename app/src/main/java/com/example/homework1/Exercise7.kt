package com.example.homework1
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class Exercise7 {
    fun main() {
        val currentDateTime = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

        val formattedDateTime = currentDateTime.format(formatter)

        println("Current date and time: $formattedDateTime")
    }
}