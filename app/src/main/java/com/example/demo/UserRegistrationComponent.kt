package com.example.demo

import com.example.demo.module.AnalyticsModule
import com.example.demo.module.NotificationServiceModule
import com.example.demo.module.UserRepositoryModule
import com.example.demo.service.EmailService
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class, AnalyticsModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService(): EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int): UserRegistrationComponent
    }

}