package com.example.mvvmhelloworldkotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel(model: Model) : ViewModel() {

    var model: Model = model

    var liveName = MutableLiveData<String>()
    var liveNumber = MutableLiveData<String>()

    fun onClick() {

//        liveName.value = this.model.name
//        liveNumber.value = this.model.number

        liveName.value = model.name
        liveNumber.value = model.number

        println("!!!!!!!!!!" + liveName.value)
    }

    fun getName(): MutableLiveData<String> {
        return liveName
    }

    fun getNumber(): MutableLiveData<String> {
        return liveNumber
    }

}

