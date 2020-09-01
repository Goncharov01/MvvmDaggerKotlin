package com.example.mvvmhelloworldkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class LoginViewModelFactory @Inject constructor(val model: Model) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(LoginViewModel::class.java)){
            return LoginViewModel(model) as T
        }
        else{
            throw IllegalArgumentException("no one correct class") as Throwable
        }

    }
}