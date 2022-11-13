package com.eahm.testing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eahm.testing.data.FakeData
import com.eahm.testing.data.FirestoreReferences
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

@HiltViewModel
class TestingViewModel @Inject constructor(
    private val firestore: FirebaseFirestore,
) : ViewModel() {

    val status = MutableStateFlow("waiting to perform actions")

    /**
     * Inserts clients as providers with testing products
     *
     * useful to test product insertion, update, removal and retrieve products from
     * one provider
     */
    fun prepareDatabaseForProviderProductTesting() {
        status.value = "executing..."

        viewModelScope.launch {
            val result = try {
                firestore.runTransaction { transaction ->
                    FakeData.users.forEach { testUser ->
                        transaction.set(
                            FirestoreReferences.getCollectionUsers(firestore),
                            testUser,
                        )
                    }


                    "adding users complete"
                }.await()

            } catch (exception: Exception) {
                "exception creating users: ${exception.message}"
            }

            status.value = result
        }
    }
}