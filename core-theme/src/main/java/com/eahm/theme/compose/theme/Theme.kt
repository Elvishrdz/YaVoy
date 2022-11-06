package com.eahm.theme.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

/**
 * more information about material 3:
 * https://m3.material.io/styles/color/overview
 */
private val LightColorPalette = lightColorScheme(
    primary = primary,
    onPrimary = black,
    primaryContainer = white,
    onPrimaryContainer = primary,
    surface = white,
    onSurface = primaryLight,
    surfaceTint = white,
)

private val DarkColorPalette = darkColorScheme(
    primary = primaryDark,
    onPrimary = white,
    primaryContainer = licorice,
    onPrimaryContainer = primaryLight,
    surface = black,
    onSurface = primary,
    surfaceTint = black,
)

private object AppRippleTheme : RippleTheme {
    // Here you should return the ripple color you want
    // and not use the defaultRippleColor extension on RippleTheme.
    // Using that will override the ripple color set in DarkMode
    // or when you set light parameter to false
    @Composable
    override fun defaultColor(): Color = MaterialTheme.colorScheme.onPrimary

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleTheme.defaultRippleAlpha(
        contentColor = Color.Black,
        lightTheme = !isSystemInDarkTheme(),
    )
}

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
    ) {
        CompositionLocalProvider(
            LocalRippleTheme provides AppRippleTheme,
            content = content
        )
    }
}
