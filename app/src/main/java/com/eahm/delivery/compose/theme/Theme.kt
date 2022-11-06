package com.eahm.delivery.framework.presentation.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.eahm.delivery.compose.theme.primary
import com.eahm.delivery.compose.theme.primaryDark
import com.eahm.delivery.compose.theme.white

/**
 * more information about material 3:
 * https://m3.material.io/styles/color/overview
 */
private val LightColorPalette = lightColorScheme(
    primary = primary,
    onPrimary = white,
)

private val DarkColorPalette = darkColorScheme(
    primary = primaryDark,
    onPrimary = white,
)

@Composable
fun DeliveryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = Shapes,
        content = content
    )
}
