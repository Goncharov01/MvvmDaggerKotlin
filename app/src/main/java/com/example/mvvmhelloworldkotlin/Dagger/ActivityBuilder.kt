package com.example.mvvmhelloworldkotlin.Dagger

import com.example.mvvmhelloworldkotlin.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
//предоставляют ContributesAndroidInjector для mainActivity у каждой Activity  должен быть такой инжектор
    @ContributesAndroidInjector
    abstract fun bindMainActivity (): MainActivity
}