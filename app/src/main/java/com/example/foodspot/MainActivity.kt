package com.example.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.foodspot.ui.FoodViewModel
import com.example.foodspot.ui.screens.RestaurantDetailScreen
import com.example.foodspot.ui.screens.RestaurantListScreen
import com.example.foodspot.ui.screens.SearchScreen
import com.example.foodspot.ui.theme.FoodSpotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FoodSpotAppNavigation()
                }
            }
        }
    }
}

@Composable
fun FoodSpotAppNavigation() {
    val navController = rememberNavController()
    val foodViewModel: FoodViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "restaurantList"
    ) {
        composable("restaurantList") {
            RestaurantListScreen(
                viewModel = foodViewModel,
                onRestaurantClick = { id ->
                    navController.navigate("restaurantDetail/$id")
                },
                onSearchClick = {
                    navController.navigate("search")
                }
            )
        }

        composable(
            route = "restaurantDetail/{restaurantId}",
            arguments = listOf(navArgument("restaurantId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("restaurantId") ?: 0
            RestaurantDetailScreen(
                restaurantId = id,
                viewModel = foodViewModel,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable("search") {
            SearchScreen(
                viewModel = foodViewModel,
                onRestaurantClick = { id ->
                    navController.navigate("restaurantDetail/$id")
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}