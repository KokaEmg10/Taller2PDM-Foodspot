package com.example.foodspot.data

import com.example.foodspot.model.Restaurant

interface FoodRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
}