package patika.weatherapplicationapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import patika.weatherapplicationapi.entity.dto.response.ForecastResponse;
import patika.weatherapplicationapi.entity.dto.response.WeatherResponse;
import patika.weatherapplicationapi.service.WeatherService;
import patika.weatherapplicationapi.utils.general.constants.Messages;
import patika.weatherapplicationapi.utils.general.result.RestResponse;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class OpenWeatherController {
    private final WeatherService weatherService;

    @GetMapping("/daily")
    public ResponseEntity<RestResponse<WeatherResponse>> getDailyWeather(@RequestParam("city") String city) {
        return ResponseEntity.ok(RestResponse.of(weatherService.getDaily(city), Messages.DAILY));
    }

    @GetMapping("/weekly")
    public ResponseEntity<RestResponse<ForecastResponse>> getWeeklyWeather(@RequestParam("city") String city) {
        return ResponseEntity.ok(RestResponse.of(weatherService.getWeekly(city), Messages.WEEKLY));
    }

    @GetMapping("/weeklyAndHourly")
    public ResponseEntity<RestResponse<ForecastResponse>> getWeeklyAndHourly(@RequestParam("city") String city) {
        return ResponseEntity.ok(RestResponse.of(weatherService.getWeeklyAndHourly(city), Messages.WEEKLY_AND_HOURLY));
    }
}
