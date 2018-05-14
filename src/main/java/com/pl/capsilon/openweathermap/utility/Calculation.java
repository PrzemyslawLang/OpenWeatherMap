package com.pl.capsilon.openweathermap.utility;

import com.pl.capsilon.openweathermap.dto.SingleMeasurementDto;
import com.pl.capsilon.openweathermap.dto.WeatherDto;

import java.util.List;

public class Calculation {

    static public WeatherDto getAverages(List<SingleMeasurementDto> list){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setAverageHumidity(Math.round(getAverageHumidity(list)*100.0)/100.0);
        weatherDto.setAveragePressure(Math.round(getAveragePressure(list)*100.0)/100.0);
        weatherDto.setAverageTemperature(Math.round(getAverageTemperature(list)*100.0)/100.0);
        return weatherDto;
    }

    static private Double getAverageHumidity(List<SingleMeasurementDto> list){
        return list.stream().mapToDouble(singleMeasurement -> singleMeasurement.getMain().getHumidity()).average().orElse(0);
    }

    static private Double getAveragePressure(List<SingleMeasurementDto> list){
        return list.stream().mapToDouble(singleMeasurement -> singleMeasurement.getMain().getPressure()).average().orElse(0);
    }

    static private Double getAverageTemperature(List<SingleMeasurementDto> list){
        Double maxTemp = list.stream().mapToDouble(singleMeasurement -> singleMeasurement.getMain().getTemp_max()).average().orElse(0);
        Double minTemp = list.stream().mapToDouble(singleMeasurement -> singleMeasurement.getMain().getTemp_min()).average().orElse(0);
        return (maxTemp+minTemp)/2;
    }
}
