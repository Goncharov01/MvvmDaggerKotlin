package com.example.mvvmhelloworldkotlin.Dagger

import com.example.mvvmhelloworldkotlin.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules=arrayOf(ModelModule::class, AndroidInjectionModule::class, ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject (app:App)
}