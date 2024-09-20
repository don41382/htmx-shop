package com.rocketsolutions.htmxshop.web

import com.rocketsolutions.htmxshop.application.service.ProductService
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.util.UUID

@Controller
@RequestMapping("/")
class IndexController(
    private val productService: ProductService,
) {

    @GetMapping("")
    fun index(q: String?, model: Model) = "list".also {
        if (q == null) {
            model.addAttribute("products", productService.allProducts())
        } else {
            model.addAttribute("products", productService.searchProduct(q))
        }
        model.addAttribute("query", q)
        model.addAttribute("basketCount", productService.productsInBasket().size)
    }

    @GetMapping("/addToBasket/{product-id}")
    fun addToBasket(@PathVariable("product-id") id: UUID, response: HttpServletResponse) =
        productService.addToBasket(id)?.let {
            ResponseEntity.ok(productService.productsInBasket().size.toString())
                .also { response.addHeader("Hx-Trigger", TRIGGER_BASKET_REFRESH_EVENT) }
        }

    @GetMapping("/basketCount")
    fun basketCount() = ResponseEntity.ok(productService.productsInBasket().size.toString())

    @PostMapping("/search")
    fun search(q: String, model: Model, response: HttpServletResponse) = "component/productlist".also {
        model.addAttribute(
            "products",
            productService.allProducts().filter { it.title.lowercase().contains(q.lowercase()) },
        )
        response.addHeader("HX-Push-Url", if (q.isNotBlank()) "/?q=$q" else "/")
    }

    @GetMapping("/more")
    fun more(model: Model) = "component/productlist".also {
        model.addAttribute("products", productService.allProducts().shuffled())
    }

    companion object {
        const val TRIGGER_BASKET_REFRESH_EVENT = "triggerBasketRefreshEvent"
    }
}
