package com.example.demo.module

import com.example.demo.service.EmailService
import com.example.demo.service.MessageService
import com.example.demo.service.NotificationService
import com.example.demo.qualifier.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(): NotificationService {
        return EmailService()
    }

}