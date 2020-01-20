package com.vadimbliashuk.applicationbig.ui.spending

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.vadimbliashuk.applicationbig.db.SpendingDatabase
import com.vadimbliashuk.applicationbig.db.SpendingRepository
import com.vadimbliashuk.applicationbig.model.SpendingEntity
import kotlinx.coroutines.launch

class SpendingViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: SpendingRepository
    val allSpending: LiveData<List<SpendingEntity>>

    init {
        val spendingDao = SpendingDatabase.getInstance(application).spendingDao()
        repository = SpendingRepository(spendingDao)
        allSpending = repository.allSpending
    }

    fun insert(spending: SpendingEntity) = viewModelScope.launch {
        repository.insert(spending)
    }

    fun delete(spending: SpendingEntity) = viewModelScope.launch {
        repository.delete(spending)
    }
}