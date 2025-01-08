package com.example.firebase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase.MahasiswaAplication

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                MahasiswaAplication().container.mahasiswaRepository
            )
        }
    }
}
fun CreationExtras.MahasiswaAplication(): MahasiswaAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaAplication)