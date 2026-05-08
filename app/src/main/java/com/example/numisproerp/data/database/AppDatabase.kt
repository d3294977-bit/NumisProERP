package com.numisproerp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.numisproerp.data.dao.CatalogDao
import com.numisproerp.data.dao.ClientDao
import com.numisproerp.data.dao.OtherExpenseDao
import com.numisproerp.data.dao.ProductDao
import com.numisproerp.data.dao.PurchaseDao
import com.numisproerp.data.dao.SaleDao
import com.numisproerp.data.dao.SupplierDao
import com.numisproerp.data.entities.CatalogItem
import com.numisproerp.data.entities.Client
import com.numisproerp.data.entities.OtherExpense
import com.numisproerp.data.entities.Product
import com.numisproerp.data.entities.Purchase
import com.numisproerp.data.entities.Sale
import com.numisproerp.data.entities.Supplier

@Database(
    entities = [
        Product::class,
        Client::class,
        Supplier::class,
        Purchase::class,
        Sale::class,
        OtherExpense::class,
        CatalogItem::class
    ],
    version = 11,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
    abstract fun clientDao(): ClientDao
    abstract fun supplierDao(): SupplierDao
    abstract fun purchaseDao(): PurchaseDao
    abstract fun saleDao(): SaleDao
    abstract fun otherExpenseDao(): OtherExpenseDao
    abstract fun catalogDao(): CatalogDao
}