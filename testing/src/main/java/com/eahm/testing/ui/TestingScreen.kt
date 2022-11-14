package com.eahm.testing.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.eahm.theme.compose.ButtonDefault

@Composable
fun TestingScreen(
    status: String,
    prepareDatabaseForProviderProductTesting: () -> Unit,
) {
    LazyColumn {
        item {
            Text(text = "Test Environment")
            Text(text = "Always remember to set the correct host and port for the service that you need")
        }
        item {
            Text(text = "status: $status")
        }
        item {
            ButtonDefault(text = "prepare data for product provider testing") {
                prepareDatabaseForProviderProductTesting()
            }
        }
    }
}

@Preview
@Composable
fun PreviewTestingScreen() {
    TestingScreen(
        status = "test",
        prepareDatabaseForProviderProductTesting = {},
    )
}