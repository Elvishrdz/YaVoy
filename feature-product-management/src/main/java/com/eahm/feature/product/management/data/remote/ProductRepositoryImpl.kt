package com.eahm.feature.product.management.data.remote

import com.eahm.core.domain.product.Product
import com.eahm.feature.product.management.repository.ProductRepository
import com.haroldadmin.cnradapter.NetworkResponse
import okhttp3.FormBody
import okhttp3.RequestBody
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApi,
) : ProductRepository {

    override suspend fun getProductList(
        customerId: String,
    ): List<Product>? {
        val body: RequestBody = FormBody.Builder()
            .add("customerId", customerId)
            .build()

        val result = productApi.getProductList(
            body = body,
        )

        return when (result) {
            is NetworkResponse.Success -> result.body.data
            else -> null
        }
    }
}