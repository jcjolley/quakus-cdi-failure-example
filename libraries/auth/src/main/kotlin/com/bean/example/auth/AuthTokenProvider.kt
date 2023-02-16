package com.bean.example.auth

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class AuthTokenProvider() {
    val myToken = "so secure"
}
