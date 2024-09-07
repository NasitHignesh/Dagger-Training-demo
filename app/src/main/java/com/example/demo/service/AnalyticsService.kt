package com.example.demo.service

import android.util.Log
import javax.inject.Inject


interface AnalyticsService {
    fun  trackEvent(eventName:String,eventType: String)
}

class MixPenal @Inject constructor(): AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
       Log.d("tag","MixPenal - $eventName - $eventType")
    }
}

class FirebaseAnalytics(): AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("tag","FirebaseAnalytics $eventName - $eventType")
    }
}