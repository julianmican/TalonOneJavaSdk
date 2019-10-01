/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * OpenAPI spec version: 1.0.0
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
import one.talon.model.CouponRejectionReason;
import one.talon.model.ReferralRejectionReason;

/**
 * Meta
 */

public class Meta {
  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private Object campaigns = null;

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private Object coupons = null;

  public static final String SERIALIZED_NAME_COUPON_REJECTION_REASON = "couponRejectionReason";
  @SerializedName(SERIALIZED_NAME_COUPON_REJECTION_REASON)
  private CouponRejectionReason couponRejectionReason = null;

  public static final String SERIALIZED_NAME_REFERRAL_REJECTION_REASON = "referralRejectionReason";
  @SerializedName(SERIALIZED_NAME_REFERRAL_REJECTION_REASON)
  private ReferralRejectionReason referralRejectionReason = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private Object warnings = null;

  public Meta campaigns(Object campaigns) {
    this.campaigns = campaigns;
    return this;
  }

   /**
   * Maps each evaluated campaign ID to a key-value list of that campaigns attributes. Campaigns without attributes will be omitted.
   * @return campaigns
  **/
  @ApiModelProperty(value = "Maps each evaluated campaign ID to a key-value list of that campaigns attributes. Campaigns without attributes will be omitted.")
  public Object getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(Object campaigns) {
    this.campaigns = campaigns;
  }

  public Meta coupons(Object coupons) {
    this.coupons = coupons;
    return this;
  }

   /**
   * Maps the coupon value to a key-value list of that coupons attributes.
   * @return coupons
  **/
  @ApiModelProperty(value = "Maps the coupon value to a key-value list of that coupons attributes.")
  public Object getCoupons() {
    return coupons;
  }

  public void setCoupons(Object coupons) {
    this.coupons = coupons;
  }

  public Meta couponRejectionReason(CouponRejectionReason couponRejectionReason) {
    this.couponRejectionReason = couponRejectionReason;
    return this;
  }

   /**
   * Get couponRejectionReason
   * @return couponRejectionReason
  **/
  @ApiModelProperty(value = "")
  public CouponRejectionReason getCouponRejectionReason() {
    return couponRejectionReason;
  }

  public void setCouponRejectionReason(CouponRejectionReason couponRejectionReason) {
    this.couponRejectionReason = couponRejectionReason;
  }

  public Meta referralRejectionReason(ReferralRejectionReason referralRejectionReason) {
    this.referralRejectionReason = referralRejectionReason;
    return this;
  }

   /**
   * Get referralRejectionReason
   * @return referralRejectionReason
  **/
  @ApiModelProperty(value = "")
  public ReferralRejectionReason getReferralRejectionReason() {
    return referralRejectionReason;
  }

  public void setReferralRejectionReason(ReferralRejectionReason referralRejectionReason) {
    this.referralRejectionReason = referralRejectionReason;
  }

  public Meta warnings(Object warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public Object getWarnings() {
    return warnings;
  }

  public void setWarnings(Object warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.campaigns, meta.campaigns) &&
        Objects.equals(this.coupons, meta.coupons) &&
        Objects.equals(this.couponRejectionReason, meta.couponRejectionReason) &&
        Objects.equals(this.referralRejectionReason, meta.referralRejectionReason) &&
        Objects.equals(this.warnings, meta.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, coupons, couponRejectionReason, referralRejectionReason, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    couponRejectionReason: ").append(toIndentedString(couponRejectionReason)).append("\n");
    sb.append("    referralRejectionReason: ").append(toIndentedString(referralRejectionReason)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

