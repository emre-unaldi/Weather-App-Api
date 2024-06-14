package patika.weatherapplicationapi.entity;

import lombok.*;

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
public class WeatherSys {
    private String country;
    private Long sunrise;
    private Long sunset;
}
