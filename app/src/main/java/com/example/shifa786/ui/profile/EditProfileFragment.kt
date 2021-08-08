package com.example.shifa786.ui.profile

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.shifa786.BaseFragment
import com.example.shifa786.R
import com.example.shifa786.databinding.FragmentEditProfileBinding

class EditProfileFragment : BaseFragment<FragmentEditProfileBinding>() {


    override fun getFragmentLayout() = R.layout.fragment_edit_profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_edit_profile,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_save -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}