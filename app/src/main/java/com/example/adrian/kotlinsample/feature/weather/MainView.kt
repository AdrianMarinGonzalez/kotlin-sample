package com.example.adrian.kotlinsample.feature.weather

import com.example.adrian.kotlinsample.models.WeatherResponse

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */
interface MainView {
    fun showWeather() : WeatherResponse
}