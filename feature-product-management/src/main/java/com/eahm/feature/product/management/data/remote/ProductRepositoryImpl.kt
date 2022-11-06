package com.eahm.feature.product.management.data.remote

import com.eahm.feature.product.management.BuildConfig
import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApi,
) : ProductRepository {
    override suspend fun getProductList(): List<Product> {
        return if (BuildConfig.DEBUG) {
            listOf()
        } else {
            //TODO: val result = productApi.getProductList()
            listOf()
        }
    }
}