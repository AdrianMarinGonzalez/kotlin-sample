package com.example.adrian.kotlinsample.feature.weather

import android.content.Context
import android.widget.Toast
import com.example.adrian.kotlinsample.DestinationWeatherApplication
import com.example.adrian.kotlinsample.models.WeatherResponse
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.util.concurrent.Executors

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */

class GetDestinationWeatherInteractor(name: String, date: String) : Interactor<WeatherResponse>{

    init {

    }

    override fun executeInteractor(listener : (WeatherResponse) -> Unit) {
        val executor = Executors.newScheduledThreadPool(4)

        async(executor) {
            //executor.schedule()
            uiThread { Toast.makeText(DestinationWeatherApplication.instance(), "Esto es un interactor", Toast.LENGTH_SHORT).show() }
        }
    }

}