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
public class Weather {
    private Integer id;
    private String main;
    private String description;
    private String icon;
}
