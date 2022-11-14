package com.eahm.feature.product.management.data

import com.eahm.core.domain.Product

sealed interface ProductState {

    object Loading : ProductState

    data class Data(
        val productList: List<Product>,
    ) : ProductState

    object EmptyList : ProductState

    object Error : ProductState
}