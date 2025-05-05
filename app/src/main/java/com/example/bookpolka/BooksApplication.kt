package com.example.bookpolka

import android.app.Application
import com.example.bookpolka.data.AppContainer
import com.example.bookpolka.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}