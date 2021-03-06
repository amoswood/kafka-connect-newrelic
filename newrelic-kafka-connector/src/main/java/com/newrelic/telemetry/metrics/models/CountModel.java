package com.newrelic.telemetry.metrics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountModel extends MetricModel {
    @JsonProperty(required = true)
    public Double value;


    @JsonProperty(required = true)
    public Long interval;

    @JsonCreator
    public CountModel(@JsonProperty(value = "name", required = true) String _name,
                      @JsonProperty(value = "type", required = true) String _type,
                      @JsonProperty(value = "timestamp", required = true) Long _timestamp,
                      @JsonProperty(value = "interval.ms", required = true) Long _interval,
                      @JsonProperty(value = "value", required = true) Double _value) {
        this.name = _name;
        this.value = _value;
        this.type = _type;
        this.interval = _interval;
        this.timestamp = _timestamp;

    }
}
