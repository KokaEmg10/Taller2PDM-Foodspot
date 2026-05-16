package com.example.foodspot.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodspot.data.FoodRepository
import com.example.foodspot.data.FoodRepositoryImpl
import com.example.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class FoodViewModel(
    private val repository: FoodRepository = FoodRepositoryImpl()
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedCategory = MutableStateFlow("Todas")
    val selectedCategory: StateFlow<String> = _selectedCategory.asStateFlow()

    val categories = listOf("Todas", "Pizzas", "Hamburguesas", "Ensaladas", "Sopas", "Mexicana")

    val restaurants: StateFlow<List<Restaurant>> = combine(
        _searchQuery,
        _selectedCategory
    ) { query, category ->
        repository.getRestaurants().filter { restaurant ->
            val matchesQuery = restaurant.name.contains(query, ignoreCase = true) ||
                    restaurant.description.contains(query, ignoreCase = true)

            val matchesCategory = category == "Todas" || restaurant.categories.any {
                it.equals(category, ignoreCase = true)
            }

            matchesQuery && matchesCategory
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun onSearchQueryChange(newQuery: String) {
        _searchQuery.value = newQuery
    }

    fun onCategorySelect(category: String) {
        _selectedCategory.value = category
    }

    fun getRestaurantById(id: Int): Restaurant? {
        return repository.getRestaurantById(id)
    }
}