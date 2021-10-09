package com.vitaly.vivalapizza.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vitaly.vivalapizza.R
import com.vitaly.vivalapizza.databinding.FragmentCartBinding
import com.vitaly.vivalapizza.utils.APP_ACTIVITY

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        binding.btnPlaceOrder.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_cartFragment_to_endFragment)
        }
    }
}