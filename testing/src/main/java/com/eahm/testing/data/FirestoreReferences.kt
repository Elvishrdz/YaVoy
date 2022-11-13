package com.eahm.testing.data

import com.google.firebase.firestore.FirebaseFirestore

object FirestoreReferences {
    private const val COLLECTION_USERS = "users"

    fun getCollectionUsers(firestore: FirebaseFirestore) = firestore
        .collection(COLLECTION_USERS)
        .document()
}