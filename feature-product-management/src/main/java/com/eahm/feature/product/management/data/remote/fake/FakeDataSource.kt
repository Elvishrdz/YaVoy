package com.eahm.feature.product.management.data.remote.fake

import com.eahm.feature.product.management.data.model.PriceUnitType
import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.data.model.ProductStatus

object FakeDataSource {

    val fakeProductList = listOf(
        Product(
            id = "1",
            title = "Test product 1",
            description = "This is a nice test product",
            photos = listOf(),
            price = 5.0f,
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
            price = 10.0f,
            priceUnitType = PriceUnitType.UNIT,
            providerId = "2",
            updated_at = 0,
            created_at = 0,
            status = ProductStatus.AVAILABLE,
        )
    )
}