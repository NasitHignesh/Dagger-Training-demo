package com.example.demo.module

import com.example.demo.FirebaseRepository
import com.example.demo.SQLRepository
import com.example.demo.UserRepository
import com.example.demo.qualifier.FirebaseQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {

    @FirebaseQualifier
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

    @Named("sql")
    @Provides
    fun getSQLRepository(): UserRepository {
        return SQLRepository()
    }

}