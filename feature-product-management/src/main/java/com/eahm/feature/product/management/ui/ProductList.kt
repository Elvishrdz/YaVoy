package com.eahm.feature.product.management.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.eahm.feature.product.management.R
import com.eahm.feature.product.management.data.model.Product
import com.eahm.feature.product.management.data.remote.fake.FakeDataSource
import com.eahm.theme.compose.AppThemeSurface
import com.eahm.theme.compose.fonts.TextFontH1
import com.eahm.theme.compose.preview.ScreenPreview
import com.eahm.theme.compose.spacer.ColumnSpacerMedium

@Composable
fun ProductList(
    list: List<Product>,
    gotoProductCreationClicked: () -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = dimensionResource(id = R.dimen.border_padding),
                ),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.list_item_spacer))
        ) {
            item {
                TextFontH1(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(id = R.dimen.border_padding)),
                    text = stringResource(id = R.string.product_list_title),
                )
            }

            item {
                ColumnSpacerMedium()
            }

            items(list) {
                ProductItem(
                    title = it.title,
                    label = null // TODO: it.price.getPriceWithCurrency(),
                ) {}
            }
        }

        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(10.dp),
            onClick = gotoProductCreationClicked,
        ) {
            Icon(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.placeholder),
                contentDescription = null,
            )
        }
    }
}

@Composable
@ScreenPreview
fun PreviewProductList() {
    AppThemeSurface {
        ProductList(
            list = FakeDataSource.fakeProductList,
            gotoProductCreationClicked = {},
        )
    }
}