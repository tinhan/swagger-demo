
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
    "flowName",
    "object"
})
public class RequestBody {

    @JsonProperty("flowName")
    private String flowName;
    @JsonProperty("object")
    private com.demo.api.domain.Object object;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestBody() {
    }

    /**
     * 
     * @param object
     * @param flowName
     */
    public RequestBody(String flowName, com.demo.api.domain.Object object) {
        super();
        this.flowName = flowName;
        this.object = object;
    }

    @JsonProperty("flowName")
    public String getFlowName() {
        return flowName;
    }

    @JsonProperty("flowName")
    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public RequestBody withFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }

    @JsonProperty("object")
    public com.demo.api.domain.Object getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(com.demo.api.domain.Object object) {
        this.object = object;
    }

    public RequestBody withObject(com.demo.api.domain.Object object) {
        this.object = object;
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

    public RequestBody withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
