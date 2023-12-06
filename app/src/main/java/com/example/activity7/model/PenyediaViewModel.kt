package com.example.activity7.model

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activity7.AplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(AplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(AplikasiSiswa().container.repositoriSiswa)
        }
    }
}

