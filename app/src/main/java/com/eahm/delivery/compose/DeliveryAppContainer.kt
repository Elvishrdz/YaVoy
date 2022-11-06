package com.eahm.delivery.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.eahm.delivery.framework.presentation.compose.theme.DeliveryTheme


@Composable
fun DeliveryAppContainer(content: @Composable () -> Unit) {
    DeliveryTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}