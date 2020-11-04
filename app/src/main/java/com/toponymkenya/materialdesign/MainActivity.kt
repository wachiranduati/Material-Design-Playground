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
        val uno : MaterialItem = MaterialItem("one", R.drawable.ic_action_name)
        val du : MaterialItem = MaterialItem("two", R.drawable.ic_action_name)
        val tre : MaterialItem = MaterialItem("three", R.drawable.ic_action_name)
        val qua : MaterialItem = MaterialItem("four", R.drawable.ic_action_name)
        val cinq : MaterialItem = MaterialItem("five", R.drawable.ic_action_name)
        seedData.addAll(listOf(uno, du, tre, qua, cinq))
        return seedData
    }
}