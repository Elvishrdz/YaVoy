package com.eahm.delivery.di

import com.eahm.delivery.BuildConfig
import com.eahm.testing.data.FirebaseServicesTestConfiguration
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
    fun provideBaseUrl(
        firebaseServicesTestConfiguration: FirebaseServicesTestConfiguration,
    ): String {
        return when {
            BuildConfig.DEBUG && firebaseServicesTestConfiguration.CLOUD_FUNCTIONS_USE_LOCALHOST -> {
                // TODO: you need to declare android:usesCleartextTraffic="true" in your application tag in the manifest
                // TODO: provide this for debug and prod builds properly
                "http://${firebaseServicesTestConfiguration.CLOUD_FUNCTIONS_LOCALHOST}:${firebaseServicesTestConfiguration.CLOUD_FUNCTIONS_LOCALHOST_PORT}/framework-3632d/us-central1/"
            }
            else -> {
                "https://us-central1-framework-3632d.cloudfunctions.net/"
            }
        }
    }
}
