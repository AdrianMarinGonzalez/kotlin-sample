package com.example.adrian.kotlinsample.feature.weather

import android.content.Context
import android.widget.Toast
import com.example.adrian.kotlinsample.APIDatasource
import com.example.adrian.kotlinsample.DestinationWeatherApplication
import com.example.adrian.kotlinsample.models.WeatherResponse
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.util.concurrent.Executors

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */

class GetDestinationWeatherInteractor(name: String, date: String) : Interactor<WeatherResponse>{
    val name = name

    override fun executeInteractor(listener : (WeatherResponse) -> Unit) {
        val executor = Executors.newScheduledThreadPool(4)
        async(executor) {
            val  dataSource = APIDatasource()
            val weatherResponse = dataSource.getWeather(name)
            uiThread {
                listener.invoke(weatherResponse)
            }
        }
    }

}