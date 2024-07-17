package com.rocketsolutions.htmxshop.adapters.database

import org.springframework.stereotype.Repository

@Repository
class ProductRepository {
    private val products = listOf<Product>()

    fun findAll(): List<Product> = products
}
