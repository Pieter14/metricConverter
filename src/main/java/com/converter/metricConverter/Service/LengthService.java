package com.converter.metricConverter.Service;

import org.springframework.stereotype.Service;

@Service
public class LengthService implements ConverterParent {

    @Override
    public double convertToMetric(final double mileValue) {
        return Math.round(mileValue * 1.609);
    }

    @Override
    public double convertToImperial(final double kilometerValue) {
        return Math.round(kilometerValue / 1.609);
    }
}