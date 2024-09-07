package com.example.demo.module

import com.example.demo.service.AnalyticsService
import com.example.demo.service.MixPenal
import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return MixPenal()
    }

}