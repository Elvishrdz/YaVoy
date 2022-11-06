package com.eahm.feature.product.management.repository

import com.eahm.feature.product.management.data.model.Product

interface ProductRepository {
    suspend fun getProductList(): List<Product>
}