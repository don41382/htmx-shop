package com.rocketsolutions.htmxshop.application.service

import com.rocketsolutions.htmxshop.adapters.database.BasketRepository
import com.rocketsolutions.htmxshop.adapters.database.ProductRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ProductService(
    private val productRepository: ProductRepository,
    private val basketRepository: BasketRepository,
) {
    fun allProducts() = productRepository.getAllProducts()

    fun basketSize() = basketRepository.findAll().size

    fun addToBasket(productId: UUID) =
        productRepository
            .getAllProducts()
            .find { it.id == productId }
            ?.let { product -> basketRepository.addToBasket(product) }
}
