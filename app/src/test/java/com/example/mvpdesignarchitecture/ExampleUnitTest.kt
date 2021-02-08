package com.example.mvpdesignarchitecture

import com.example.mvpdesignarchitecture.Presenter.ILoginPresenter
import com.example.mvpdesignarchitecture.Presenter.LoginPresenter
import com.example.mvpdesignarchitecture.View.ILoginView
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testPresenter() {
        val loginPresenter : ILoginPresenter = LoginPresenter(object : ILoginView {
            override fun onLoginResult(message: String) {
               Assert.assertEquals(message,"Login Success")
            }

        } )
        loginPresenter.onLogin("abs@gmail.com","1234567")
    }
}

class MyView : ILoginView {
    override fun onLoginResult(message: String) {
       println(message)
    }

}