package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeasurementMainDto {
    @JsonProperty
    private Float temp;
    @JsonProperty
    private Float temp_min;
    @JsonProperty
    private Float temp_max;
    @JsonProperty
    private Float pressure;
    @JsonProperty
    private Float sea_level;
    @JsonProperty
    private Float grnd_level;
    @JsonProperty
    private Float humidity;
    @JsonProperty
    private Float temp_kf;
}
