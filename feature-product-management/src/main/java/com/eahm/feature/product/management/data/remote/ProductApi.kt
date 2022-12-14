package com.eahm.feature.product.management.data.remote

import com.eahm.core.domain.product.Product
import com.haroldadmin.cnradapter.NetworkResponse
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface ProductApi {

    @POST("provider-getMyProducts")
    suspend fun getProductList(
        @Body body: RequestBody,
    ): NetworkResponse<ResponseBody<List<Product>>, ErrorResponse>
}