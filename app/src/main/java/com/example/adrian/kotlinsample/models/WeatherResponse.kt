package com.example.adrian.kotlinsample.models

/**
 * Created by adrian on 22/01/16.
 */

//----------------------------------------------//
//  DATA CLASSES MAPPING GET WEATHER RESPONSE   //
//----------------------------------------------//

data class Coord(val lon: Float, val lat: Float)

data class Sys(val id: Long, val type: Long, val message: Float, val country: String, val sunrise: Long, val sunset: Long)

data class Weather(val id: Long, val main: String, val description: String, val icon: String)

data class Rain(val h1: Float)

data class Clouds(val all: Long)

data class Wind(val speed: Float, val deg: Long)

data class Main(val temp: Float, val tempMin: Float, val tempMax: Float, val pressure: Float,
                val seaLevel: Float, val grndLevel: Float, val humidity: Long, val tempKf: Long)

data class WeatherResponse(val coord: Coord, val weather: List<Weather>, val base: String, val main: Main,
                           val wind: Wind, val rain: Rain, val clouds: Clouds, val dt: Long, val sys: Sys,
                           val id: Long, val name: String, val cod: Long)