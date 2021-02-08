package com.example.mvpdesignarchitecture.Model

interface IDataManager {
    fun getEmail() : String
    fun getpassword() : String
    fun isValidData() : Boolean
}