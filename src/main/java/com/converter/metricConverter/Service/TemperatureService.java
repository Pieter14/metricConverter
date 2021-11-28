package com.converter.metricConverter.Service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService implements ConverterParent {

    @Override
    public double convertToMetric(final double fahrenheitValue) {
        return Math.round((fahrenheitValue - 32) / 1.8);
    }

    @Override
    public double convertToImperial(final double celsiusValue) {
        return Math.round((celsiusValue * 1.8) + 32);
    }
}
