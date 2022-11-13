package com.eahm.testing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.eahm.theme.compose.AppThemeSurface
import com.eahm.theme.compose.ButtonDefault
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestingFragment : Fragment() {

    private val viewModel: TestingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val status by viewModel.status.collectAsState()

                AppThemeSurface {
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
                                viewModel.prepareDatabaseForProviderProductTesting()
                            }
                        }
                    }
                }
            }
        }
    }
}