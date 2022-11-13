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
        return when {
            BuildConfig.DEBUG && USE_LOCALHOST -> {
                // TODO: you need to declare android:usesCleartextTraffic="true" in your application tag in the manifest
                val localhost = if (USE_LOCALHOST) {
                    // Localhost server must be running to make api calls
                    LOCALHOST

                } else {
                    // for local emulators localhost is located in
                    "10.0.2.2"
                }

                "http://${localhost}:${LOCALHOST_PORT}/framework-3632d/us-central1/"
            }
            else -> {
                "https://us-central1-framework-3632d.cloudfunctions.net/"
            }
        }
    }
}

// TODO: provide test configuration separated from production app
const val USE_LOCALHOST = true
const val LOCALHOST_PORT = 5001
const val LOCALHOST = "localhost"