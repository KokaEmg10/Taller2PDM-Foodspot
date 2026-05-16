package com.example.foodspot.data

import com.example.foodspot.model.Dish
import com.example.foodspot.model.Restaurant

class FoodRepositoryImpl : FoodRepository {
    override fun getRestaurants(): List<Restaurant> {
        return sampleRestaurants
    }

    override fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }

    private val sampleRestaurants = listOf(
        Restaurant(
            id = 1,
            name = "CR7 Pizzas",
            description = "Las mejores pizzas de la ciudad. Hechas con ingredientes frescos.",
            imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGl6emF8ZW58MHx8MHx8fDA%3D",
            categories = listOf("Pizzas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Pizza de Pepperoni",
                    description = "Deliciosa pizza de pepperoni.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1733259709671-9dbf22bf02cc?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cGl6emF8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 2,
                    name = "Pizza de Queso",
                    description = "Deliciosa pizza de queso.",
                    imageUrl = "https://images.unsplash.com/photo-1732223229355-95a1433404bf?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8Y2hlZXNlJTIwcGl6emF8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 3,
                    name = "Pizza CR7",
                    description = "Pizza para ganadores, hecha con jamón, queso, y carne.",
                    imageUrl = "https://images.unsplash.com/photo-1655689823464-17db326b023e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGhhbSUyMGNoZWVzZSUyMGFuZCUyMG1lYXQlMjBwaXp6YXxlbnwwfHwwfHx8MA%3D%3D"
                )
            )
        ),
        Restaurant(
            id = 2,
            name = "Las Hamburguesas de Leo",
            description = "Las hamburguesas mas frescas, hechas al grill.",
            imageUrl = "https://plus.unsplash.com/premium_photo-1683619761468-b06992704398?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8YnVyZ2VyfGVufDB8fDB8fHww",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Hamburguesa de carne",
                    description = "Hamburguesa de carne, con tomate, queso, cebolla y nuestra salsa especial.",
                    imageUrl = "https://images.unsplash.com/photo-1603064752734-4c48eff53d05?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YnVyZ2VyfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 2,
                    name = "Hamburguesa de carne doble",
                    description = "Hamburguesa con 2 carnes, incluye tomate, queso, pepinillos y cebolla.",
                    imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YnVyZ2VyfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 3,
                    name = "Hamburguesa con tocino",
                    description = "Hamburguesa de carne, con tomate, queso, pepinillos, cebolla y lechuga. Incluye tocino extra.",
                    imageUrl = "https://images.unsplash.com/photo-1586190848861-99aa4a171e90?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YnVyZ2VyfGVufDB8fDB8fHww"
                )
            )
        ),
        Restaurant(
            id = 3,
            name = "EnsaHaaland",
            description = "Las mejores ensaladas al estilo Noruego.",
            imageUrl = "https://plus.unsplash.com/premium_photo-1673590981774-d9f534e0c617?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8c2FsYWR8ZW58MHx8MHx8fDA%3D",
            categories = listOf("Ensaladas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Ensalada Cesar",
                    description = "Deliciosa ensalada con aderezo cesar.",
                    imageUrl = "https://images.unsplash.com/photo-1669283714145-f97867f6c238?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGNhZXNhciUyMHNhbGFkfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 2,
                    name = "Ensalada griega",
                    description = "Ensalada con la salsa de la casa.",
                    imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8c2FsYWR8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 3,
                    name = "Ensalada Noruega",
                    description = "La ensalada especial de la casa, con nuestra salsa especial.",
                    imageUrl = "https://images.unsplash.com/photo-1572449043416-55f4685c9bb7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fHNhbGFkfGVufDB8fDB8fHww"
                )
            )
        ),
        Restaurant(
            id = 4,
            name = "Sopas Madrid",
            description = "Las mejores sopas, hechas con ingredientes frescos y sabores naturales.",
            imageUrl = "https://images.unsplash.com/photo-1470324161839-ce2bb6fa6bc3?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHNvdXB8ZW58MHx8MHx8fDA%3D",
            categories = listOf("Sopas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Sopa de Tomate",
                    description = "Deliciosa sopa a base de Tomate.",
                    imageUrl = "https://images.unsplash.com/photo-1547592166-23ac45744acd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8c291cHxlbnwwfHwwfHx8MA%3D%3D"
                ),
                Dish(
                    id = 2,
                    name = "Sopa de Tallarines",
                    description = "Deliciosa sopa con fideos.",
                    imageUrl = "https://images.unsplash.com/photo-1555126634-323283e090fa?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8bm9vZGxlJTIwc291cHxlbnwwfHwwfHx8MA%3D%3D"
                ),
                Dish(
                    id = 3,
                    name = "Sopa de carne",
                    description = "Deliciosa sopa de res.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1700695637878-785b595fe61f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHNvdXB8ZW58MHx8MHx8fDA%3D"
                )
            )
        ),
        Restaurant(
            id = 5,
            name = "Los Tacos Primos",
            description = "Los mejores tacos, hechos con tortillas naturales.",
            imageUrl = "https://images.unsplash.com/photo-1545093149-618ce3bcf49d?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8dGFjb3N8ZW58MHx8MHx8fDA%3D",
            categories = listOf("Mexicana"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Tacos de carne",
                    description = "Deliciosos tacos de carne con tortilla natural.",
                    imageUrl = "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dGFjb3N8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 2,
                    name = "Tacos de pollo",
                    description = "Deliciosos tacos de pollo hechos con tortilla natural.",
                    imageUrl = "https://images.unsplash.com/photo-1624300629298-e9de39c13be5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8dGFjb3N8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 3,
                    name = "Tacos de camaron",
                    description = "Deliciosos tacos de camaron con tortilla natural.",
                    imageUrl = "https://images.unsplash.com/photo-1627564803215-ad55bad5c5ea?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHRhY29zfGVufDB8fDB8fHww"
                )
            )
        ),
        Restaurant(
            id = 6,
            name = "Las Pizza Di María",
            description = "Deliciosas pizzas artesanales, con el mejor sabor Argentino.",
            imageUrl = "https://images.unsplash.com/photo-1629654846442-37b7975966e5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGhhbSUyMGNoZWVzZSUyMGFuZCUyMG1lYXQlMjBwaXp6YXxlbnwwfHwwfHx8MA%3D%3D",
            categories = listOf("Pizzas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Pizza de Jamón",
                    description = "Pizza de jamón, hecha a mano con ingredientes frescos.",
                    imageUrl = "https://images.unsplash.com/photo-1672928226087-0ded6da14b1f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGhhbSUyMGNoZWVzZSUyMGFuZCUyMG1lYXQlMjBwaXp6YXxlbnwwfHwwfHx8MA%3D%3D"
                ),
                Dish(
                    id = 2,
                    name = "Pizza grande de jamón",
                    description = "Pizza de jamón grande, mismo sabor, mayor tamaño.",
                    imageUrl = "https://images.unsplash.com/photo-1778448951072-e0c42bbcb93b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8aGFtJTIwY2hlZXNlJTIwYW5kJTIwbWVhdCUyMHBpenphfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 3,
                    name = "Pizza hawaiiana",
                    description = "Pizza de jamón, con piña por encima.",
                    imageUrl = "https://images.unsplash.com/photo-1597715469889-dd75fe4a1765?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8aGF3YWlpYW4lMjBwaXp6YXxlbnwwfHwwfHx8MA%3D%3D"
                )
            )
        ),
        Restaurant(
            id = 7,
            name = "Burger Hut",
            description = "Hamburguesas hechas al grill con amor y calidad.",
            imageUrl = "https://images.unsplash.com/photo-1530554764233-e79e16c91d08?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGJ1cmdlcnxlbnwwfHwwfHx8MA%3D%3D",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Hamburguesa de carne asada",
                    description = "Rica hamburguesa de carne.",
                    imageUrl = "https://images.unsplash.com/photo-1713330801172-03f8d1c0dde7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJ1cmdlcnxlbnwwfHwwfHx8MA%3D%3D"
                ),
                Dish(
                    id = 2,
                    name = "Chicken Burger",
                    description = "Deliciosa hamburguesa de pollo.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1683655058728-415f4f2674bf?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2hpY2tlbiUyMGJ1cmdlcnxlbnwwfHwwfHx8MA%3D%3D"
                ),
                Dish(
                    id = 3,
                    name = "Vegan Burger",
                    description = "Deliciosa hamburguesa vegana.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1668618295237-f1d8666812c9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8dmVnYW4lMjBidXJnZXJ8ZW58MHx8MHx8fDA%3D"
                )
            )
        ),
        Restaurant(
            id = 8,
            name = "Rica Salad",
            description = "Ricas ensaladas naturales.",
            imageUrl = "https://plus.unsplash.com/premium_photo-1700089483464-4f76cc3d360b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fHNhbGFkfGVufDB8fDB8fHww",
            categories = listOf("Ensaladas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Ensalada Royal",
                    description = "Ensalada con los mejores ingredientes frescos.",
                    imageUrl = "https://images.unsplash.com/photo-1568158879083-c42860933ed7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHNhbGFkfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 2,
                    name = "Ensalada con fresa",
                    description = "Ensalada con ingredientes frescos y fresas.",
                    imageUrl = "https://images.unsplash.com/photo-1570197571499-166b36435e9f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHNhbGFkfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 3,
                    name = "Ensalada con proteina",
                    description = "Ensalada fresca con proteina agregada.",
                    imageUrl = "https://images.unsplash.com/photo-1546069901-ba9599a7e63c?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8c2FsYWR8ZW58MHx8MHx8fDA%3D"
                )
            )
        ),
        Restaurant(
            id = 9,
            name = "Las Sopas de Lucy",
            description = "Las mejores sopas, hechas con amor.",
            imageUrl = "https://images.unsplash.com/photo-1505253668822-42074d58a7c6?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fHNvdXB8ZW58MHx8MHx8fDA%3D",
            categories = listOf("Sopas"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Sopa de papa",
                    description = "Rica sopa a base de papa.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1700673590238-a0e3a3795ae2?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjV8fHNvdXB8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 2,
                    name = "Sopa de pollo",
                    description = "Rica sopa de pollo y vegetales.",
                    imageUrl = "https://images.unsplash.com/photo-1665594051407-7385d281ad76?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjN8fHNvdXB8ZW58MHx8MHx8fDA%3D"
                ),
                Dish(
                    id = 3,
                    name = "Sopa de tomate y carne",
                    description = "Sopa de base de tomate con carne dentro.",
                    imageUrl = "https://images.unsplash.com/photo-1534939561126-855b8675edd7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fHNvdXB8ZW58MHx8MHx8fDA%3D"
                )
            )
        ),
        Restaurant(
            id = 10,
            name = "Koka Tacos",
            description = "Tacos con el sabor mexicano mas autentico.",
            imageUrl = "https://images.unsplash.com/photo-1574782090889-7567420ce7e9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDN8fHRhY29zfGVufDB8fDB8fHww",
            categories = listOf("Mexicana"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Tacos de pollo",
                    description = "Ricos tacos de pollo con sabor mexicano autentico.",
                    imageUrl = "https://images.unsplash.com/photo-1660180750968-4fbc84789a96?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjd8fHRhY29zfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 2,
                    name = "Tacos de longaniza",
                    description = "Tacos con deliciosa longaniza",
                    imageUrl = "https://images.unsplash.com/photo-1588556008426-af415581d44b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDB8fHRhY29zfGVufDB8fDB8fHww"
                ),
                Dish(
                    id = 3,
                    name = "Combo Koka",
                    description = "Combo de 7 tacos de asada.",
                    imageUrl = "https://plus.unsplash.com/premium_photo-1678051141689-1f7a7861b3b4?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fHRhY29zfGVufDB8fDB8fHww"
                )
            )
        )
    )
}