package com.liebersonsantos.loginmvpexample

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.liebersonsantos.loginmvpexample.presenter.ILoginPresenter
import com.liebersonsantos.loginmvpexample.presenter.LoginPresenter
import com.liebersonsantos.loginmvpexample.view.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        loginPresenter = LoginPresenter(this)

        //event
        buttonLogin.setOnClickListener{
            loginPresenter.onLogin(editEmail.text.toString(), editPassword.text.toString())
        }

    }

    override fun onLoginSuccess(message: String) {
        Snackbar.make(constraint, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Snackbar.make(constraint, message, Snackbar.LENGTH_SHORT).show()
    }
}
