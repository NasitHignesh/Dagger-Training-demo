package com.example.demo


import android.util.Log
import com.example.demo.service.AnalyticsService
import javax.inject.Inject

interface UserRepository {
    fun saveUser(name: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(name: String, password: String) {
        Log.d("tag", "user save in db")
//        analyticsService.trackEvent("SQl event","click")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(name: String, password: String) {
        Log.d("tag", "user save in firebase")
//        analyticsService.trackEvent("firebase event","click")
    }
}