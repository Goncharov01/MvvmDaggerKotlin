package com.example.mvvmhelloworldkotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel(model: Model) : ViewModel() {

    lateinit var model : Model
    var modelLiveData : LiveData<String> = MutableLiveData()

    private var liveName = MutableLiveData<String>()
    private var liveNumber = MutableLiveData<String>()

    fun getModelLiveData(){
        this.model = model
        liveName.value = this.model.name
        liveNumber.value = this.model.number

    }

    fun onClick() {
        liveName.value = model.name
        liveNumber.value = model.number
    }

    fun getName(): MutableLiveData<String> {
        return liveName
    }

    fun getNumber():MutableLiveData<String> {
        return liveNumber
    }

}

