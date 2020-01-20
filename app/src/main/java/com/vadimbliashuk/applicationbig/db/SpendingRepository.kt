package com.vadimbliashuk.applicationbig.db

import androidx.lifecycle.LiveData
import com.vadimbliashuk.applicationbig.model.SpendingEntity

class SpendingRepository(private val spendingDao: SpendingDao) {
    val allSpending: LiveData<List<SpendingEntity>> = spendingDao.getAll()

    suspend fun insert(spending: SpendingEntity) {
        spendingDao.insert(spending)
    }

    suspend fun delete(spending: SpendingEntity) {
        spendingDao.delete(spending)
    }
}