package com.example.testingonandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    /**
     * Empty username
     */

    @Test
    fun `empty username`() {
        var result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    /**
     *  Valid inputs
     */

    @Test
    fun `valid input`() {
        var result = RegistrationUtil.validateRegistrationInput(
            "Ram",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    /**
     *  User already exist
     */

    @Test
    fun userAlreadyExist() {
        var result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    /**
     *  Empty password
     */

    @Test
    fun emptyPassword() {
        var result = RegistrationUtil.validateRegistrationInput(
            "Ram",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    /**
     *  Incorrect confirmedPassword
     */

    @Test
    fun incorrectConfirmedPassword() {
        var result = RegistrationUtil.validateRegistrationInput(
            "Ram",
            "123",
            "321"
        )
        assertThat(result).isFalse()
    }

    /**
     * Password length less then 2
     */

    @Test
    fun invalidPasswordLength() {
        var result = RegistrationUtil.validateRegistrationInput(
            "Ram",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }
}