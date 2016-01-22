package com.example.adrian.kotlinsample.feature.weather

import com.example.adrian.kotlinsample.models.ForecastResult
import java.util.*

/**
 * Created by franciscoalfacemartin on 22/1/16.
 */
public class DestinationWeatherPresenterImpl(mainView:MainView) : DestinationWeatherPresenter {

    val mainView = mainView

    val callback : (ForecastResult) -> Unit = {
        mainView.showWeather(it)
    }

    override fun getDestinationWeather(destinationName: String, date: Date) {
        val interactor = GetDestinationWeatherInteractor("canada", "12/14")
        interactor.executeInteractor(callback)
    }

}