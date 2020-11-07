package com.toponymkenya.materialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.toponymkenya.materialdesign.adapters.MainRecyclerViewAdapter
import com.toponymkenya.materialdesign.adapters.MaterialItem

class HomeFragment : Fragment() {
    var seedData : ArrayList<MaterialItem> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root : View =  inflater.inflate(R.layout.fragment_home, container, false)
        setUpRecyclerView(root)
        return root
    }

    private fun setUpRecyclerView(rt : View) {
        val mainRecycl : RecyclerView = rt.findViewById(R.id.mainRecyclerView)
        val adp = MainRecyclerViewAdapter(populateData())
        val lytmng = LinearLayoutManager(activity)
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