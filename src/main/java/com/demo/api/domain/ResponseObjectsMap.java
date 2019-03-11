
package com.demo.api.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Tracking_Output"
})
public class ResponseObjectsMap {

    @JsonProperty("Tracking_Output")
    private List<TrackingOutput> trackingOutput = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseObjectsMap() {
    }

    /**
     * 
     * @param trackingOutput
     */
    public ResponseObjectsMap(List<TrackingOutput> trackingOutput) {
        super();
        this.trackingOutput = trackingOutput;
    }

    @JsonProperty("Tracking_Output")
    public List<TrackingOutput> getTrackingOutput() {
        return trackingOutput;
    }

    @JsonProperty("Tracking_Output")
    public void setTrackingOutput(List<TrackingOutput> trackingOutput) {
        this.trackingOutput = trackingOutput;
    }

    public ResponseObjectsMap withTrackingOutput(List<TrackingOutput> trackingOutput) {
        this.trackingOutput = trackingOutput;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ResponseObjectsMap withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
