package com.machado001.words

import android.app.Application
import com.machado001.words.data.Container
import com.machado001.words.data.ContainerImpl

class WordsApplication : Application() {
    lateinit var container: Container

    override fun onCreate() {
        super.onCreate()
        container = ContainerImpl()

    }
}