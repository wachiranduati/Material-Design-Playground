package com.toponymkenya.materialdesign.Animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.toponymkenya.materialdesign.R

class AnimatorSetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animator_set, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animstTxt = view.findViewById<TextView>(R.id.animSetTextView)
        val animstImgVw = view.findViewById<ImageView>(R.id.animSetImageView)
        val animBtn = view.findViewById<Button>(R.id.animateMeBtn)

        val animTextCoordinates = IntArray(2)
        val imageTwoCoordinates = IntArray(2)

        animstTxt.getLocationOnScreen(animTextCoordinates)
        animstImgVw.getLocationOnScreen(imageTwoCoordinates)

        val animTextXPosition = animTextCoordinates[0].toFloat()
        val imageInitialXPosition = imageTwoCoordinates[0].toFloat()
        val animTextYPosition = animTextCoordinates[1].toFloat()
        val imageInitialYPosition = imageTwoCoordinates[1].toFloat()

        val animTextTranslationY = PropertyValuesHolder.ofFloat(
            View.TRANSLATION_Y,
            -animTextYPosition,
            imageInitialYPosition
        )

        val imageTranslationY = PropertyValuesHolder.ofFloat(
            View.TRANSLATION_Y,
            imageInitialYPosition,
            -animTextYPosition
        )

        val animTextTranslationX = PropertyValuesHolder.ofFloat(
            View.TRANSLATION_X,
            animTextXPosition,
            -imageInitialYPosition
        )

        val imageTranslationX = PropertyValuesHolder.ofFloat(
            View.TRANSLATION_X,
            imageInitialXPosition,
            imageInitialYPosition
        )


        val scaleY1 = ObjectAnimator.ofPropertyValuesHolder(animstTxt, animTextTranslationY, animTextTranslationX).apply {
            duration = 4000
            interpolator = AnticipateOvershootInterpolator()
        }

        val scaleY = ObjectAnimator.ofPropertyValuesHolder(animstImgVw, imageTranslationY, imageTranslationX).apply {
            duration = 4000
            interpolator = AnticipateOvershootInterpolator()
        }

        val playSet = AnimatorSet().apply {
            play(scaleY1).with(scaleY)
        }
        animBtn.setOnClickListener {
            playSet.start()
        }
    }
}