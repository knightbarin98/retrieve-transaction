
package com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentTransactions"
})
@Generated("jsonschema2pojo")
public class CurrentResponse {

    @JsonProperty("currentTransactions")
    private List<CurrentTransaction> currentTransactions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentResponse() {
    }

    /**
     * 
     * @param currentTransactions
     */
    public CurrentResponse(List<CurrentTransaction> currentTransactions) {
        super();
        this.currentTransactions = currentTransactions;
    }

    @JsonProperty("currentTransactions")
    public List<CurrentTransaction> getTransactions() {
        return currentTransactions;
    }

    @JsonProperty("currentTransactions")
    public void setTransactions(List<CurrentTransaction> currentTransactions) {
        this.currentTransactions = currentTransactions;
    }

}
