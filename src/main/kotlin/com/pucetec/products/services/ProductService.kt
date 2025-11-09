package com.pucetec.products.services

import com.pucetec.products.models.Product
import com.pucetec.products.repositories.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {
    fun save(product: Product): Product? {
        //Primero buscamos si existe el producto con ese nombre
        //Luego si no existe, lo guardamos
        // Si si existe, retornamos null
        val name = product.name
        val existingProduct: Product? = productRepository.findByName(name)
        if (existingProduct == null) {
            productRepository.save(product)
            return product
        } else {
            return null
        }
    }

    fun findAll(): List<Product> = productRepository.findAll()
}