package com.pucetec.products.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.core.GenericTypeResolver


@Entity
data class Product (
    @Id @GeneratedValue( strategy = GenerationType. IDENTITY)
    val id: Long = 0L,
    val name: String = "",
    val price: Double = 0.0
)