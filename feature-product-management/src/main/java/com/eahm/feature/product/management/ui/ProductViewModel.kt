package com.eahm.feature.product.management.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eahm.feature.product.management.data.ProductState
import com.eahm.feature.product.management.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productRepository: ProductRepository,
) : ViewModel() {

    internal var state: MutableStateFlow<ProductState> = MutableStateFlow(ProductState.Loading)
        private set

    init {
        state.value = ProductState.Loading
    }

    fun getProductList() {
        viewModelScope.launch {
            val productList = productRepository.getProductList()

            delay(5000) // TODO: remove delay

            if (productList.isNotEmpty()) {
                state.value = ProductState.Data(
                    productList = listOf(
                        "producto 1",
                        "producto 2",
                        "producto 3",
                        "producto 4",
                    ),
                )
            } else {
                state.value = ProductState.Error
            }
        }
    }
}