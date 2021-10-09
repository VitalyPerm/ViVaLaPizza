package com.vitaly.vivalapizza.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vitaly.vivalapizza.R
import com.vitaly.vivalapizza.databinding.FragmentMainBinding
import com.vitaly.vivalapizza.utils.APP_ACTIVITY

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var detailsDialogFragment: DetailsDialogFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        binding.btnCheckout.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_mainFragment_to_cartFragment)
        }
        binding.btnDetails.setOnClickListener {
            detailsDialogFragment = DetailsDialogFragment()
            detailsDialogFragment.show(APP_ACTIVITY.supportFragmentManager, "")
        }
    }
}