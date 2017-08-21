
package com.hand.domain.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowanceNumber",
    "AllowanceDate",
    "SellerID",
    "BuyID",
    "BuyName",
    "ProductItem"
})
public class AllowancePOSTBody {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AllowanceNumber")
    private String allowanceNumber;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AllowanceDate")
    private String allowanceDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SellerID")
    private String sellerID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BuyID")
    private String buyID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BuyName")
    private String buyName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ProductItem")
    @JsonDeserialize(as = LinkedHashSet.class)
    private Set<ProductItem> productItem = new LinkedHashSet<ProductItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllowancePOSTBody() {
    }

    /**
     * 
     * @param productItem
     * @param allowanceNumber
     * @param sellerID
     * @param buyName
     * @param buyID
     * @param allowanceDate
     */
    public AllowancePOSTBody(String allowanceNumber, String allowanceDate, String sellerID, String buyID, String buyName, Set<ProductItem> productItem) {
        super();
        this.allowanceNumber = allowanceNumber;
        this.allowanceDate = allowanceDate;
        this.sellerID = sellerID;
        this.buyID = buyID;
        this.buyName = buyName;
        this.productItem = productItem;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The allowanceNumber
     */
    @JsonProperty("AllowanceNumber")
    public String getAllowanceNumber() {
        return allowanceNumber;
    }

    /**
     * 
     * (Required)
     * 
     * @param allowanceNumber
     *     The AllowanceNumber
     */
    @JsonProperty("AllowanceNumber")
    public void setAllowanceNumber(String allowanceNumber) {
        this.allowanceNumber = allowanceNumber;
    }

    public AllowancePOSTBody withAllowanceNumber(String allowanceNumber) {
        this.allowanceNumber = allowanceNumber;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The allowanceDate
     */
    @JsonProperty("AllowanceDate")
    public String getAllowanceDate() {
        return allowanceDate;
    }

    /**
     * 
     * (Required)
     * 
     * @param allowanceDate
     *     The AllowanceDate
     */
    @JsonProperty("AllowanceDate")
    public void setAllowanceDate(String allowanceDate) {
        this.allowanceDate = allowanceDate;
    }

    public AllowancePOSTBody withAllowanceDate(String allowanceDate) {
        this.allowanceDate = allowanceDate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sellerID
     */
    @JsonProperty("SellerID")
    public String getSellerID() {
        return sellerID;
    }

    /**
     * 
     * (Required)
     * 
     * @param sellerID
     *     The SellerID
     */
    @JsonProperty("SellerID")
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public AllowancePOSTBody withSellerID(String sellerID) {
        this.sellerID = sellerID;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The buyID
     */
    @JsonProperty("BuyID")
    public String getBuyID() {
        return buyID;
    }

    /**
     * 
     * (Required)
     * 
     * @param buyID
     *     The BuyID
     */
    @JsonProperty("BuyID")
    public void setBuyID(String buyID) {
        this.buyID = buyID;
    }

    public AllowancePOSTBody withBuyID(String buyID) {
        this.buyID = buyID;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The buyName
     */
    @JsonProperty("BuyName")
    public String getBuyName() {
        return buyName;
    }

    /**
     * 
     * (Required)
     * 
     * @param buyName
     *     The BuyName
     */
    @JsonProperty("BuyName")
    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public AllowancePOSTBody withBuyName(String buyName) {
        this.buyName = buyName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The productItem
     */
    @JsonProperty("ProductItem")
    public Set<ProductItem> getProductItem() {
        return productItem;
    }

    /**
     * 
     * (Required)
     * 
     * @param productItem
     *     The ProductItem
     */
    @JsonProperty("ProductItem")
    public void setProductItem(Set<ProductItem> productItem) {
        this.productItem = productItem;
    }

    public AllowancePOSTBody withProductItem(Set<ProductItem> productItem) {
        this.productItem = productItem;
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

    public AllowancePOSTBody withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowanceNumber).append(allowanceDate).append(sellerID).append(buyID).append(buyName).append(productItem).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllowancePOSTBody) == false) {
            return false;
        }
        AllowancePOSTBody rhs = ((AllowancePOSTBody) other);
        return new EqualsBuilder().append(allowanceNumber, rhs.allowanceNumber).append(allowanceDate, rhs.allowanceDate).append(sellerID, rhs.sellerID).append(buyID, rhs.buyID).append(buyName, rhs.buyName).append(productItem, rhs.productItem).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
