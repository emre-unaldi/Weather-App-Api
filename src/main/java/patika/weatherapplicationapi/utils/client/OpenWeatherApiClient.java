package patika.weatherapplicationapi.utils.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import patika.weatherapplicationapi.entity.dto.response.ForecastResponse;
import patika.weatherapplicationapi.entity.dto.response.WeatherResponse;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
@FeignClient(name = "openWeatherApiClient", url = "${open.weather.api.base.uri}")
public interface OpenWeatherApiClient {
    @GetMapping("/weather")
    WeatherResponse getCurrentWeather(@RequestParam("q") String city, @RequestParam("appid") String apiKey);

    @GetMapping("/forecast")
    ForecastResponse getForecast(@RequestParam("q") String city, @RequestParam("appid") String apiKey);
}
