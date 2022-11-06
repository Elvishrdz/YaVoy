package com.eahm.delivery.compose.preview

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview
import com.eahm.delivery.compose.preview.PreviewConfig.Companion.GROUP_THEMES

@Preview(
    group = GROUP_THEMES,
    name = "light theme",
    uiMode = UI_MODE_NIGHT_NO,
)
@Preview(
    group = GROUP_THEMES,
    name = "dark theme",
    uiMode = UI_MODE_NIGHT_YES,
)
annotation class ThemesPreview