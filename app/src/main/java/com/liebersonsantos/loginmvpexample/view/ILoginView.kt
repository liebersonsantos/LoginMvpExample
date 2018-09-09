package com.liebersonsantos.loginmvpexample.view

interface ILoginView {

    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}