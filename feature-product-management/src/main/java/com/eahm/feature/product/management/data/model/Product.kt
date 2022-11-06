package com.eahm.feature.product.management.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val id: String,
    val title: String,
    val description: String,
    val photos: List<ProductImage> = listOf(),
    val price: Float,
    val priceUnitType: PriceUnitType = PriceUnitType.UNKNOWN,
    val providerId: String,
    val updated_at: Long,
    val created_at: Long,
    val status: ProductStatus = ProductStatus.UNDEFINED
) : Parcelable {

    override fun toString(): String {
        return "$title\n$description\n$price / $priceUnitType"
    }
}