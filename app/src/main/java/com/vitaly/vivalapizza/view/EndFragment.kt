package com.vitaly.vivalapizza.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vitaly.vivalapizza.R
import com.vitaly.vivalapizza.databinding.FragmentEndBinding
import com.vitaly.vivalapizza.utils.APP_ACTIVITY

class EndFragment : Fragment() {
    private lateinit var binding: FragmentEndBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        requireActivity().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        binding.btnBackToMenu.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_endFragment_to_mainFragment)
        }
    }
}
