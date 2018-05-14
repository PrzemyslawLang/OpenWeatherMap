package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeasurementWindDto {
    @JsonProperty
    private Float speed;
    @JsonProperty
    private Float deg;
}
