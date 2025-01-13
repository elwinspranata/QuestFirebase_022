package com.example.praktikum14.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.praktikum14.MahasiswaApplications
import com.example.praktikum14.ui.home.viewmodel.HomeViewModel
import com.example.praktikum14.ui.home.viewmodel.InsertViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                MahasiswaApp().container.repositoryMhs
            )
        }

        initializer {
            InsertViewModel(
                MahasiswaApp().container.repositoryMhs
            )
        }
    }
}

fun CreationExtras.MahasiswaApp(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)
