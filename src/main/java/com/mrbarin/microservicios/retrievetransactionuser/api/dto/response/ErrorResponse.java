
package com.mrbarin.microservicios.retrievetransactionuser.api.dto.response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "code",
    "location",
    "moreInfo"
})
@Generated("jsonschema2pojo")
public class ErrorResponse {

    @JsonProperty("type")
    private String type;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("location")
    private String location;
    @JsonProperty("moreInfo")
    private String moreInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ErrorResponse() {
    }

    /**
     * 
     * @param code
     * @param location
     * @param type
     * @param moreInfo
     */
    public ErrorResponse(String type, Integer code, String location, String moreInfo) {
        super();
        this.type = type;
        this.code = code;
        this.location = location;
        this.moreInfo = moreInfo;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("moreInfo")
    public String getMoreInfo() {
        return moreInfo;
    }

    @JsonProperty("moreInfo")
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
