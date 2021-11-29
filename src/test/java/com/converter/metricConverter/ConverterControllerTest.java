package com.converter.metricConverter;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ConverterControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getTemperatureMetric_to_ImperialTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/temperature/imperial/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("90.0")));
    }

    @Test
    public void getTemperatureImperial_to_MetricTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/temperature/metric/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("0.0")));
    }

    @Test
    public void getLengthMetric_to_ImperialTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/length/imperial/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("20.0")));
    }

    @Test
    public void getLengthImperial_to_MetricTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/length/metric/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("51.0")));
    }

    @Test
    public void getWeightMetric_to_ImperialTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/weight/imperial/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("71.0")));
    }

    @Test
    public void getWeightImperial_to_MetricTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/convert/weight/metric/32").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("15.0")));
    }
}
