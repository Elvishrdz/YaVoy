package com.eahm.testing.di

import com.eahm.testing.data.FirebaseServicesTestConfiguration
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestingModule {

    @Singleton
    @Provides
    fun provideTestConfiguration(): FirebaseServicesTestConfiguration {
        return FirebaseServicesTestConfiguration
    }

    @Singleton
    @Provides
    fun provideFirebaseFirestoreSettings(): FirebaseFirestoreSettings {
        return FirebaseFirestoreSettings.Builder()
            .setPersistenceEnabled(false)
            .build()
    }

    @Singleton
    @Provides
    fun provideFirebaseFirestore(
        firebaseServicesTestConfiguration: FirebaseServicesTestConfiguration,
        settings: FirebaseFirestoreSettings,
    ): FirebaseFirestore {
        return FirebaseFirestore.getInstance().apply {
            useEmulator(
                firebaseServicesTestConfiguration.FIRESTORE_LOCALHOST,
                firebaseServicesTestConfiguration.FIRESTORE_LOCALHOST_PORT,
            )
            firestoreSettings = settings
        }
    }
}