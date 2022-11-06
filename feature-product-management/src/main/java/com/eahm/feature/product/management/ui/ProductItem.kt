package com.eahm.feature.product.management.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.eahm.feature.product.management.R
import com.eahm.theme.compose.cardColors
import com.eahm.theme.compose.cardContentPadding
import com.eahm.theme.compose.cardElevation
import com.eahm.theme.compose.cardMinHeight
import com.eahm.theme.compose.fonts.TextCardB1
import com.eahm.theme.compose.fonts.TextCardH1
import com.eahm.theme.compose.preview.ScreenPreview
import com.eahm.theme.compose.spacer.RowSpacerCardSmall
import com.eahm.theme.compose.theme.DeliveryTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductItem(title: String, label: String, onClicked: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = cardMinHeight(), max = Dp.Infinity),
        elevation = cardElevation(),
        colors = cardColors(),
        onClick = onClicked,
    ) {
        Row(
            modifier = Modifier
                .padding(cardContentPadding()),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .heightIn(min = Dp.Infinity, max = cardMinHeight()),
                painter = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Inside,
                contentDescription = null,
            )

            RowSpacerCardSmall()

            TextCardH1(
                modifier = Modifier.weight(1f),
                text = title,
            )

            RowSpacerCardSmall()

            TextCardB1(text = label)
        }
    }
}

@ScreenPreview
@Composable
fun PreviewProductItem() {
    DeliveryTheme {
        ProductItem(
            title = "Gallopinto con queso",
            label = "C$ 149.50"
        ) {}
    }
}