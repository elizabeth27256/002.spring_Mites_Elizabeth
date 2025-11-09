package com.pucetec.products.controllers

import com.pucetec.products.models.Product
import com.pucetec.products.services.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/product")

class ProductController (
    private val productService: ProductService
){
    @PostMapping
    fun save(@RequestBody product: Product) : Product? {
        return productService.save(product)
    }

    @GetMapping
    fun finAll(): List<Product>{
        return productService.findAll()
    }
}