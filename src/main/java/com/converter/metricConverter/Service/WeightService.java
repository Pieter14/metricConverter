package com.converter.metricConverter.Service;

import org.springframework.stereotype.Service;

@Service
public class WeightService implements ConverterParent {

    @Override
    public double convertToMetric(final double poundValue) {
        return Math.round(poundValue / 2.205);
    }

    @Override
    public double convertToImperial(final double kilogramValue) {
        return Math.round(kilogramValue * 2.205);
    }
}
