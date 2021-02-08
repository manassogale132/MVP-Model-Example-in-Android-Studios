package com.example.mvpdesignarchitecture.Presenter

import com.example.mvpdesignarchitecture.Model.IDataManager
import com.example.mvpdesignarchitecture.View.ILoginView

class LoginPresenter(private val loginview: ILoginView , private val manager : IDataManager) : ILoginPresenter {


    override fun onLogin(email: String, password: String) {
        var isLoginSuccess: Boolean = manager.isValidData()

        if (isLoginSuccess) {
            loginview.onLoginResult("Login Success")
        } else {
            loginview.onLoginResult("Login Error")
        }
    }
}