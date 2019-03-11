
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
    "exception",
    "responseStatus",
    "responseObjectsMap",
    "flowName",
    "flowId",
    "tId"
})
public class TrackingResponse {

    @JsonProperty("exception")
    private String exception;
    @JsonProperty("responseStatus")
    private String responseStatus;
    @JsonProperty("responseObjectsMap")
    private ResponseObjectsMap responseObjectsMap;
    @JsonProperty("flowName")
    private String flowName;
    @JsonProperty("flowId")
    private String flowId;
    @JsonProperty("tId")
    private String tId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrackingResponse() {
    }

    /**
     * 
     * @param tId
     * @param responseStatus
     * @param exception
     * @param responseObjectsMap
     * @param flowName
     * @param flowId
     */
    public TrackingResponse(String exception, String responseStatus, ResponseObjectsMap responseObjectsMap, String flowName, String flowId, String tId) {
        super();
        this.exception = exception;
        this.responseStatus = responseStatus;
        this.responseObjectsMap = responseObjectsMap;
        this.flowName = flowName;
        this.flowId = flowId;
        this.tId = tId;
    }

    @JsonProperty("exception")
    public String getException() {
        return exception;
    }

    @JsonProperty("exception")
    public void setException(String exception) {
        this.exception = exception;
    }

    public TrackingResponse withException(String exception) {
        this.exception = exception;
        return this;
    }

    @JsonProperty("responseStatus")
    public String getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("responseStatus")
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public TrackingResponse withResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    @JsonProperty("responseObjectsMap")
    public ResponseObjectsMap getResponseObjectsMap() {
        return responseObjectsMap;
    }

    @JsonProperty("responseObjectsMap")
    public void setResponseObjectsMap(ResponseObjectsMap responseObjectsMap) {
        this.responseObjectsMap = responseObjectsMap;
    }

    public TrackingResponse withResponseObjectsMap(ResponseObjectsMap responseObjectsMap) {
        this.responseObjectsMap = responseObjectsMap;
        return this;
    }

    @JsonProperty("flowName")
    public String getFlowName() {
        return flowName;
    }

    @JsonProperty("flowName")
    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public TrackingResponse withFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }

    @JsonProperty("flowId")
    public String getFlowId() {
        return flowId;
    }

    @JsonProperty("flowId")
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public TrackingResponse withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    @JsonProperty("tId")
    public String getTId() {
        return tId;
    }

    @JsonProperty("tId")
    public void setTId(String tId) {
        this.tId = tId;
    }

    public TrackingResponse withTId(String tId) {
        this.tId = tId;
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

    public TrackingResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
