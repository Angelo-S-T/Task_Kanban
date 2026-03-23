package com.angelo.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.angelo.task.R
import com.angelo.task.databinding.FragmentFormTaskBinding
import com.angelo.task.databinding.FragmentLoginBinding
import com.angelo.task.databinding.FragmentRecoverAccountBinding
import com.angelo.task.ui.util.initToolbar


class FormTaskFragment : Fragment() {

    private var _binding: FragmentFormTaskBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentFormTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolBar)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}