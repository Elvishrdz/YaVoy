package com.eahm.theme.compose

import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

fun cardMinHeight() = 50.dp

fun cardContentPadding() = 5.dp

@Composable
fun cardElevation() = CardDefaults.elevatedCardElevation(
    defaultElevation = 5.dp,
    pressedElevation = 7.dp,
    focusedElevation = 5.dp,
    hoveredElevation = 7.dp,
    draggedElevation = 7.dp,
    disabledElevation = 0.dp,
)

@Composable
fun cardColors() = CardDefaults.cardColors(
    containerColor = MaterialTheme.colorScheme.primaryContainer,
    contentColor = contentColorFor(
        backgroundColor = MaterialTheme.colorScheme.primaryContainer,
    ),
    disabledContainerColor = MaterialTheme.colorScheme.primaryContainer,
    disabledContentColor = MaterialTheme.colorScheme.primaryContainer,
)