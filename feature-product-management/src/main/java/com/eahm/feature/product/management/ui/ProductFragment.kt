package com.eahm.feature.product.management.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.eahm.theme.compose.AppThemeSurface
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductFragment : Fragment() {

    private val viewModel: ProductViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                AppThemeSurface {
                    val state by viewModel.state.collectAsState()

                    ProductScreen(
                        state = state,
                        gotoProductCreationClicked = {},
                    )
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.getProductList()
    }
}