package com.poc.observability.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class MetricQueueDto {

    public static Map<String, MetricDto> metricMap = new HashMap<>();

}
