package com.vadimbliashuk.applicationbig.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.vadimbliashuk.applicationbig.model.SpendingEntity

@Dao
interface SpendingDao{
    @Query("SELECT * FROM list_spending")
    fun getAll(): LiveData<List<SpendingEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(spending: SpendingEntity)

    @Delete
    suspend fun delete(spending: SpendingEntity)
}