package com.converter.metricConverter.Service;

import com.converter.metricConverter.DefaultValues.SystemType;
import com.converter.metricConverter.DefaultValues.MeasurementType;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    private final ConverterFactory converterFactory;

    public ConverterService(ConverterFactory converterFactory) {
        this.converterFactory = converterFactory;
    }

    public String convert(final String measure, final String system, final Double input) {
        Double convertedValue = 0.0;

        if (input != null && measure != null && system != null) {
            ConverterParent converter = this.getMeasurement(measure);

            if(this.getSystem(system).name().equals("METRIC")){
                convertedValue = converter.convertToMetric(input);
            } else if(this.getSystem(system).name().equals("IMPERIAL")){
                convertedValue = converter.convertToImperial(input);
            }

        } else {
            convertedValue = null;
        }

        return String.valueOf(convertedValue);
    }

    private ConverterParent getMeasurement(final String measurement) {
        ConverterParent converter = converterFactory.getConvertor(MeasurementType.valueOf(measurement.toUpperCase()));

        return converter;
    }

    private SystemType getSystem(final String system) {
        SystemType systemType;
        systemType = SystemType.valueOf(system.toUpperCase());

        return systemType;
    }

}
