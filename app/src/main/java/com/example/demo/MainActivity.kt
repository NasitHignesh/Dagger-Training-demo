package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.service.EmailService
import com.example.demo.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    lateinit var emailService: EmailService
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(2)
        emailService = component.getEmailService()
        emailService1 = component.getEmailService()
        component.inject(this)

        userRegistrationService.registerUser("xyz@gmail.com","123")

    }
}