package com.numisproerp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.numisproerp.data.repository.Repository

class SuppliersViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SuppliersViewModel::class.java)) {
            return SuppliersViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}