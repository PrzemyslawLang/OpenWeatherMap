package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeasurementWeatherDto {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String main;
    @JsonProperty
    private String description;
    @JsonProperty
    private String icon;
}
