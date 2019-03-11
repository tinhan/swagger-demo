
package com.demo.api.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tracking_no"
})
public class TrackingInput {

    @JsonProperty("tracking_no")
    private String trackingNo;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrackingInput() {
    }

    /**
     * 
     * @param trackingNo
     */
    public TrackingInput(String trackingNo) {
        super();
        this.trackingNo = trackingNo;
    }

    @JsonProperty("tracking_no")
    public String getTrackingNo() {
        return trackingNo;
    }

    @JsonProperty("tracking_no")
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public TrackingInput withTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
        return this;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    public TrackingInput withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
