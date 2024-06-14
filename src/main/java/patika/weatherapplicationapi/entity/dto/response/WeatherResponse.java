package patika.weatherapplicationapi.entity.dto.response;

import lombok.*;
import patika.weatherapplicationapi.entity.*;

import java.util.List;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 13.06.2024
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private DailyMain main;
    private Integer visibility;
    private Wind wind;
    private Rain rain;
    private Clouds clouds;
    private Long dt;
    private WeatherSys sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
}
