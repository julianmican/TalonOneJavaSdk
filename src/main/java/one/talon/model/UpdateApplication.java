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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.AttributesSettings;
import one.talon.model.LimitConfig;

/**
 * UpdateApplication
 */

public class UpdateApplication {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * A string indicating how should campaigns in this application deal with case sensitivity on coupon codes.
   */
  @JsonAdapter(CaseSensitivityEnum.Adapter.class)
  public enum CaseSensitivityEnum {
    SENSITIVE("sensitive"),
    
    INSENSITIVE_UPPERCASE("insensitive-uppercase"),
    
    INSENSITIVE_LOWERCASE("insensitive-lowercase");

    private String value;

    CaseSensitivityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CaseSensitivityEnum fromValue(String text) {
      for (CaseSensitivityEnum b : CaseSensitivityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<CaseSensitivityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CaseSensitivityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CaseSensitivityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CaseSensitivityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_CASE_SENSITIVITY = "caseSensitivity";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVITY)
  private CaseSensitivityEnum caseSensitivity;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes = null;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES_SETTINGS = "attributesSettings";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_SETTINGS)
  private AttributesSettings attributesSettings = null;

  public UpdateApplication name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateApplication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A longer description of the application.
   * @return description
  **/
  @ApiModelProperty(value = "A longer description of the application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateApplication timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * A string containing an IANA timezone descriptor.
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "A string containing an IANA timezone descriptor.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UpdateApplication currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * A string describing a default currency for new customer sessions.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "A string describing a default currency for new customer sessions.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public UpdateApplication caseSensitivity(CaseSensitivityEnum caseSensitivity) {
    this.caseSensitivity = caseSensitivity;
    return this;
  }

   /**
   * A string indicating how should campaigns in this application deal with case sensitivity on coupon codes.
   * @return caseSensitivity
  **/
  @ApiModelProperty(value = "A string indicating how should campaigns in this application deal with case sensitivity on coupon codes.")
  public CaseSensitivityEnum getCaseSensitivity() {
    return caseSensitivity;
  }

  public void setCaseSensitivity(CaseSensitivityEnum caseSensitivity) {
    this.caseSensitivity = caseSensitivity;
  }

  public UpdateApplication attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this campaign
   * @return attributes
  **/
  @ApiModelProperty(value = "Arbitrary properties associated with this campaign")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public UpdateApplication limits(List<LimitConfig> limits) {
    this.limits = limits;
    return this;
  }

  public UpdateApplication addLimitsItem(LimitConfig limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LimitConfig>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Default limits for campaigns created in this application
   * @return limits
  **/
  @ApiModelProperty(value = "Default limits for campaigns created in this application")
  public List<LimitConfig> getLimits() {
    return limits;
  }

  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }

  public UpdateApplication attributesSettings(AttributesSettings attributesSettings) {
    this.attributesSettings = attributesSettings;
    return this;
  }

   /**
   * Get attributesSettings
   * @return attributesSettings
  **/
  @ApiModelProperty(value = "")
  public AttributesSettings getAttributesSettings() {
    return attributesSettings;
  }

  public void setAttributesSettings(AttributesSettings attributesSettings) {
    this.attributesSettings = attributesSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplication updateApplication = (UpdateApplication) o;
    return Objects.equals(this.name, updateApplication.name) &&
        Objects.equals(this.description, updateApplication.description) &&
        Objects.equals(this.timezone, updateApplication.timezone) &&
        Objects.equals(this.currency, updateApplication.currency) &&
        Objects.equals(this.caseSensitivity, updateApplication.caseSensitivity) &&
        Objects.equals(this.attributes, updateApplication.attributes) &&
        Objects.equals(this.limits, updateApplication.limits) &&
        Objects.equals(this.attributesSettings, updateApplication.attributesSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, timezone, currency, caseSensitivity, attributes, limits, attributesSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    caseSensitivity: ").append(toIndentedString(caseSensitivity)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    attributesSettings: ").append(toIndentedString(attributesSettings)).append("\n");
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

