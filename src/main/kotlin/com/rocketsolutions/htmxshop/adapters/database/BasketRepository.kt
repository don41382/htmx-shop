package com.rocketsolutions.htmxshop.adapters.database

import com.rocketsolutions.htmxshop.adapters.database.ProductRepository.Product
import org.springframework.stereotype.Repository

@Repository
class BasketRepository {
    private val basket = emptyList<Product>().toMutableList()

    fun addToBasket(product: Product) = basket.add(product)

    fun findAll() = basket.toList()
}
