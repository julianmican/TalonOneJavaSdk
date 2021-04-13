/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CustomerAnalytics
 */

public class CustomerAnalytics {
  public static final String SERIALIZED_NAME_ACCEPTED_COUPONS = "acceptedCoupons";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUPONS)
  private Integer acceptedCoupons;

  public static final String SERIALIZED_NAME_CREATED_COUPONS = "createdCoupons";
  @SerializedName(SERIALIZED_NAME_CREATED_COUPONS)
  private Integer createdCoupons;

  public static final String SERIALIZED_NAME_FREE_ITEMS = "freeItems";
  @SerializedName(SERIALIZED_NAME_FREE_ITEMS)
  private Integer freeItems;

  public static final String SERIALIZED_NAME_TOTAL_ORDERS = "totalOrders";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDERS)
  private Integer totalOrders;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNTED_ORDERS = "totalDiscountedOrders";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNTED_ORDERS)
  private Integer totalDiscountedOrders;

  public static final String SERIALIZED_NAME_TOTAL_REVENUE = "totalRevenue";
  @SerializedName(SERIALIZED_NAME_TOTAL_REVENUE)
  private BigDecimal totalRevenue;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNTS = "totalDiscounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNTS)
  private BigDecimal totalDiscounts;


  public CustomerAnalytics acceptedCoupons(Integer acceptedCoupons) {
    
    this.acceptedCoupons = acceptedCoupons;
    return this;
  }

   /**
   * Total accepted coupons for this customer
   * @return acceptedCoupons
  **/
  @ApiModelProperty(required = true, value = "Total accepted coupons for this customer")

  public Integer getAcceptedCoupons() {
    return acceptedCoupons;
  }


  public void setAcceptedCoupons(Integer acceptedCoupons) {
    this.acceptedCoupons = acceptedCoupons;
  }


  public CustomerAnalytics createdCoupons(Integer createdCoupons) {
    
    this.createdCoupons = createdCoupons;
    return this;
  }

   /**
   * Total created coupons for this customer
   * @return createdCoupons
  **/
  @ApiModelProperty(required = true, value = "Total created coupons for this customer")

  public Integer getCreatedCoupons() {
    return createdCoupons;
  }


  public void setCreatedCoupons(Integer createdCoupons) {
    this.createdCoupons = createdCoupons;
  }


  public CustomerAnalytics freeItems(Integer freeItems) {
    
    this.freeItems = freeItems;
    return this;
  }

   /**
   * Total free items given to this customer
   * @return freeItems
  **/
  @ApiModelProperty(required = true, value = "Total free items given to this customer")

  public Integer getFreeItems() {
    return freeItems;
  }


  public void setFreeItems(Integer freeItems) {
    this.freeItems = freeItems;
  }


  public CustomerAnalytics totalOrders(Integer totalOrders) {
    
    this.totalOrders = totalOrders;
    return this;
  }

   /**
   * Total orders made by this customer
   * @return totalOrders
  **/
  @ApiModelProperty(required = true, value = "Total orders made by this customer")

  public Integer getTotalOrders() {
    return totalOrders;
  }


  public void setTotalOrders(Integer totalOrders) {
    this.totalOrders = totalOrders;
  }


  public CustomerAnalytics totalDiscountedOrders(Integer totalDiscountedOrders) {
    
    this.totalDiscountedOrders = totalDiscountedOrders;
    return this;
  }

   /**
   * Total orders made by this customer that had a discount
   * @return totalDiscountedOrders
  **/
  @ApiModelProperty(required = true, value = "Total orders made by this customer that had a discount")

  public Integer getTotalDiscountedOrders() {
    return totalDiscountedOrders;
  }


  public void setTotalDiscountedOrders(Integer totalDiscountedOrders) {
    this.totalDiscountedOrders = totalDiscountedOrders;
  }


  public CustomerAnalytics totalRevenue(BigDecimal totalRevenue) {
    
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Total Revenue across all closed sessions
   * @return totalRevenue
  **/
  @ApiModelProperty(required = true, value = "Total Revenue across all closed sessions")

  public BigDecimal getTotalRevenue() {
    return totalRevenue;
  }


  public void setTotalRevenue(BigDecimal totalRevenue) {
    this.totalRevenue = totalRevenue;
  }


  public CustomerAnalytics totalDiscounts(BigDecimal totalDiscounts) {
    
    this.totalDiscounts = totalDiscounts;
    return this;
  }

   /**
   * The sum of discounts that were given across all closed sessions
   * @return totalDiscounts
  **/
  @ApiModelProperty(required = true, value = "The sum of discounts that were given across all closed sessions")

  public BigDecimal getTotalDiscounts() {
    return totalDiscounts;
  }


  public void setTotalDiscounts(BigDecimal totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAnalytics customerAnalytics = (CustomerAnalytics) o;
    return Objects.equals(this.acceptedCoupons, customerAnalytics.acceptedCoupons) &&
        Objects.equals(this.createdCoupons, customerAnalytics.createdCoupons) &&
        Objects.equals(this.freeItems, customerAnalytics.freeItems) &&
        Objects.equals(this.totalOrders, customerAnalytics.totalOrders) &&
        Objects.equals(this.totalDiscountedOrders, customerAnalytics.totalDiscountedOrders) &&
        Objects.equals(this.totalRevenue, customerAnalytics.totalRevenue) &&
        Objects.equals(this.totalDiscounts, customerAnalytics.totalDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedCoupons, createdCoupons, freeItems, totalOrders, totalDiscountedOrders, totalRevenue, totalDiscounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAnalytics {\n");
    sb.append("    acceptedCoupons: ").append(toIndentedString(acceptedCoupons)).append("\n");
    sb.append("    createdCoupons: ").append(toIndentedString(createdCoupons)).append("\n");
    sb.append("    freeItems: ").append(toIndentedString(freeItems)).append("\n");
    sb.append("    totalOrders: ").append(toIndentedString(totalOrders)).append("\n");
    sb.append("    totalDiscountedOrders: ").append(toIndentedString(totalDiscountedOrders)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    totalDiscounts: ").append(toIndentedString(totalDiscounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

