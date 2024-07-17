package com.rocketsolutions.htmxshop.adapters.database

data class Product(
    val id: java.util.UUID,
    val title: String,
    val description: String,
    val price: Float,
    val imageUrl: String,
)
