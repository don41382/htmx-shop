package com.rocketsolutions.htmxshop.adapters.database

import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ProductRepository {

    private val products =
        listOf(
            Product(
                id = UUID.randomUUID(),
                title = "Cozy Turtle Tank",
                description = "A spacious and comfortable home for your shelled friend.",
                price = 129.99f,
                imageUrl = "https://page-images.websim.ai/Cozy%20Turtle%20Tank_1024x495xrETq0VAFUKka4o0JJxd805f0e096d81.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Premium Turtle Pellets",
                description = "Nutritious and delicious food for healthy turtles.",
                price = 24.99f,
                imageUrl = "https://page-images.websim.ai/Premium%20Turtle%20Pellets_1024x495xrETq0VAFUKka4o0JJxfe7d9c16d964b.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "UVB Heat Lamp",
                description = "Essential for your turtle's health and warmth.",
                price = 39.99f,
                imageUrl = "https://page-images.websim.ai/UVB%20Heat%20Lamp_1024x495xrETq0VAFUKka4o0JJx3e5153da9da8e.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Aquatic Filter System",
                description = "Keep your turtle's water clean and fresh.",
                price = 79.99f,
                imageUrl = "https://page-images.websim.ai/Aquatic%20Filter%20System_1024x495xrETq0VAFUKka4o0JJx5c223c4d85d21.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Turtle Playground Set",
                description = "Fun accessories to keep your turtle entertained.",
                price = 49.99f,
                imageUrl = "https://page-images.websim.ai/Turtle%20Playground%20Set_1024x495xrETq0VAFUKka4o0JJx036976742164b.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Calcium Supplement",
                description = "Essential for strong shells and bones.",
                price = 14.99f,
                imageUrl = "https://page-images.websim.ai/Calcium%20Supplement_1024x495xrETq0VAFUKka4o0JJx83100975f3392.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Floating Turtle Dock",
                description = "A perfect basking spot for your aquatic turtle.",
                price = 34.99f,
                imageUrl = "https://page-images.websim.ai/Floating%20Turtle%20Dock_1024x495xrETq0VAFUKka4o0JJx5370d8d6b6fc8.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Digital Thermometer",
                description = "Monitor your turtle's habitat temperature accurately.",
                price = 19.99f,
                imageUrl = "https://page-images.websim.ai/Digital%20Thermometer_1024x495xrETq0VAFUKka4o0JJx95e0a1a746ccb.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Turtle Care Guide",
                description = "Comprehensive book on turtle care and maintenance.",
                price = 29.99f,
                imageUrl = "https://page-images.websim.ai/Turtle%20Care%20Guide_1024x495xrETq0VAFUKka4o0JJx5e2ba3dfde221.jpg",
            ),
            Product(
                id = UUID.randomUUID(),
                title = "Turtle First Aid Kit",
                description = "Essential supplies for turtle emergencies.",
                price = 44.99f,
                imageUrl = "https://page-images.websim.ai/Turtle%20First%20Aid%20Kit_1024x495xrETq0VAFUKka4o0JJxae5f21159a2d4.jpg",
            ),
        )

    data class Product(
        val id: UUID,
        val title: String,
        val description: String,
        val price: Float,
        val imageUrl: String,
    )

    fun getAllProducts() = products
}
