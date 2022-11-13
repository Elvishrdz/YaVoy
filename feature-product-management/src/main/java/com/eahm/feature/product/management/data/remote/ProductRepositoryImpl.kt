package com.eahm.feature.product.management.data.remote

import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.repository.ProductRepository
import okhttp3.FormBody
import okhttp3.RequestBody
import javax.inject.Inject


class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApi,
) : ProductRepository {

    override suspend fun getProductList(
        customerId: String,
    ): List<Product>? {
        /*return if (BuildConfig.DEBUG) {
            FakeDataSource.fakeProductList
        }*/

        val body: RequestBody = FormBody.Builder()
            .add("customerId", customerId)
            .build()

        val result = productApi.getProductList(
            body = body,
        )

        return if (result.isSuccessful) {
            result.body()?.data
        } else {
            null
        }
    }
}