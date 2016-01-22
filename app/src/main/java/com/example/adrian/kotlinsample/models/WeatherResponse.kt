package com.example.adrian.kotlinsample.models

/**
 * Created by adrian on 22/01/16.
 */

//----------------------------------------------//
//  DATA CLASSES MAPPING GET WEATHER RESPONSE   //
//----------------------------------------------//

data class Coord(val lon: Float, val lat: Float)

data class Sys(val id: Double, val type: Double, val message: Float, val country: String, val sunrise: Double, val sunset: Double)

data class Weather(val id: Double, val main: String, val description: String, val icon: String)

data class Rain(val h1: Float)

data class Clouds(val all: Double)

data class Wind(val speed: Float, val deg: Double)

data class Main(val temp: Float, val tempMin: Float, val tempMax: Float, val pressure: Float,
                val seaLevel: Float, val grndLevel: Float, val humidity: Double, val tempKf: Double)

data class WeatherResponse(val coord: Coord, val weather: List<Weather>, val base: String, val main: Main,
                           val wind: Wind, val rain: Rain, val clouds: Clouds, val dt: Double, val sys: Sys,
                           val id: Double, val name: String, val cod: Double)