package com.converter.metricConverter.Service;

import com.converter.metricConverter.DefaultValues.MeasurementType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterFactory {

    private final TemperatureService temperatureService;
    private final WeightService weightService;
    private final LengthService lengthService;

    @Autowired
    public ConverterFactory(final TemperatureService temperatureService, final LengthService lengthService, final WeightService weightService) {
        this.temperatureService = temperatureService;
        this.lengthService = lengthService;
        this.weightService = weightService;
    }


    public ConverterParent getConvertor(final MeasurementType type) {
        if (MeasurementType.TEMPERATURE.equals(type)) {
            return temperatureService;
        } else if (MeasurementType.WEIGHT.equals(type)) {
            return weightService;
        } else if (MeasurementType.LENGTH.equals(type)) {
            return lengthService;
        } else {
            return null;
        }
    }
}
