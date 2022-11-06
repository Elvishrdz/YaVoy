package com.eahm.feature.product.management.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductImage(
    val photoUrl: String,
    val photoName: String
) : Parcelable