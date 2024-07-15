package com.rocketsolutions.htmxshop.web

import com.rocketsolutions.htmxshop.application.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class IndexController(
    private val productService: ProductService,
) {
    @GetMapping("/")
    fun index(model: Model): String = "index"
}
