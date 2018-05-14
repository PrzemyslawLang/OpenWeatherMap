package com.pl.capsilon.openweathermap.dto;

import lombok.Data;

@Data
public class WeatherDto {
    private String city;
    private String countryCode;
    private Double averageTemperature;
    private Double averagePressure;
    private Double averageHumidity;
}
