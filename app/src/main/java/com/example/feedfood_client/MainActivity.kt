package com.example.feedfood_client

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewFood = findViewById<RecyclerView>(R.id.rv_food)


        val foodList = createFoodList()
        val adapter = FoodAdapter(foodList)
        recyclerViewFood.adapter = adapter
    }

    private fun createFoodList(): MutableList<Food> {
        val foodList = mutableListOf<Food>()

        val food1 = Food(R.drawable.feed, "Burger")
        foodList.add(food1)

        val food2 = Food(R.drawable.feed, "Pizza")
        foodList.add(food2)

        return foodList
    }


}