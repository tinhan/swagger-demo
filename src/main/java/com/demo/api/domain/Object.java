
package com.demo.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Object {

    @JsonProperty("Tracking_Input")
    private TrackingInput trackingInput;

    @JsonProperty("Tracking_List_Input")
    private TrackingListInput trackingListInput;

    public Object() {
    }


    @JsonProperty("Tracking_Input")
    public TrackingInput getTrackingInput() {
        return trackingInput;
    }

    @JsonProperty("Tracking_Input")
    public void setTrackingInput(TrackingInput trackingInput) {
        this.trackingInput = trackingInput;
    }

    public Object withTrackingInput(TrackingInput trackingInput) {
        this.trackingInput = trackingInput;
        return this;
    }

    @JsonProperty("Tracking_List_Input")
    public TrackingListInput getTrackingListInput() {
        return trackingListInput;
    }

    @JsonProperty("Tracking_List_Input")
    public void setTrackingListInput(TrackingListInput trackingListInput) {
        this.trackingListInput = trackingListInput;
    }


}
