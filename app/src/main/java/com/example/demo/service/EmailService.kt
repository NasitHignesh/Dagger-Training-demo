package com.example.demo.service

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface NotificationService {
    fun sendEmail(email: String, from: String, body: String)
}

@Singleton
class EmailService @Inject constructor() : NotificationService {
    override fun sendEmail(email: String, from: String, body: String) {
        Log.d("tag", "Email are sending")
    }
}

@Singleton
class MessageService @Inject constructor(private val retryCount: Int) : NotificationService {
    override fun sendEmail(email: String, from: String, body: String) {
        Log.d("tag", "message are sending try= $retryCount")
    }
}

