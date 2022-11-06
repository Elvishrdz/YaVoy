package com.eahm.delivery.compose

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColumnSpacerSmall() {
    Spacer(
        modifier = Modifier.height(7.dp),
    )
}

@Composable
fun ColumnSpacerMedium() {
    Spacer(
        modifier = Modifier.height(14.dp),
    )
}

@Composable
fun ColumnSpacerBig() {
    Spacer(
        modifier = Modifier.height(21.dp),
    )
}