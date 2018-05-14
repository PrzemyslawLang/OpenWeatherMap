package com.pl.capsilon.openweathermap.service;

import com.pl.capsilon.openweathermap.dto.OpenWeatherMapResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {

    public OpenWeatherMapResponseDto getWeather(String city, String countryCode){
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://samples.openweathermap.org/data/2.5/forecast?q=%s,%s&appid=b6907d289e10d714a6e88b30761fae22", city, countryCode);
        try {
            return restTemplate.getForObject(url, OpenWeatherMapResponseDto.class);
        }catch (Exception e){
            return new OpenWeatherMapResponseDto();
        }
    }
}
