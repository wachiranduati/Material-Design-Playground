package com.toponymkenya.materialdesign.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.toponymkenya.materialdesign.R

class MainRecyclerViewAdapter(val materialItems : List<MaterialItem>) : RecyclerView.Adapter<MainRecyclerViewAdapter.MyViewHolder>(){
    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val titleTVw : TextView = view.findViewById(R.id.materialItemTextView)
        val iconImg : ImageView = view.findViewById(R.id.iconimageView)
        val categoryContainer : ConstraintLayout = view.findViewById(R.id.materialCategoryConstraintLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_options,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.iconImg.setImageResource(materialItems[position].icon)
        holder.titleTVw.text = materialItems[position].name
        holder.categoryContainer.setOnClickListener {
            it.findNavController().navigate(materialItems[position].navId)
        }
    }

    override fun getItemCount(): Int {
        return materialItems.size
    }

    companion object{
        private const val TAG = "MainRecyclerViewAdapter"
    }
}