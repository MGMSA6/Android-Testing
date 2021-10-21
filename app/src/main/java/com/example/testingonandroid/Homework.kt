package com.example.testingonandroid

object Homework {

    /**
     * Returns the n-th fibonacci number
     */

    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }

        var a = 0L
        var b = 1L
        var c = 1L

        (1..n - 2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * Check if the braces are set correctly
     * e.g. "(a * b))" should return false
     */

    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }

}