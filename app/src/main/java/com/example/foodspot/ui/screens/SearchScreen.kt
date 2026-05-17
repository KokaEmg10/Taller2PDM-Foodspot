package com.example.foodspot.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodspot.ui.FoodViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    viewModel: FoodViewModel,
    onRestaurantClick: (Int) -> Unit,
    onBackClick: () -> Unit
) {
    val searchQuery by viewModel.searchQuery.collectAsState()
    val restaurants by viewModel.restaurants.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Buscar", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    TextButton(
                        onClick = {
                            viewModel.onSearchQueryChange("")
                            onBackClick()
                        }
                    ) {
                        Text("< Volver")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { viewModel.onSearchQueryChange(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                placeholder = { Text("Escribe el nombre de un restaurante o platillo...") },
                singleLine = true
            )

            if (searchQuery.isBlank()) {
                Box(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Introduce un término para comenzar la búsqueda",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else if (restaurants.isEmpty()) {
                Box(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No se encontraron resultados",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f).fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(restaurants) { restaurant ->
                        Card(
                            onClick = { onRestaurantClick(restaurant.id) },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = restaurant.name,
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = restaurant.description,
                                    style = MaterialTheme.typography.bodySmall,
                                    maxLines = 2
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    restaurant.categories.forEach { category ->
                                        SuggestionChip(
                                            onClick = {},
                                            label = { Text(category, style = MaterialTheme.typography.labelSmall) }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}