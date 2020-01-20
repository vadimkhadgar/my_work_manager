package com.vadimbliashuk.applicationbig.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_spending")
data class SpendingEntity(
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "quantity") var quantity: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}