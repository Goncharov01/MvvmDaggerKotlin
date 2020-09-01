package com.example.mvvmhelloworldkotlin

import android.app.Activity
import android.app.Application
import com.example.mvvmhelloworldkotlin.Dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import dagger.android.HasActivityInjector

class App : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector : DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)

    }

override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}