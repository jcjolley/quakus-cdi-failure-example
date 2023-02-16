package com.bean.example

import com.bean.example.auth.AuthTokenProvider

class AuthTokenConsumer(val tokenProvider: AuthTokenProvider) {
    fun main(): String {
        return tokenProvider.myToken
    }
}