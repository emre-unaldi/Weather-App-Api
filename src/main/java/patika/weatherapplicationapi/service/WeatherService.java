package patika.weatherapplicationapi.service;

import patika.weatherapplicationapi.entity.dto.response.ForecastResponse;
import patika.weatherapplicationapi.entity.dto.response.WeatherResponse;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
public interface WeatherService {
    WeatherResponse getDaily(String city);
    ForecastResponse getWeekly(String city);
    ForecastResponse getWeeklyAndHourly(String city);
}
