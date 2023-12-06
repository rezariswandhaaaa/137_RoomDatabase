package com.example.activity7

import android.app.Application
import com.example.activity7.repositori.ContainerApp
import com.example.activity7.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}