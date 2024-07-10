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

    fun searchProduct(query: String) =
        productRepository.getAllProducts().filter { it.title.lowercase().contains(query.lowercase()) }

    fun productsInBasket() = basketRepository.findAll()

    fun addToBasket(id: UUID) = productRepository.getAllProducts().find { it.id == id }
        ?.let { product -> basketRepository.insertProduct(product) }
}
