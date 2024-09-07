package com.example.demo.service

import com.example.demo.UserRepository
import com.example.demo.qualifier.FirebaseQualifier
import com.example.demo.qualifier.MessageQualifier
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    @FirebaseQualifier private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.sendEmail(email, "abc@gmail.com", "user registered")
    }

}