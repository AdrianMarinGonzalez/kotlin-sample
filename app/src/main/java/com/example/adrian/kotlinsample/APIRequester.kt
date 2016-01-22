package com.example.adrian.kotlinsample

import android.R
import android.app.DownloadManager.Request
import android.net.Uri
import com.example.adrian.kotlinsample.models.WeatherResponse
import java.util.concurrent.Executors

/**
 * Created by adrian on 22/01/16.
 */

fun getWeather() : WeatherResponse {

    val executor = Executors.newScheduledThreadPool(4)
    async(executor) {
        Request(Uri.parse("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=44db6a862fba0b067b1930da0d769e98")).run()
    }
}