package com.example.adrian.kotlinsample.feature.weather

import java.util.*

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */
interface DestinationWeatherPresenter {
    fun getDestinationWeather(destinationName : String, date: Date)
}