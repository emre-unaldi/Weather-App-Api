package patika.weatherapplicationapi.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import patika.weatherapplicationapi.entity.dto.response.Forecast;
import patika.weatherapplicationapi.entity.dto.response.ForecastResponse;
import patika.weatherapplicationapi.entity.dto.response.WeatherResponse;
import patika.weatherapplicationapi.service.WeatherService;
import patika.weatherapplicationapi.utils.client.service.OpenWeatherService;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final OpenWeatherService openWeatherService;

    @Override
    public WeatherResponse getDaily(String city) {
        return openWeatherService.getCurrentWeather(city);
    }

    @Override
    public ForecastResponse getWeekly(String city) {
        ForecastResponse response = openWeatherService.getForecast(city);

        List<Forecast> forecasts = new ArrayList<>();
        for (int i = 0; i < response.getCnt(); i++) {
            if (i % 8 == 0) {
                forecasts.add(response.getList().get(i));
            }
        }

        response.setList(forecasts);
        response.setCnt(forecasts.size());

        return response;
    }

    @Override
    public ForecastResponse getWeeklyAndHourly(String city) {
        return openWeatherService.getForecast(city);
    }
}
