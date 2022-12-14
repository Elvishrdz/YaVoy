package com.eahm.theme.compose.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eahm.theme.compose.preview.PreviewConfig
import com.eahm.theme.compose.theme.DeliveryTheme
import com.eahm.theme.compose.fonts.TextFontB1

@Preview(
    group = PreviewConfig.GROUP_THEMES,
    name = "dark theme",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    group = PreviewConfig.GROUP_THEMES,
    name = "light theme",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
private annotation class ThemePreviews

@ThemePreviews
@Composable
fun PalettePreview() {
    DeliveryTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
        ) {
            Column(
                modifier = Modifier
                    .padding(30.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                    ),
            ) {
                TextFontB1(
                    modifier = Modifier.padding(7.dp),
                    text = "text with onPrimary",
                    color = MaterialTheme.colorScheme.onPrimary,
                )
            }
        }
    }
}
