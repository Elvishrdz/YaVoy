package com.eahm.feature.product.management.data.remote

import com.google.gson.annotations.SerializedName

data class ResponseBody<T>(
    @SerializedName("data") val data: T,
    @SerializedName("message") val message: String,
    @SerializedName("statusCode") val statusCode: Int
)