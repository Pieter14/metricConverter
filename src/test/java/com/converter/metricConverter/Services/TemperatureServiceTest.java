package com.converter.metricConverter.Services;

import com.converter.metricConverter.Service.TemperatureService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TemperatureServiceTest {

    @InjectMocks
    private TemperatureService temperatureService;

    @BeforeAll
    static void setup() {
        MockitoAnnotations.openMocks(TemperatureService.class);
    }

    @Test
    public void degreesFahrenheit_to_CelsiusTest() {
        assertEquals(10.0, temperatureService.convertToMetric(49.1));
    }

    @Test
    public void degreesCelsius_to_FahrenheitTest() {
        assertEquals(73, temperatureService.convertToImperial(22.5));
    }
}
