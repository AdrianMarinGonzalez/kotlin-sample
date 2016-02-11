package com.example.adrian.kotlinsample

import com.example.adrian.kotlinsample.models.ForecastResult
import com.google.gson.Gson
import org.jetbrains.anko
import java.net.URL

/**
 * Created by adrian on 22/01/16.
 */

public class APIDatasource {


    //http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=json&appid=44db6a862fba0b067b1930da0d769e98

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }


    public fun getWeather(city: String) : ForecastResult{
        var forecastJsonStr = URL(COMPLETE_URL + "Madrid").readText()
        var response : ForecastResult = Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
        return response
    }

}
