package com.eahm.feature.product.management.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val id: String,
    val title: String,
    val description: String,
    val photos: List<ProductImage> = listOf(),
    val price: Price,
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

@Parcelize
data class Price(
    val currentPriceValueId: String,
    val priceValues: List<PriceValue>,
) : Parcelable

@Parcelize
data class PriceValue(
    val id: String,
    val value: Double,
    val currency: Currency,
) : Parcelable

@Parcelize
enum class Currency : Parcelable {
    CORDOBA,
    DOLLAR,
    EURO,
}