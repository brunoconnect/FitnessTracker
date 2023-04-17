package br.com.connect.appfitnesstracker

import android.app.Application
import br.com.connect.appfitnesstracker.model.AppDatabase


class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDatabase(this)
    }

}