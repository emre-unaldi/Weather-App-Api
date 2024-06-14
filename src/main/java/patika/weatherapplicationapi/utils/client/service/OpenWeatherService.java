package patika.weatherapplicationapi.utils.client.service;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import patika.weatherapplicationapi.entity.dto.response.ForecastResponse;
import patika.weatherapplicationapi.entity.dto.response.WeatherResponse;
import patika.weatherapplicationapi.utils.client.OpenWeatherApiClient;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OpenWeatherService {
    private final OpenWeatherApiClient openWeatherApiClient;
    private final Dotenv dotenv = Dotenv.load();
    private final String apiKey = dotenv.get("OPEN_WEATHER_API_KEY");

    public WeatherResponse getCurrentWeather(String city) {
        WeatherResponse response = openWeatherApiClient.getCurrentWeather(city, apiKey);

        if (response == null) {
            log.error("Error message: Weather response null");
        }

        return response;
    }

    public ForecastResponse getForecast(String city) {
        ForecastResponse response = openWeatherApiClient.getForecast(city, apiKey);

        if (response == null) {
            log.error("Error message: Forecast response null");
        }

        return response;
    }
}
