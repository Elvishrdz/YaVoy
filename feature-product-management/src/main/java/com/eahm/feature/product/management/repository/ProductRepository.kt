package com.eahm.feature.product.management.repository

import com.eahm.core.domain.product.Product

interface ProductRepository {
    suspend fun getProductList(customerId: String): List<Product>?
}