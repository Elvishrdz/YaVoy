package com.eahm.delivery.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val labelDefault: @Composable ((String) -> Unit) = { text ->
    Text(
        text = text,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFieldDefault(
    text: String = "",
    value: String,
    onValueChange: (String) -> Unit,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            labelDefault(text)
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFieldOutlined(
    text: String = "",
    value: String,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            labelDefault(text)
        },
    )
}

@Preview(
    showBackground = true,
)
@Composable
fun InputFieldPreview() {
    Column(
        modifier = Modifier.padding(7.dp),
    ) {
        InputFieldDefault(
            text = "password",
            value = "",
            onValueChange = {},
        )

        ColumnSpacerSmall()

        InputFieldOutlined(
            text = "password",
            value = "",
            onValueChange = {},
        )
    }
}
