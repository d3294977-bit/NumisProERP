package com.numisproerp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "purchases")
data class Purchase(
    @PrimaryKey
    val purchaseId: String,
    val date: Long,
    val catalogId: String,
    val supplierId: String,
    val quantity: Int,
    val pricePerUnit: Double,
    val additionalCosts: Double,
    val totalAmount: Double
)