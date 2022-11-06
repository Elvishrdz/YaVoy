package com.eahm.feature.product.management.data.remote.fake

import com.eahm.feature.product.management.data.model.*

object FakeDataSource {

    val fakeProductList = listOf(
        Product(
            id = "1",
            title = "Test product 1",
            description = "This is a nice test product",
            photos = listOf(),
            price = Price(
                currentPriceValueId = "A1",
                priceValues = listOf(
                    PriceValue(
                        id = "A1",
                        value = 1500.000,
                        currency = Currency.CORDOBA,
                    ),
                ),
            ),
            priceUnitType = PriceUnitType.UNIT,
            providerId = "1",
            updated_at = 0,
            created_at = 0,
            status = ProductStatus.AVAILABLE,
        ),
        Product(
            id = "2",
            title = "Test product 2",
            description = "This is a nice test product",
            photos = listOf(),
            price = Price(
                currentPriceValueId = "B1",
                priceValues = listOf(
                    PriceValue(
                        id = "B1",
                        value = 120500.50,
                        currency = Currency.EURO,
                    ),
                ),
            ),
            priceUnitType = PriceUnitType.UNIT,
            providerId = "2",
            updated_at = 0,
            created_at = 0,
            status = ProductStatus.AVAILABLE,
        )
    )
}