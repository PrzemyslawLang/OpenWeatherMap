package com.pl.capsilon.openweathermap.utility;

import com.pl.capsilon.openweathermap.dto.SingleMeasurementDto;
import com.pl.capsilon.openweathermap.dto.WeatherDto;

import java.util.List;

public class Calculation {

    static public WeatherDto getAverages(List<SingleMeasurementDto> list){
        WeatherDto weatherDto = new WeatherDto();
        Double humidity = 0D;
        Double pressure = 0D;
        Double temperature = 0D;
        for(SingleMeasurementDto measurementDto : list){
            humidity += measurementDto.getMain().getHumidity();
            pressure += measurementDto.getMain().getPressure();
            temperature += (measurementDto.getMain().getTemp_max()+measurementDto.getMain().getTemp_min())/2;
        }

        weatherDto.setAverageHumidity(Math.round((humidity/list.size())*100.0)/100.0);
        weatherDto.setAveragePressure(Math.round((pressure/list.size())*100.0)/100.0);
        weatherDto.setAverageTemperature(Math.round((temperature/list.size())*100.0)/100.0);
        return weatherDto;
    }
}
