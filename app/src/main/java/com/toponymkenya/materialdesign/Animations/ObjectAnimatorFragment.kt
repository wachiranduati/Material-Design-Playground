package com.toponymkenya.materialdesign.Animations

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.Button
import android.widget.TextView
import com.toponymkenya.materialdesign.R

class ObjectAnimatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_object_animator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animTxtVw = view.findViewById<TextView>(R.id.objectAnimTextView)
        val animBtn = view.findViewById<Button>(R.id.objectAnimButton)

        val scaleX = ObjectAnimator.ofFloat(animTxtVw, View.SCALE_X, 0.7f, 1f).apply {
            duration = 4000
            interpolator = AnticipateOvershootInterpolator()
        }

        val scaleY = ObjectAnimator.ofFloat(animTxtVw, View.SCALE_Y, 0.7f, 1f).apply {
            duration = 4000
            interpolator = AnticipateOvershootInterpolator()
        }

        animBtn.setOnClickListener {
            scaleX.start()
            scaleY.start()
        }
    }


}