package com.example.adrian.kotlinsample

import org.jetbrains.anko.async
import java.net.URL

/**
 * Created by adrian on 22/01/16.
 */

public class APIDatasource {

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    public fun getWeather(city: String, callback: (String) -> Unit) {
        async() {
            var forecastJsonStr = URL(COMPLETE_URL + city).readText()
            callback(forecastJsonStr)
        }
    }

}
