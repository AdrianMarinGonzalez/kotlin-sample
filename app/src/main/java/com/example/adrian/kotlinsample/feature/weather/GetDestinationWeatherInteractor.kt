package com.example.adrian.kotlinsample.feature.weather

import android.content.Context
import android.widget.Toast
import com.example.adrian.kotlinsample.models.WeatherResponse
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.util.concurrent.Executors

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */

class GetDestinationWeatherInteractor(contextActivity: Context ,name: String, date: String) : Interactor<WeatherResponse>{

    val acContext = contextActivity

    init {

    }

    override fun executeInteractor() {
        val executor = Executors.newScheduledThreadPool(4)

        async(executor) {
            //executor.schedule()
            uiThread { Toast.makeText(acContext, "Esto es un interactor", Toast.LENGTH_SHORT).show() }
        }
    }

}