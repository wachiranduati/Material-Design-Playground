package com.toponymkenya.materialdesign.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.toponymkenya.materialdesign.R

class MainRecyclerViewAdapter(val materialItems : List<MaterialItem>) : RecyclerView.Adapter<MainRecyclerViewAdapter.MyViewHolder>(){
    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val titleTVw : TextView = view.findViewById(R.id.materialItemTextView)
        val iconImg : ImageView = view.findViewById(R.id.iconimageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_options,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.iconImg.setImageResource(materialItems[position].icon)
        holder.titleTVw.text = materialItems[position].name
    }

    override fun getItemCount(): Int {
        return materialItems.size
    }
}