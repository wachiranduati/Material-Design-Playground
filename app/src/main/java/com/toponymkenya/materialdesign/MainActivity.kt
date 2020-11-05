package com.toponymkenya.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.toponymkenya.materialdesign.adapters.MainRecyclerViewAdapter
import com.toponymkenya.materialdesign.adapters.MaterialItem

class MainActivity : AppCompatActivity() {
     var seedData : ArrayList<MaterialItem> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainRecycl : RecyclerView = findViewById(R.id.mainRecyclerView)
        val adp = MainRecyclerViewAdapter(populateData())
        val lytmng = LinearLayoutManager(this)
        mainRecycl.apply {
            adapter = adp
            setHasFixedSize(true)
            layoutManager = lytmng
        }
    }

    private fun populateData() : ArrayList<MaterialItem>{
        val typography = MaterialItem("Typography", R.drawable.typography)
        val buttons = MaterialItem("Buttons", R.drawable.buttons)
        val palette = MaterialItem("Color Palette", R.drawable.color_palette)
        val animations = MaterialItem("Animations", R.drawable.animations)
        val input = MaterialItem("Input", R.drawable.input)
        val bottomnav = MaterialItem("Bottom Navigation", R.drawable.bottom_nav)
        val grids = MaterialItem("Grids", R.drawable.grids)
        val motion = MaterialItem("Motion", R.drawable.motions)
        val dialogs = MaterialItem("Dialogs", R.drawable.dialogs)
        seedData.addAll(listOf(typography, buttons, palette, animations, input, bottomnav, grids, motion, dialogs))
        return seedData
    }
}