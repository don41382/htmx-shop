package com.rocketsolutions.htmxshop.adapters.database

import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ProductRepository {
    data class Product(
        val id: UUID,
        val title: String,
        val description: String,
        val price: Float,
        val imageUrl: String,
    )

    private val products = listOf<Product>()

    fun findAll(): List<Product> = products
}
