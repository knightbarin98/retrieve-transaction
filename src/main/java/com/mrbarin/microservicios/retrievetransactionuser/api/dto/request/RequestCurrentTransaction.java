
package com.mrbarin.microservicios.retrievetransactionuser.api.dto.request;

import java.io.Serializable;
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
    "customerId",
    "transactionDateStart",
    "transactionDateEnd"
})
@Generated("jsonschema2pojo")
public class RequestCurrentTransaction implements Serializable
{

    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("transactionDateStart")
    private String transactionDateStart;
    @JsonProperty("transactionDateEnd")
    private String transactionDateEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9089070891435765827L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestCurrentTransaction() {
    }

    /**
     * 
     * @param customerId
     * @param transactionDateStart
     * @param transactionDateEnd
     */
    public RequestCurrentTransaction(Integer customerId, String transactionDateStart, String transactionDateEnd) {
        super();
        this.customerId = customerId;
        this.transactionDateStart = transactionDateStart;
        this.transactionDateEnd = transactionDateEnd;
    }

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("transactionDateStart")
    public String getTransactionDateStart() {
        return transactionDateStart;
    }

    @JsonProperty("transactionDateStart")
    public void setTransactionDateStart(String transactionDateStart) {
        this.transactionDateStart = transactionDateStart;
    }

    @JsonProperty("transactionDateEnd")
    public String getTransactionDateEnd() {
        return transactionDateEnd;
    }

    @JsonProperty("transactionDateEnd")
    public void setTransactionDateEnd(String transactionDateEnd) {
        this.transactionDateEnd = transactionDateEnd;
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
