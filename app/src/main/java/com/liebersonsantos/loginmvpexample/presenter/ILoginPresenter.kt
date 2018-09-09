package com.liebersonsantos.loginmvpexample.presenter

interface ILoginPresenter{
    fun onLogin(email: String, password: String)
}