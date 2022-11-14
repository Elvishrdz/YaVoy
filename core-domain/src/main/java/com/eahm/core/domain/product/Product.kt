package com.eahm.core.domain.product

import com.eahm.core.domain.ProductStatus

data class Product(
    val id: String,
    val title: String,
    val description: String,
    val prices: Prices,
    val providerId: String,
    val status: ProductStatus,

    /*val photos: List<ProductImage> = listOf(),
    val priceUnitType: PriceUnitType = PriceUnitType.UNKNOWN,*/
    /* val updated_at: Long? = null,
     val created_at: Long? = null,
     val status: ProductStatus = ProductStatus.UNDEFINED*/
)

data class Prices(
    val activePriceId: String,
    val prices: List<Price>,
)

data class Price(
    val id: String,
    val value: Double,
    val currency: Currency,
)

enum class Currency {
    CORDOBA,
    DOLLAR,
    EURO,
}