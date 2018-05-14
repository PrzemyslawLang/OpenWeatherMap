package com.pl.capsilon.openweathermap.controller;

import com.pl.capsilon.openweathermap.dto.OpenWeatherMapResponseDto;
import com.pl.capsilon.openweathermap.dto.WeatherDto;
import com.pl.capsilon.openweathermap.service.WeatherService;
import com.pl.capsilon.openweathermap.utility.Calculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(@Autowired WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Cacheable("weather")
    @RequestMapping(value = "/{city}/{countryCode}")
    public WeatherDto getWeather(@PathVariable(name = "city") String city, @PathVariable(name = "countryCode") String countryCode){

        OpenWeatherMapResponseDto openWeatherMapResponseDto = weatherService.getWeather(city,countryCode);
        WeatherDto weatherDto = Calculation.getAverages(openWeatherMapResponseDto.getList());
        weatherDto.setCity(city);
        weatherDto.setCountryCode(countryCode);
        return weatherDto;
    }
}
