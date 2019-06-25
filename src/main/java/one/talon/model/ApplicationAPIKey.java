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
import org.threeten.bp.OffsetDateTime;

/**
 * ApplicationAPIKey
 */

public class ApplicationAPIKey {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ACCOUNT_I_D = "accountID";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_I_D)
  private Integer accountID;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "applicationID";
  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  private Integer applicationID;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public ApplicationAPIKey id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the API Key
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the API Key")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApplicationAPIKey createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of user who created
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "ID of user who created")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public ApplicationAPIKey title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title for API Key
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title for API Key")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ApplicationAPIKey accountID(Integer accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * ID of account the key is used for
   * @return accountID
  **/
  @ApiModelProperty(required = true, value = "ID of account the key is used for")
  public Integer getAccountID() {
    return accountID;
  }

  public void setAccountID(Integer accountID) {
    this.accountID = accountID;
  }

  public ApplicationAPIKey applicationID(Integer applicationID) {
    this.applicationID = applicationID;
    return this;
  }

   /**
   * ID of application the key is used for
   * @return applicationID
  **/
  @ApiModelProperty(required = true, value = "ID of application the key is used for")
  public Integer getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(Integer applicationID) {
    this.applicationID = applicationID;
  }

  public ApplicationAPIKey created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date the API key was created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The date the API key was created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ApplicationAPIKey expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The date the API key expired
   * @return expires
  **/
  @ApiModelProperty(required = true, value = "The date the API key expired")
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationAPIKey applicationAPIKey = (ApplicationAPIKey) o;
    return Objects.equals(this.id, applicationAPIKey.id) &&
        Objects.equals(this.createdBy, applicationAPIKey.createdBy) &&
        Objects.equals(this.title, applicationAPIKey.title) &&
        Objects.equals(this.accountID, applicationAPIKey.accountID) &&
        Objects.equals(this.applicationID, applicationAPIKey.applicationID) &&
        Objects.equals(this.created, applicationAPIKey.created) &&
        Objects.equals(this.expires, applicationAPIKey.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, title, accountID, applicationID, created, expires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAPIKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

