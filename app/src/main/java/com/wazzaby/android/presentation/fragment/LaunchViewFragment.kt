package com.wazzaby.android.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.wazzaby.android.R
import com.wazzaby.android.databinding.FragmentLaunchViewBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class LaunchViewFragment : Fragment() {

    private lateinit var binding: FragmentLaunchViewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_launch_view, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }



    private fun NavigationRoot() {
        CoroutineScope(Dispatchers.Main) .launch {
            delay(100)
            //val bundle = bundleOf("user_input" to  binding.editText.text.toString())
            findNavController().navigate(R.id.launch_to_loginview)
        }
    }

    override fun onStart() {
        super.onStart()
        NavigationRoot()
    }

}