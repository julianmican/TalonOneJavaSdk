/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
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
import one.talon.model.TemplateArgDef;

/**
 * 
 */
@ApiModel(description = "")

public class NewWebhook {
  public static final String SERIALIZED_NAME_APPLICATION_IDS = "applicationIds";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IDS)
  private List<Integer> applicationIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * API method for this webhook.
   */
  @JsonAdapter(VerbEnum.Adapter.class)
  public enum VerbEnum {
    POST("POST"),
    
    PUT("PUT"),
    
    GET("GET"),
    
    DELETE("DELETE"),
    
    PATCH("PATCH");

    private String value;

    VerbEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerbEnum fromValue(String value) {
      for (VerbEnum b : VerbEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerbEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerbEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerbEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerbEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private VerbEnum verb;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<String> headers = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<TemplateArgDef> params = new ArrayList<TemplateArgDef>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;


  public NewWebhook applicationIds(List<Integer> applicationIds) {
    
    this.applicationIds = applicationIds;
    return this;
  }

  public NewWebhook addApplicationIdsItem(Integer applicationIdsItem) {
    this.applicationIds.add(applicationIdsItem);
    return this;
  }

   /**
   * The IDs of the Applications that are related to this entity.
   * @return applicationIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the Applications that are related to this entity.")

  public List<Integer> getApplicationIds() {
    return applicationIds;
  }


  public void setApplicationIds(List<Integer> applicationIds) {
    this.applicationIds = applicationIds;
  }


  public NewWebhook title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Name or title for this webhook.
   * @return title
  **/
  @ApiModelProperty(example = "Send message", required = true, value = "Name or title for this webhook.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public NewWebhook description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the webhook.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A webhook to send a coupon to the user.", value = "A description of the webhook.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewWebhook verb(VerbEnum verb) {
    
    this.verb = verb;
    return this;
  }

   /**
   * API method for this webhook.
   * @return verb
  **/
  @ApiModelProperty(example = "POST", required = true, value = "API method for this webhook.")

  public VerbEnum getVerb() {
    return verb;
  }


  public void setVerb(VerbEnum verb) {
    this.verb = verb;
  }


  public NewWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * API URL (supports templating using parameters) for this webhook.
   * @return url
  **/
  @ApiModelProperty(example = "www.my-company.com/my-endpoint-name", required = true, value = "API URL (supports templating using parameters) for this webhook.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public NewWebhook headers(List<String> headers) {
    
    this.headers = headers;
    return this;
  }

  public NewWebhook addHeadersItem(String headersItem) {
    this.headers.add(headersItem);
    return this;
  }

   /**
   * List of API HTTP headers for this webhook.
   * @return headers
  **/
  @ApiModelProperty(example = "[{\"Authorization\": \"Basic bmF2ZWVua3VtYXIU=\"}, {\"Content-Type\": \"application/json\"}]", required = true, value = "List of API HTTP headers for this webhook.")

  public List<String> getHeaders() {
    return headers;
  }


  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  public NewWebhook payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * API payload (supports templating using parameters) for this webhook.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{  \"message\": \"${message}\" }", value = "API payload (supports templating using parameters) for this webhook.")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public NewWebhook params(List<TemplateArgDef> params) {
    
    this.params = params;
    return this;
  }

  public NewWebhook addParamsItem(TemplateArgDef paramsItem) {
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Array of template argument definitions.
   * @return params
  **/
  @ApiModelProperty(example = "[]", required = true, value = "Array of template argument definitions.")

  public List<TemplateArgDef> getParams() {
    return params;
  }


  public void setParams(List<TemplateArgDef> params) {
    this.params = params;
  }


  public NewWebhook enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Enables or disables webhook from showing in the Rule Builder.
   * @return enabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Enables or disables webhook from showing in the Rule Builder.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewWebhook newWebhook = (NewWebhook) o;
    return Objects.equals(this.applicationIds, newWebhook.applicationIds) &&
        Objects.equals(this.title, newWebhook.title) &&
        Objects.equals(this.description, newWebhook.description) &&
        Objects.equals(this.verb, newWebhook.verb) &&
        Objects.equals(this.url, newWebhook.url) &&
        Objects.equals(this.headers, newWebhook.headers) &&
        Objects.equals(this.payload, newWebhook.payload) &&
        Objects.equals(this.params, newWebhook.params) &&
        Objects.equals(this.enabled, newWebhook.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIds, title, description, verb, url, headers, payload, params, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewWebhook {\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

