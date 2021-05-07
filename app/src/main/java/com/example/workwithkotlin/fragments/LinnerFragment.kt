package com.example.workwithkotlin.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.workwithkotlin.R
import kotlinx.android.synthetic.main.fragment_linner.*

class LinnerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_linner, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle = arguments
        val name = bundle?.getString("text")
        tvFragmentLinner.text = name
        super.onViewCreated(view, savedInstanceState)
    }
}