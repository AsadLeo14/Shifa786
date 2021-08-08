package com.example.shifa786

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment


abstract class BaseFragment<DataBinding : ViewDataBinding> : Fragment() {

    private lateinit var dataBinding: DataBinding
    protected val binding get() = dataBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, getFragmentLayout(), container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //ViewModel is set as Binding Variable

        dataBinding.apply {
            lifecycleOwner = viewLifecycleOwner
        }

    }

    protected abstract fun getFragmentLayout(): Int

}