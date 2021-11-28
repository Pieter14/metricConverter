package com.converter.metricConverter.Controller;

import com.converter.metricConverter.Service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/convert" )
public class ConverterController {

    @Autowired ConverterService converterService;

    @GetMapping(value = "/{measure}/{system}/{value}")
    public String convert(@PathVariable String measure, @PathVariable String system, @PathVariable final Double value) {
        return converterService.convert(measure, system, value);
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
