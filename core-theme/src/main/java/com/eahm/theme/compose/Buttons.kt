package com.eahm.theme.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.eahm.theme.compose.preview.ScreenPreview
import com.eahm.theme.compose.spacer.ColumnSpacerSmall

@Composable
fun ButtonDefault(
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
    ) {
        Text(
            text = text,
        )
    }
}

@ScreenPreview
@Composable
fun ButtonDefaultPreview() {
    Column {
        ButtonDefault(
            text = "Sign In",
            onClick = {},
        )

        ColumnSpacerSmall()

        ButtonDefault(
            text = "Accept",
            onClick = {},
        )
    }
}