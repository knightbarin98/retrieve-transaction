
package com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactions"
})
@Generated("jsonschema2pojo")
public class CurrentResponse {

    @JsonProperty("transactions")
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

    @JsonProperty("transactions")
    public List<CurrentTransaction> getTransactions() {
        return currentTransactions;
    }

    @JsonProperty("transactions")
    public void setTransactions(List<CurrentTransaction> currentTransactions) {
        this.currentTransactions = currentTransactions;
    }

}
