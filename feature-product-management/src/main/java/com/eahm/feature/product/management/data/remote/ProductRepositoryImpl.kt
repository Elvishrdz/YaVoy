package com.eahm.feature.product.management.data.remote

import android.util.Log
import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApi,
) : ProductRepository {
    override suspend fun getProductList(): List<Product> {
        //val result = productApi.getProductList()

       return listOf()
    }
}