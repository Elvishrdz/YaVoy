package com.eahm.feature.product.management

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eahm.feature.product.management.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productRepository: ProductRepository,
) : ViewModel() {

    fun getProductList() {
        viewModelScope.launch {
            val productList = productRepository.getProductList()

            if (productList.isNotEmpty()) {

            } else {

            }
        }
    }
}