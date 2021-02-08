/*package com.example.mvpdesignarchitecture.Model

import android.text.TextUtils
import android.util.Patterns

class FireBaseDataManager : IDataManager {

    override fun getEmail(): String {
        return "abc@gmail.com"
    }

    override fun getpassword(): String {
        return "123456"
    }

    override fun isValidData(): Boolean {
        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getpassword().length > 6
    }

}*/