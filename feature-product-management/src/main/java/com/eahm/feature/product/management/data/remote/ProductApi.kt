package com.eahm.feature.product.management.data.remote

import com.eahm.feature.product.management.data.model.Product
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ProductApi {

    @POST("provider-getMyProducts")
    suspend fun getProductList(
        @Body body: RequestBody,
    ): Response<NetworkResponse<List<Product>>>
}