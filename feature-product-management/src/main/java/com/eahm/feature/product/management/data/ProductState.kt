package com.eahm.feature.product.management.data

sealed interface ProductState {

    object Loading : ProductState

    data class Data(
        val productList: List<String>, // TODO: List<Products>
    ) : ProductState

    object Error : ProductState
}