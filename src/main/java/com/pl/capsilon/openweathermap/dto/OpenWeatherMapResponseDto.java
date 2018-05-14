package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OpenWeatherMapResponseDto implements Serializable{
    @JsonProperty
    private String cod;
    @JsonProperty
    private Float message;
    @JsonProperty
    private Integer cnt;
    @JsonBackReference
    private List<SingleMeasurementDto> list;
}
