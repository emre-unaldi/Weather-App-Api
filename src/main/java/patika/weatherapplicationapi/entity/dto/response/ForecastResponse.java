package patika.weatherapplicationapi.entity.dto.response;

import lombok.*;
import patika.weatherapplicationapi.entity.City;

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
public class ForecastResponse {
    private String cod;
    private Integer message;
    private Integer cnt;
    private List<Forecast> list;
    private City city;
}
