package com.toponymkenya.materialdesign.Palette

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.palette.graphics.Palette
import com.toponymkenya.materialdesign.R


class PaletteFragment : Fragment() {
    val defaultColour : Int = R.color.white
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root : View =  inflater.inflate(R.layout.fragment_palette, container, false)
        setUpPalette(root)
        return root
    }

    private fun setUpPalette(vw : View) {
        val bitmap : Bitmap = BitmapFactory.decodeResource(requireContext().resources, R.drawable.sotik)
        val palette : Palette = Palette.Builder(bitmap).generate()

        vw.findViewById<TextView>(R.id.lightVibrantTxtVew).apply {
            val lightVarnt = palette.getLightVibrantColor(defaultColour)
            setBackgroundColor(lightVarnt)
        }

        vw.findViewById<TextView>(R.id.VibrantTxtVw).apply {
            val vibrant = palette.getVibrantColor(defaultColour)
            setBackgroundColor(vibrant)
        }

        vw.findViewById<TextView>(R.id.darkVibrant).apply {
            val darkVibrant = palette.getDarkVibrantColor(defaultColour)
            setBackgroundColor(darkVibrant)
        }

        vw.findViewById<TextView>(R.id.lightMuted).apply {
            val lightMuted = palette.getLightMutedColor(defaultColour)
            setBackgroundColor(lightMuted)
        }

        vw.findViewById<TextView>(R.id.mutedTxtVw).apply {
            val muted = palette.getMutedColor(defaultColour)
            setBackgroundColor(muted)
        }

        vw.findViewById<TextView>(R.id.darkMutedTxtVw).apply {
            val darkMute = palette.getDarkMutedColor(defaultColour)
            setBackgroundColor(darkMute)
        }
    }

}