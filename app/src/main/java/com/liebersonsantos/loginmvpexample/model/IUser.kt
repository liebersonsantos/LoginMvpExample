package com.liebersonsantos.loginmvpexample.model

interface IUser {

    val email: String
    val password: String
    fun isDataValid(): Int
}