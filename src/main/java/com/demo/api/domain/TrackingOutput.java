
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
        "tracking_detail",
    "tracking_no",
    "tracking_status",
    "due_date",
    "action_date",
    "register_date",
    "delivery_result",
    "brach",
    "recipient_name",
    "tracking_id"
})
public class TrackingOutput {

    @JsonProperty("tracking_detail")
    private String trackingDetail;
    @JsonProperty("tracking_no")
    private String trackingNo;
    @JsonProperty("tracking_status")
    private String trackingStatus;
    @JsonProperty("due_date")
    private String dueDate;
    @JsonProperty("action_date")
    private String actionDate;
    @JsonProperty("register_date")
    private String registerDate;
    @JsonProperty("delivery_result")
    private String deliveryResult;
    @JsonProperty("brach")
    private String brach;
    @JsonProperty("recipient_name")
    private String recipientName;
    @JsonProperty("tracking_id")
    private String trackingId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrackingOutput() {
    }

    @JsonProperty("tracking_detail")
    public String getTrackingDetail() {
        return trackingDetail;
    }

    @JsonProperty("tracking_detail")
    public void setTrackingDetail(String trackingDetail) {
        this.trackingDetail = trackingDetail;
    }

    @JsonProperty("tracking_no")
    public String getTrackingNo() {
        return trackingNo;
    }

    @JsonProperty("tracking_no")
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public TrackingOutput withTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
        return this;
    }

    @JsonProperty("tracking_status")
    public String getTrackingStatus() {
        return trackingStatus;
    }

    @JsonProperty("tracking_status")
    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }

    public TrackingOutput withTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
        return this;
    }

    @JsonProperty("due_date")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public TrackingOutput withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    @JsonProperty("action_date")
    public String getActionDate() {
        return actionDate;
    }

    @JsonProperty("action_date")
    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public TrackingOutput withActionDate(String actionDate) {
        this.actionDate = actionDate;
        return this;
    }

    @JsonProperty("register_date")
    public String getRegisterDate() {
        return registerDate;
    }

    @JsonProperty("register_date")
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public TrackingOutput withRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    @JsonProperty("delivery_result")
    public String getDeliveryResult() {
        return deliveryResult;
    }

    @JsonProperty("delivery_result")
    public void setDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
    }

    public TrackingOutput withDeliveryResult(String deliveryResult) {
        this.deliveryResult = deliveryResult;
        return this;
    }

    @JsonProperty("brach")
    public String getBrach() {
        return brach;
    }

    @JsonProperty("brach")
    public void setBrach(String brach) {
        this.brach = brach;
    }

    public TrackingOutput withBrach(String brach) {
        this.brach = brach;
        return this;
    }

    @JsonProperty("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public TrackingOutput withRecipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    @JsonProperty("tracking_id")
    public String getTrackingId() {
        return trackingId;
    }

    @JsonProperty("tracking_id")
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public TrackingOutput withTrackingId(String trackingId) {
        this.trackingId = trackingId;
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

    public TrackingOutput withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
