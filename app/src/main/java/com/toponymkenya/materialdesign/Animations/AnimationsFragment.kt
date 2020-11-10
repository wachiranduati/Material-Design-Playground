package com.toponymkenya.materialdesign.Animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.toponymkenya.materialdesign.R


class AnimationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root : View = inflater.inflate(R.layout.fragment_animations, container, false)
        setUpAnimationsHomeScreen(root)
        return root
    }

    private fun setUpAnimationsHomeScreen(rt: View) {
        rt.findViewById<Button>(R.id.valueAnimatorButton).setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragment_to_valueAnimatorFragment)
        }

        rt.findViewById<Button>(R.id.objectAnimatorButton).setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragment_to_objectAnimatorFragment)
        }

        rt.findViewById<Button>(R.id.animatorSetButton).setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragment_to_animatorSetFragment)
        }

        rt.findViewById<Button>(R.id.layoutTransitionButton).setOnClickListener {
            findNavController().navigate(R.id.action_animationsFragment_to_layoutTransitionFragment)
        }

    }

}