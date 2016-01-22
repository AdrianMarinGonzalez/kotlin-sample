package com.example.adrian.kotlinsample

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView
import butterknife.bindViews
import com.bumptech.glide.Glide
import com.example.adrian.kotlinsample.feature.weather.DestinationWeatherPresenter
import com.example.adrian.kotlinsample.feature.weather.DestinationWeatherPresenterImpl
import com.example.adrian.kotlinsample.feature.weather.MainView
import com.example.adrian.kotlinsample.models.ForecastResult
import java.util.*

class MainActivity : AppCompatActivity(), MainView {

    val textView: TextView by bindView(R.id.weather_response)
    val image: List<ImageView> by bindViews(R.id.image1,R.id.image2,R.id.image3,R.id.image4,R.id.image5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val presenter: DestinationWeatherPresenter = DestinationWeatherPresenterImpl(this)
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

        for (index in 0..4) {
            if (response.list.get(index).weather.get(0).icon.isNotEmpty() ) {
                Glide.with(this).load("http://openweathermap.org/img/w/${response.list.get(index).weather.get(0).icon}.png").into(image[index])

            }
        }
        Toast.makeText(DestinationWeatherApplication.instance(), "Esto es " + response, Toast.LENGTH_SHORT).show()
    }
}
