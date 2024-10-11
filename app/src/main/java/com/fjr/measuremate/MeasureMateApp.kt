package com.fjr.measuremate

import android.app.Application
import com.fjr.measuremate.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class MeasureMateApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MeasureMateApp)
            modules(
                AppModule().module
            )
        }
    }
}