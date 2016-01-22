package com.example.adrian.kotlinsample

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView
import com.example.adrian.kotlinsample.feature.weather.DestinationWeatherPresenter
import com.example.adrian.kotlinsample.feature.weather.DestinationWeatherPresenterImpl
import com.example.adrian.kotlinsample.feature.weather.MainView
import com.example.adrian.kotlinsample.models.ForecastResult
import java.util.*

class MainActivity : AppCompatActivity(), MainView {

    val textView: TextView by bindView(R.id.weather_response)

    // private val ICON_URL = "http://openweathermap.org/img/w/$iconCode.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val presenter : DestinationWeatherPresenter = DestinationWeatherPresenterImpl(this)
        presenter.getDestinationWeather("Madrid", Date())

        val fab = findViewById(R.id.fab) as FloatingActionButton
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun showWeather(response: ForecastResult) {
        textView.text = response.toString()
        Toast.makeText(DestinationWeatherApplication.instance(), "Esto es " + response, Toast.LENGTH_SHORT).show()
    }
}
