package com.toponymkenya.materialdesign.Animations

import android.animation.ValueAnimator
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.google.android.material.color.MaterialColors.getColor
import com.toponymkenya.materialdesign.R

class ValueAnimatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_value_animator, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animatedText = view.findViewById<TextView>(R.id.valAnimTextView)
        val animButton = view.findViewById<Button>(R.id.valAnimBtn)

        val posY = ValueAnimator.ofFloat(0f, 200f).apply {
            duration = 5000
            addUpdateListener {
                animatedText.translationY = it.animatedValue as Float
            }
        }

        val rgbC = ValueAnimator.ofArgb(Color.BLACK, Color.CYAN).apply {
            duration = 5000
            addUpdateListener {
                animatedText.setTextColor(it.animatedValue as Int)
            }
        }

        animButton.setOnClickListener {
            posY.start()
            rgbC.start()
        }
    }
}