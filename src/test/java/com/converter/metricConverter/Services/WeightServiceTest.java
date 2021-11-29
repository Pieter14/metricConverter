package com.converter.metricConverter.Services;

import com.converter.metricConverter.Service.WeightService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class WeightServiceTest {

    @InjectMocks
    private WeightService weightService;

    @BeforeAll
    static void setup() {
        MockitoAnnotations.openMocks(WeightServiceTest.class);
    }

    @Test
    public void pound_to_kilogramTest() {
        assertEquals(9.0, weightService.convertToMetric(20));
    }

    @Test
    public void kilogram_to_poundTest() {
        assertEquals(110, weightService.convertToImperial(50));
    }

}
