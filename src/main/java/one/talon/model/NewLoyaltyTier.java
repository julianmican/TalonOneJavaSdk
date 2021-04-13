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
 * A new loyalty tier
 */
@ApiModel(description = "A new loyalty tier")

public class NewLoyaltyTier {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MIN_POINTS = "minPoints";
  @SerializedName(SERIALIZED_NAME_MIN_POINTS)
  private BigDecimal minPoints;


  public NewLoyaltyTier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the tier
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the tier")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewLoyaltyTier minPoints(BigDecimal minPoints) {
    
    this.minPoints = minPoints;
    return this;
  }

   /**
   * The minimum amount of points required to be eligible for the tier
   * minimum: 0
   * maximum: 100000000
   * @return minPoints
  **/
  @ApiModelProperty(required = true, value = "The minimum amount of points required to be eligible for the tier")

  public BigDecimal getMinPoints() {
    return minPoints;
  }


  public void setMinPoints(BigDecimal minPoints) {
    this.minPoints = minPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewLoyaltyTier newLoyaltyTier = (NewLoyaltyTier) o;
    return Objects.equals(this.name, newLoyaltyTier.name) &&
        Objects.equals(this.minPoints, newLoyaltyTier.minPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, minPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewLoyaltyTier {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minPoints: ").append(toIndentedString(minPoints)).append("\n");
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

