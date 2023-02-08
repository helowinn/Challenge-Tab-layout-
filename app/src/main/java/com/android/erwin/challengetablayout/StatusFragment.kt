package com.android.erwin.challengetablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.erwin.challengetablayout.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {

    private var _binding : FragmentStatusBinding? = null
    private val binding : FragmentStatusBinding
    get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStatusBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}