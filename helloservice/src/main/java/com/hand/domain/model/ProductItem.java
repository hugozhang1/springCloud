
package com.hand.domain.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OriginalInvoiceNumber",
    "OriginalInvoiceDate",
    "OriginalDescription",
    "Quantity",
    "UnitPrice",
    "Amount",
    "Tax"
})
public class ProductItem {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OriginalInvoiceNumber")
    private String originalInvoiceNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OriginalInvoiceDate")
    private String originalInvoiceDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OriginalDescription")
    private String originalDescription;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    private Double quantity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("UnitPrice")
    private Double unitPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    private Double amount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Tax")
    private Double tax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductItem() {
    }

    /**
     * 
     * @param unitPrice
     * @param amount
     * @param quantity
     * @param originalInvoiceNumber
     * @param tax
     * @param originalInvoiceDate
     * @param originalDescription
     */
    public ProductItem(String originalInvoiceNumber, String originalInvoiceDate, String originalDescription, Double quantity, Double unitPrice, Double amount, Double tax) {
        super();
        this.originalInvoiceNumber = originalInvoiceNumber;
        this.originalInvoiceDate = originalInvoiceDate;
        this.originalDescription = originalDescription;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.tax = tax;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The originalInvoiceNumber
     */
    @JsonProperty("OriginalInvoiceNumber")
    public String getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * 
     * (Required)
     * 
     * @param originalInvoiceNumber
     *     The OriginalInvoiceNumber
     */
    @JsonProperty("OriginalInvoiceNumber")
    public void setOriginalInvoiceNumber(String originalInvoiceNumber) {
        this.originalInvoiceNumber = originalInvoiceNumber;
    }

    public ProductItem withOriginalInvoiceNumber(String originalInvoiceNumber) {
        this.originalInvoiceNumber = originalInvoiceNumber;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The originalInvoiceDate
     */
    @JsonProperty("OriginalInvoiceDate")
    public String getOriginalInvoiceDate() {
        return originalInvoiceDate;
    }

    /**
     * 
     * (Required)
     * 
     * @param originalInvoiceDate
     *     The OriginalInvoiceDate
     */
    @JsonProperty("OriginalInvoiceDate")
    public void setOriginalInvoiceDate(String originalInvoiceDate) {
        this.originalInvoiceDate = originalInvoiceDate;
    }

    public ProductItem withOriginalInvoiceDate(String originalInvoiceDate) {
        this.originalInvoiceDate = originalInvoiceDate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The originalDescription
     */
    @JsonProperty("OriginalDescription")
    public String getOriginalDescription() {
        return originalDescription;
    }

    /**
     * 
     * (Required)
     * 
     * @param originalDescription
     *     The OriginalDescription
     */
    @JsonProperty("OriginalDescription")
    public void setOriginalDescription(String originalDescription) {
        this.originalDescription = originalDescription;
    }

    public ProductItem withOriginalDescription(String originalDescription) {
        this.originalDescription = originalDescription;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("Quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * 
     * (Required)
     * 
     * @param quantity
     *     The Quantity
     */
    @JsonProperty("Quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public ProductItem withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The unitPrice
     */
    @JsonProperty("UnitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * (Required)
     * 
     * @param unitPrice
     *     The UnitPrice
     */
    @JsonProperty("UnitPrice")
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ProductItem withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The amount
     */
    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * (Required)
     * 
     * @param amount
     *     The Amount
     */
    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ProductItem withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tax
     */
    @JsonProperty("Tax")
    public Double getTax() {
        return tax;
    }

    /**
     * 
     * (Required)
     * 
     * @param tax
     *     The Tax
     */
    @JsonProperty("Tax")
    public void setTax(Double tax) {
        this.tax = tax;
    }

    public ProductItem withTax(Double tax) {
        this.tax = tax;
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

    public ProductItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originalInvoiceNumber).append(originalInvoiceDate).append(originalDescription).append(quantity).append(unitPrice).append(amount).append(tax).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductItem) == false) {
            return false;
        }
        ProductItem rhs = ((ProductItem) other);
        return new EqualsBuilder().append(originalInvoiceNumber, rhs.originalInvoiceNumber).append(originalInvoiceDate, rhs.originalInvoiceDate).append(originalDescription, rhs.originalDescription).append(quantity, rhs.quantity).append(unitPrice, rhs.unitPrice).append(amount, rhs.amount).append(tax, rhs.tax).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
