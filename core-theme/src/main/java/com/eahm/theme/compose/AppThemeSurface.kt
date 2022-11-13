package com.eahm.theme.compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.eahm.theme.compose.theme.DeliveryTheme

// TODO: rename to DeliveryAppThemeSurface
@Composable
fun AppThemeSurface(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    DeliveryTheme {
        Surface(
            modifier = modifier,
            color = MaterialTheme.colorScheme.surface
        ) {
            content()
        }
    }
}
