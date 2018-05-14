package com.pl.capsilon.openweathermap.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MeasurementSysDto {
    @JsonProperty
    private String pod;
}
