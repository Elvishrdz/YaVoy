package com.eahm.feature.product.management.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eahm.delivery.framework.presentation.compose.theme.DeliveryTheme
import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.data.remote.fake.FakeDataSource

@Composable
fun ProductList(list: List<Product>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        items(list) {
            Text(text = it.title)
        }
    }
}

@Preview
@Composable
fun PreviewProductList() {
    DeliveryTheme {
        ProductList(
            list = FakeDataSource.fakeProductList,
        )
    }
}