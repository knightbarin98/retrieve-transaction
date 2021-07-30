
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
    "accountId",
    "branchId",
    "transactionDateStart",
    "transactionDateEnd"
})
@Generated("jsonschema2pojo")
public class RequestRetrieveTransaction implements Serializable
{

    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("branchId")
    private Integer branchId;
    @JsonProperty("transactionDateStart")
    private String transactionDateStart;
    @JsonProperty("transactionDateEnd")
    private String transactionDateEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6088088216195833280L;

    @JsonProperty("accountId")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("branchId")
    public Integer getBranchId() {
        return branchId;
    }

    @JsonProperty("branchId")
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
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
