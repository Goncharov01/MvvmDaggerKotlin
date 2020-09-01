package com.example.mvvmhelloworldkotlin.Dagger

import com.example.mvvmhelloworldkotlin.Model
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ModelModule {
    @Provides
    @Singleton
    fun getModel() : Model = Model()

}