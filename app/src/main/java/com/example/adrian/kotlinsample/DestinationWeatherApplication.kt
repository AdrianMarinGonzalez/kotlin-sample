package com.example.adrian.kotlinsample

import android.app.Application

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */
class DestinationWeatherApplication : Application() {

    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}