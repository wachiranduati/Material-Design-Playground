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
        seedData.addAll(getMaterialCategories())
        val adp = MainRecyclerViewAdapter(seedData)
        val lytmng = LinearLayoutManager(activity)
        mainRecycl.apply {
            adapter = adp
            setHasFixedSize(true)
            layoutManager = lytmng
        }
    }

}