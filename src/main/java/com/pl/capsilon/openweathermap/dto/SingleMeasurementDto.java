package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SingleMeasurementDto {
    @JsonProperty
    private Long dt;
    @JsonProperty
    private MeasurementMainDto main;
    @JsonBackReference
    private List<MeasurementWeatherDto> weather;
    @JsonProperty
    private MeasurementCloudsDto clouds;
    @JsonProperty
    private MeasurementWindDto wind;
    @JsonProperty
    private MeasurementSysDto sys;
}
