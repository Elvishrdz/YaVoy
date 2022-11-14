package com.eahm.testing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.eahm.testing.ui.TestingScreen
import com.eahm.theme.compose.AppThemeSurface
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestingFragment : Fragment() {

    private val viewModel: TestingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val status by viewModel.status.collectAsState()

                AppThemeSurface {
                    TestingScreen(
                        status = status,
                        prepareDatabaseForProviderProductTesting = viewModel::prepareDatabaseForProviderProductTesting,
                    )
                }
            }
        }
    }
}