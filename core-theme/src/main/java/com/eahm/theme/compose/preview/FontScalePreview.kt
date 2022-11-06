package com.eahm.theme.compose.preview

import androidx.compose.ui.tooling.preview.Preview
import com.eahm.theme.compose.preview.PreviewConfig.Companion.FONT_SCALE_BIG
import com.eahm.theme.compose.preview.PreviewConfig.Companion.FONT_SCALE_SMALL
import com.eahm.theme.compose.preview.PreviewConfig.Companion.GROUP_FONT_SCALE

@Preview(
    group = GROUP_FONT_SCALE,
    name = "small font",
    fontScale = FONT_SCALE_SMALL,
)
@Preview(
    group = GROUP_FONT_SCALE,
    name = "large font",
    fontScale = FONT_SCALE_BIG,
)
annotation class FontScalePreview
