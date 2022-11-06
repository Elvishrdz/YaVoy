package com.eahm.delivery.compose.preview

import androidx.compose.ui.tooling.preview.Preview
import com.eahm.delivery.compose.preview.PreviewConfig.Companion.GROUP_LOCALE
import com.eahm.delivery.compose.preview.PreviewConfig.Companion.LOCALE_ENGLISH
import com.eahm.delivery.compose.preview.PreviewConfig.Companion.LOCALE_SPANISH

@Preview(
    group = GROUP_LOCALE,
    name = "spanish",
    locale = LOCALE_SPANISH,
)
@Preview(
    group = GROUP_LOCALE,
    name = "english",
    locale = LOCALE_ENGLISH,
)
annotation class LocalePreview