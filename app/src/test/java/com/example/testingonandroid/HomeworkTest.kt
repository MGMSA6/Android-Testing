package com.example.testingonandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {


    @Test
    fun checkFibonacciSeries() {
        var result = Homework.fib(10)
        assertThat(result)
    }

    @Test
    fun validBraces() {
        var result = Homework.checkBraces("()")
        assertThat(result).isTrue()
    }

}