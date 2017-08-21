
package com.hand.domain.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReturnCode",
    "Message"
})
public class AllowancePOSTResponse {

    @JsonProperty("ReturnCode")
    private String returnCode;
    @JsonProperty("Message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllowancePOSTResponse() {
    }

    /**
     * 
     * @param returnCode
     * @param message
     */
    public AllowancePOSTResponse(String returnCode, String message) {
        super();
        this.returnCode = returnCode;
        this.message = message;
    }

    /**
     * 
     * @return
     *     The returnCode
     */
    @JsonProperty("ReturnCode")
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 
     * @param returnCode
     *     The ReturnCode
     */
    @JsonProperty("ReturnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public AllowancePOSTResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The Message
     */
    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    public AllowancePOSTResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AllowancePOSTResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(returnCode).append(message).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllowancePOSTResponse) == false) {
            return false;
        }
        AllowancePOSTResponse rhs = ((AllowancePOSTResponse) other);
        return new EqualsBuilder().append(returnCode, rhs.returnCode).append(message, rhs.message).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
