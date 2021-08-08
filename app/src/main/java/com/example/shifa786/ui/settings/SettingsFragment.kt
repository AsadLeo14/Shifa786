package com.example.shifa786.ui.settings

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shifa786.BaseFragment
import com.example.shifa786.R
import com.example.shifa786.databinding.FragmentSettingsBinding
import com.example.shifa786.ui.home.HomeViewModel

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    private val settingsViewModel: SettingsViewModel by activityViewModels()

    override fun getFragmentLayout() = R.layout.fragment_settings

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = settingsViewModel
        settingsViewModel.eventObserver.observe(viewLifecycleOwner){
            it.getContentIfNotHandled()?.let { event ->
                when(event){
                    SettingsEvent.PROFILE -> {
                        findNavController().navigate(R.id.navigation_profile)
                    }
                    SettingsEvent.CHANGE_PASSWORD -> {}
                    SettingsEvent.TERMS_AND_CONDITION -> {}
                    SettingsEvent.PRIVACY_POLICY -> {}
                    SettingsEvent.LOGOUT -> {}
                }
            }
        }
    }

}