package com.rocketsolutions.htmxshop.application.service

import com.rocketsolutions.htmxshop.adapters.database.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository,
) {
    fun allProducts() = productRepository.findAll()

    fun searchProduct(query: String) =
        productRepository.findAll().filter {
            it.title.contains(query, ignoreCase = true)
        }
}
