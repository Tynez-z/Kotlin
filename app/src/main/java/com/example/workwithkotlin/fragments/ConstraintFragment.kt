package com.example.workwithkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.workwithkotlin.R
import kotlinx.android.synthetic.main.fragment_constraint.*


class ConstraintFragment : Fragment() {

    companion object {
        fun getNewInstance(args: Bundle?): ConstraintFragment {
            val constraintFragment = ConstraintFragment()
            constraintFragment.arguments = args
            return constraintFragment
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val name = arguments?. getString("text")
        tvFragmentConstraint.text = "$name"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_constraint, container, false)
    }
}

