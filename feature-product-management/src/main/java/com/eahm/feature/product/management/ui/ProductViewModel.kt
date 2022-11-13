package com.eahm.feature.product.management.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eahm.feature.product.management.data.ProductState
import com.eahm.feature.product.management.data.ProductState.*
import com.eahm.feature.product.management.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productRepository: ProductRepository,
) : ViewModel() {

    internal var state: MutableStateFlow<ProductState> = MutableStateFlow(Loading)
        private set

    init {
        setLoadingState()
    }

    fun getProductList() {
        setLoadingState()

        viewModelScope.launch {
            val productList = productRepository.getProductList(
                customerId = "kWqfigrvSXUEoSiV46sVeR8zA6o1", // TODO: provide customerID
            )

            state.value = productList?.let {
                if (it.isEmpty()) {
                    EmptyList

                } else {
                    Data(
                        productList = productList,
                    )
                }
            } ?: Error
        }
    }

    private fun setLoadingState() {
        state.value = Loading
    }
}