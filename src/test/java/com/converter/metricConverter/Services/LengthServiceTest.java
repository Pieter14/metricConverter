package com.converter.metricConverter.Services;

import com.converter.metricConverter.Service.LengthService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LengthServiceTest {

    @InjectMocks
    private LengthService lengthService;

    @BeforeAll
    static void setup() {
        MockitoAnnotations.openMocks(LengthServiceTest.class);
    }

    @Test
    public void mile_to_kilometerTest() {
        assertEquals(100, lengthService.convertToMetric(62));
    }

    @Test
    public void kilometer_to_mileTest() {
        assertEquals(62, lengthService.convertToImperial(100));
    }
}
