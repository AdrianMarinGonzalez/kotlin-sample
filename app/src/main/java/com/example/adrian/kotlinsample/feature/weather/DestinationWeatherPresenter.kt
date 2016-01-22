package com.example.adrian.kotlinsample.feature.weather

import com.example.adrian.kotlinsample.models.WeatherResponse
import java.util.*

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */
interface DestinationWeatherPresenter {
    fun getDestinationWeather(destinationName : String, date: Date)
}