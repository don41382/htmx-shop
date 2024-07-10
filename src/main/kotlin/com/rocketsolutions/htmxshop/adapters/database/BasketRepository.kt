package com.rocketsolutions.htmxshop.adapters.database

import org.springframework.stereotype.Repository

@Repository
class BasketRepository {
    private val basket = emptyList<ProductRepository.Product>().toMutableList()

    fun insertProduct(product: ProductRepository.Product) {
        basket.add(product)
    }

    fun findAll() = basket.toList()
}
