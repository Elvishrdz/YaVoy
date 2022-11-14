package com.eahm.testing.data.fake

import com.eahm.core.domain.ProductStatus
import com.eahm.core.domain.product.Currency
import com.eahm.core.domain.product.Price
import com.eahm.core.domain.product.Prices
import com.eahm.core.domain.product.Product

object FakeDataSource {

    val products = listOf(
        Product(
            id = "1",
            title = "Test product 1",
            description = "This is a nice test product",
            prices = Prices(
                activePriceId = "A1",
                prices = listOf(
                    Price(
                        id = "A1",
                        value = 1500.000,
                        currency = Currency.CORDOBA,
                    ),
                ),
            ),
            providerId = "1",
            status = ProductStatus.AVAILABLE,
        ),
        Product(
            id = "2",
            title = "Test product 2",
            description = "This is a nice test product",
            prices = Prices(
                activePriceId = "A2",
                prices = listOf(
                    Price(
                        id = "A2",
                        value = 2300.80,
                        currency = Currency.EURO,
                    ),
                ),
            ),
            providerId = "2",
            status = ProductStatus.AVAILABLE,
        ),
    )
}