package com.eahm.delivery.di

import com.eahm.delivery.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Provides
    @Singleton
    fun provideBaseUrl(): String {
        val baseUrl = "https://us-central1-framework-3632d.cloudfunctions.net/"

        return when {
            BuildConfig.DEBUG && USE_LOCALHOST -> {
                // Configure the Local Emulator
                "https://10.0.2.2//framework-3632d/us-central1/"
            }
            else -> {
                baseUrl
            }
        }
    }
}

const val USE_LOCALHOST = false