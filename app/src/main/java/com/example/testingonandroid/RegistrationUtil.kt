package com.example.testingonandroid

object RegistrationUtil {


    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if ...
     * ...the username or password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digit
     */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }

        if (userName in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }

        if (password.length < 2) {
            return false
        }

        return true
    }
}