package ua.skachkov.temperature.myapplication.di

import ua.skachkov.temperature.myapplication.App
import ua.skachkov.temperature.myapplication.activity.WeatherMeasurementsActivity
import ua.skachkov.temperature.myapplication.service.UpdateWeatherMeasurementsJob
import dagger.Component
import ua.skachkov.temperature.myapplication.widget.UpdateWeatherMeasurementsWidgetService
import javax.inject.Singleton

/**
 * @author Ivan Skachkov
 * Created on 3/10/2018.
 */
@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, ConfigModule::class])
interface AppComponent {
    fun inject(app: App)
    fun inject(weatherMeasurementsActivity: WeatherMeasurementsActivity)
    fun inject(updateWeatherMeasurementsJob: UpdateWeatherMeasurementsJob)
    fun inject(updateWeatherMeasurementsWidgetService: UpdateWeatherMeasurementsWidgetService)
}