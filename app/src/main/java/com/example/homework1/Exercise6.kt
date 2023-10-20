package com.example.homework1

class Exercise6 {
    fun main() {
        divideNumbers(10.0, 2.0)
        divideNumbers(8.0, 0.0)
        divideNumbers(15.0, 3.0)
    }

    fun divideNumbers(dividend: Double, divisor: Double) {
        try {
            if (divisor == 0.0) {
                throw ArithmeticException("Division by zero is not allowed.")
            } else {
                val result = dividend / divisor
                println("$dividend / $divisor = $result")
            }
        } catch (e: ArithmeticException) {
            println("Error: ${e.message}")
        }
    }
}