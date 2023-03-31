package com.example.teladelogin.data

import com.example.teladelogin.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {
    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }
    fun register(username: String, password: String, email: String): Result<LoggedInUser> {
        try {
            // TODO: handle user registration
            val newUser = LoggedInUser(java.util.UUID.randomUUID().toString(), username)
            return Result.Success(newUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error registering user", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}