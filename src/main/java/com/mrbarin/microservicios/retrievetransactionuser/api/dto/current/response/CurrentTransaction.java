
package com.mrbarin.microservicios.retrievetransactionuser.api.dto.current.response;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerId",
    "date",
    "transactionDescription"
})
@Generated("jsonschema2pojo")
public class CurrentTransaction {

    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("transactionDescription")
    private TransactionDescription transactionDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentTransaction() {
    }

    /**
     * 
     * @param date
     * @param customerId
     * @param transactionDescription
     */
    public CurrentTransaction(Integer customerId, String date, TransactionDescription transactionDescription) {
        super();
        this.customerId = customerId;
        this.date = date;
        this.transactionDescription = transactionDescription;
    }

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("transactionDescription")
    public TransactionDescription getTransactionDescription() {
        return transactionDescription;
    }

    @JsonProperty("transactionDescription")
    public void setTransactionDescription(TransactionDescription transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

}
