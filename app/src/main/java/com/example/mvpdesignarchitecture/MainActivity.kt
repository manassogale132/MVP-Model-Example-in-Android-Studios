package com.example.mvpdesignarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpdesignarchitecture.Model.AzureDataManager
import com.example.mvpdesignarchitecture.Presenter.ILoginPresenter
import com.example.mvpdesignarchitecture.Presenter.LoginPresenter
import com.example.mvpdesignarchitecture.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {   //implementing ILoginView interface

    lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this, AzureDataManager())

        loginButton.setOnClickListener {
            loginPresenter.onLogin(email.text.toString(), password.text.toString())
        }
    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}