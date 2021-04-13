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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * InventoryCoupon
 */

public class InventoryCoupon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_LIMIT = "discountLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LIMIT)
  private BigDecimal discountLimit;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_USAGE_COUNTER = "usageCounter";
  @SerializedName(SERIALIZED_NAME_USAGE_COUNTER)
  private Integer usageCounter;

  public static final String SERIALIZED_NAME_DISCOUNT_COUNTER = "discountCounter";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_COUNTER)
  private BigDecimal discountCounter;

  public static final String SERIALIZED_NAME_DISCOUNT_REMAINDER = "discountRemainder";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_REMAINDER)
  private BigDecimal discountRemainder;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_REFERRAL_ID = "referralId";
  @SerializedName(SERIALIZED_NAME_REFERRAL_ID)
  private Integer referralId;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Integer importId;

  public static final String SERIALIZED_NAME_RESERVATION = "reservation";
  @SerializedName(SERIALIZED_NAME_RESERVATION)
  private Boolean reservation;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_PROFILE_REDEMPTION_COUNT = "profileRedemptionCount";
  @SerializedName(SERIALIZED_NAME_PROFILE_REDEMPTION_COUNT)
  private Integer profileRedemptionCount;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;


  public InventoryCoupon id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public InventoryCoupon created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public InventoryCoupon campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The ID of the campaign that owns this entity.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaign that owns this entity.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public InventoryCoupon value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The actual coupon code.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The actual coupon code.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public InventoryCoupon usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(required = true, value = "The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public InventoryCoupon discountLimit(BigDecimal discountLimit) {
    
    this.discountLimit = discountLimit;
    return this;
  }

   /**
   * The amount of discounts that can be given with this coupon code. 
   * minimum: 0
   * maximum: 999999
   * @return discountLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of discounts that can be given with this coupon code. ")

  public BigDecimal getDiscountLimit() {
    return discountLimit;
  }


  public void setDiscountLimit(BigDecimal discountLimit) {
    this.discountLimit = discountLimit;
  }


  public InventoryCoupon startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the coupon becomes valid.
   * minimum: 0
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp at which point the coupon becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public InventoryCoupon expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.
   * minimum: 0
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public InventoryCoupon usageCounter(Integer usageCounter) {
    
    this.usageCounter = usageCounter;
    return this;
  }

   /**
   * The number of times this coupon has been successfully used.
   * @return usageCounter
  **/
  @ApiModelProperty(required = true, value = "The number of times this coupon has been successfully used.")

  public Integer getUsageCounter() {
    return usageCounter;
  }


  public void setUsageCounter(Integer usageCounter) {
    this.usageCounter = usageCounter;
  }


  public InventoryCoupon discountCounter(BigDecimal discountCounter) {
    
    this.discountCounter = discountCounter;
    return this;
  }

   /**
   * The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon.
   * @return discountCounter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon.")

  public BigDecimal getDiscountCounter() {
    return discountCounter;
  }


  public void setDiscountCounter(BigDecimal discountCounter) {
    this.discountCounter = discountCounter;
  }


  public InventoryCoupon discountRemainder(BigDecimal discountRemainder) {
    
    this.discountRemainder = discountRemainder;
    return this;
  }

   /**
   * The remaining discount this coupon can give.
   * @return discountRemainder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remaining discount this coupon can give.")

  public BigDecimal getDiscountRemainder() {
    return discountRemainder;
  }


  public void setDiscountRemainder(BigDecimal discountRemainder) {
    this.discountRemainder = discountRemainder;
  }


  public InventoryCoupon attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public InventoryCoupon putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Arbitrary properties associated with this item
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this item")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public InventoryCoupon referralId(Integer referralId) {
    
    this.referralId = referralId;
    return this;
  }

   /**
   * The integration ID of the referring customer (if any) for whom this coupon was created as an effect.
   * @return referralId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The integration ID of the referring customer (if any) for whom this coupon was created as an effect.")

  public Integer getReferralId() {
    return referralId;
  }


  public void setReferralId(Integer referralId) {
    this.referralId = referralId;
  }


  public InventoryCoupon recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The Integration ID of the customer that is allowed to redeem this coupon.
   * @return recipientIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Integration ID of the customer that is allowed to redeem this coupon.")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  public InventoryCoupon importId(Integer importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The ID of the Import which created this coupon.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Import which created this coupon.")

  public Integer getImportId() {
    return importId;
  }


  public void setImportId(Integer importId) {
    this.importId = importId;
  }


  public InventoryCoupon reservation(Boolean reservation) {
    
    this.reservation = reservation;
    return this;
  }

   /**
   * This value controls what reservations mean to a coupon. If set to true the coupon reservation is used to mark it as a favourite, if set to false the coupon reservation is used as a requirement of usage. This value defaults to true if not specified.
   * @return reservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value controls what reservations mean to a coupon. If set to true the coupon reservation is used to mark it as a favourite, if set to false the coupon reservation is used as a requirement of usage. This value defaults to true if not specified.")

  public Boolean getReservation() {
    return reservation;
  }


  public void setReservation(Boolean reservation) {
    this.reservation = reservation;
  }


  public InventoryCoupon batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The id of the batch the coupon belongs to.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the batch the coupon belongs to.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public InventoryCoupon profileRedemptionCount(Integer profileRedemptionCount) {
    
    this.profileRedemptionCount = profileRedemptionCount;
    return this;
  }

   /**
   * The number of times the coupon was redeemed by the profile.
   * @return profileRedemptionCount
  **/
  @ApiModelProperty(required = true, value = "The number of times the coupon was redeemed by the profile.")

  public Integer getProfileRedemptionCount() {
    return profileRedemptionCount;
  }


  public void setProfileRedemptionCount(Integer profileRedemptionCount) {
    this.profileRedemptionCount = profileRedemptionCount;
  }


  public InventoryCoupon state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Can be either active, used, expired, or pending. active: reserved coupons that are neither pending nor used nor expired, and have a non-exhausted limit counter. used: coupons that are not pending, and have reached their redemption limit or were redeemed by the profile before expiration. expired: all non-pending, non-active, non-used coupons that were not redeemed by the profile. pending: coupons that have a start date in the future. 
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Can be either active, used, expired, or pending. active: reserved coupons that are neither pending nor used nor expired, and have a non-exhausted limit counter. used: coupons that are not pending, and have reached their redemption limit or were redeemed by the profile before expiration. expired: all non-pending, non-active, non-used coupons that were not redeemed by the profile. pending: coupons that have a start date in the future. ")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCoupon inventoryCoupon = (InventoryCoupon) o;
    return Objects.equals(this.id, inventoryCoupon.id) &&
        Objects.equals(this.created, inventoryCoupon.created) &&
        Objects.equals(this.campaignId, inventoryCoupon.campaignId) &&
        Objects.equals(this.value, inventoryCoupon.value) &&
        Objects.equals(this.usageLimit, inventoryCoupon.usageLimit) &&
        Objects.equals(this.discountLimit, inventoryCoupon.discountLimit) &&
        Objects.equals(this.startDate, inventoryCoupon.startDate) &&
        Objects.equals(this.expiryDate, inventoryCoupon.expiryDate) &&
        Objects.equals(this.usageCounter, inventoryCoupon.usageCounter) &&
        Objects.equals(this.discountCounter, inventoryCoupon.discountCounter) &&
        Objects.equals(this.discountRemainder, inventoryCoupon.discountRemainder) &&
        Objects.equals(this.attributes, inventoryCoupon.attributes) &&
        Objects.equals(this.referralId, inventoryCoupon.referralId) &&
        Objects.equals(this.recipientIntegrationId, inventoryCoupon.recipientIntegrationId) &&
        Objects.equals(this.importId, inventoryCoupon.importId) &&
        Objects.equals(this.reservation, inventoryCoupon.reservation) &&
        Objects.equals(this.batchId, inventoryCoupon.batchId) &&
        Objects.equals(this.profileRedemptionCount, inventoryCoupon.profileRedemptionCount) &&
        Objects.equals(this.state, inventoryCoupon.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, campaignId, value, usageLimit, discountLimit, startDate, expiryDate, usageCounter, discountCounter, discountRemainder, attributes, referralId, recipientIntegrationId, importId, reservation, batchId, profileRedemptionCount, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCoupon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    discountLimit: ").append(toIndentedString(discountLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageCounter: ").append(toIndentedString(usageCounter)).append("\n");
    sb.append("    discountCounter: ").append(toIndentedString(discountCounter)).append("\n");
    sb.append("    discountRemainder: ").append(toIndentedString(discountRemainder)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    referralId: ").append(toIndentedString(referralId)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    profileRedemptionCount: ").append(toIndentedString(profileRedemptionCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

