package com.eahm.core.domain


data class Product(
    val id: String,
    val title: String,
    val description: String? = null,
    /*val photos: List<ProductImage> = listOf(),
    val price: Price? = null,
    val priceUnitType: PriceUnitType = PriceUnitType.UNKNOWN,*/
    val providerId: String,
    /* val updated_at: Long? = null,
     val created_at: Long? = null,
     val status: ProductStatus = ProductStatus.UNDEFINED*/
) {

    override fun toString(): String {
        return "$title\n$description"
        //return "$title\n$description\n$price / $priceUnitType"
    }
}

data class Price(
    val currentPriceValueId: String,
    val priceValues: List<PriceValue>,
)

data class PriceValue(
    val id: String,
    val value: Double,
    val currency: Currency,
)

enum class Currency {
    CORDOBA,
    DOLLAR,
    EURO,
}