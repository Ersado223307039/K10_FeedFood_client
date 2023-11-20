package com.example.feedfood_client

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: MutableList<Food>) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_food_list, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addFood(food: Food){
        foodList.add(food)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        val food = foodList[position]
        holder.ivGambarFood.setImageResource(food.gambarfood)
        holder.tvNamaFood.text = food.namafood
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivGambarFood : ImageView = itemView.findViewById(R.id.iv_food)
        val tvNamaFood : TextView = itemView.findViewById(R.id.tv_food)
    }

}