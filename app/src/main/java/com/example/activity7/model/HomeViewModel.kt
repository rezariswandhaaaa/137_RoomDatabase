package com.example.activity7.model

import androidx.lifecycle.ViewModel
import com.example.activity7.data.Siswa
import com.example.activity7.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}