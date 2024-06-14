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
public class City {
    private Long id;
    private String name;
    private Coord coord;
    private String country;
    private Long population;
    private Integer timezone;
    private Long sunrise;
    private Long sunset;
}
