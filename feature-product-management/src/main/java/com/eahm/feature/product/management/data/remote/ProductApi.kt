package com.eahm.feature.product.management.data.remote

import com.eahm.feature.product.management.data.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {

    @GET("test")
    suspend fun getProductList(): Response<List<Product>>
}