package com.eahm.feature.product.management.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eahm.delivery.framework.presentation.compose.theme.DeliveryTheme
import com.eahm.feature.product.management.data.ProductState

@Composable
internal fun ProductScreen(
    state: ProductState,
) {
    when (state) {
        ProductState.Loading -> {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                CircularProgressIndicator()
            }
        }
        is ProductState.Data -> {
            ProductList(
                list = state.productList,
            )
        }
        ProductState.Error -> {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Text(text = "Error")
            }
        }
    }
}

@Preview
@Composable
fun PreviewProductScreen() {
    DeliveryTheme {
        ProductScreen(
            state = ProductState.Loading,
        )
    }
}