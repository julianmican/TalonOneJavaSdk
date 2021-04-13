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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * EventType
 */

public class EventType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_APPLICATION_IDS = "applicationIds";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IDS)
  private List<Integer> applicationIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * This defines how the request payload will be parsed before your handler code is run.
   */
  @JsonAdapter(MimeTypeEnum.Adapter.class)
  public enum MimeTypeEnum {
    APPLICATION_JSON("application/json"),
    
    APPLICATION_X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"),
    
    NONE("none");

    private String value;

    MimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MimeTypeEnum fromValue(String value) {
      for (MimeTypeEnum b : MimeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MimeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private MimeTypeEnum mimeType;

  public static final String SERIALIZED_NAME_EXAMPLE_PAYLOAD = "examplePayload";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_PAYLOAD)
  private String examplePayload;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Map<String, Object> schema = null;

  /**
   * The language of the handler code. Currently only &#x60;\&quot;talang\&quot;&#x60; is supported.
   */
  @JsonAdapter(HandlerLanguageEnum.Adapter.class)
  public enum HandlerLanguageEnum {
    TALANG("talang");

    private String value;

    HandlerLanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HandlerLanguageEnum fromValue(String value) {
      for (HandlerLanguageEnum b : HandlerLanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HandlerLanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HandlerLanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HandlerLanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HandlerLanguageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HANDLER_LANGUAGE = "handlerLanguage";
  @SerializedName(SERIALIZED_NAME_HANDLER_LANGUAGE)
  private HandlerLanguageEnum handlerLanguage;

  public static final String SERIALIZED_NAME_HANDLER = "handler";
  @SerializedName(SERIALIZED_NAME_HANDLER)
  private String handler;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public EventType id(Integer id) {
    
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


  public EventType created(OffsetDateTime created) {
    
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


  public EventType applicationIds(List<Integer> applicationIds) {
    
    this.applicationIds = applicationIds;
    return this;
  }

  public EventType addApplicationIdsItem(Integer applicationIdsItem) {
    this.applicationIds.add(applicationIdsItem);
    return this;
  }

   /**
   * The IDs of the applications that are related to this entity.
   * @return applicationIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the applications that are related to this entity.")

  public List<Integer> getApplicationIds() {
    return applicationIds;
  }


  public void setApplicationIds(List<Integer> applicationIds) {
    this.applicationIds = applicationIds;
  }


  public EventType title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The human-friendly display name for this event type. Use a short, past-tense, description of the event.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The human-friendly display name for this event type. Use a short, past-tense, description of the event.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public EventType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The machine-friendly canonical name for this event type. This will be used in URLs, and cannot be changed after an event type has been created.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The machine-friendly canonical name for this event type. This will be used in URLs, and cannot be changed after an event type has been created.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An explanation of when the event type is triggered. Write this with a campaign manager in mind. For example:  &gt; The \&quot;Payment Accepted\&quot; event is triggered after successful processing of a payment by our payment gateway. 
   * @return description
  **/
  @ApiModelProperty(required = true, value = "An explanation of when the event type is triggered. Write this with a campaign manager in mind. For example:  > The \"Payment Accepted\" event is triggered after successful processing of a payment by our payment gateway. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventType mimeType(MimeTypeEnum mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * This defines how the request payload will be parsed before your handler code is run.
   * @return mimeType
  **/
  @ApiModelProperty(required = true, value = "This defines how the request payload will be parsed before your handler code is run.")

  public MimeTypeEnum getMimeType() {
    return mimeType;
  }


  public void setMimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
  }


  public EventType examplePayload(String examplePayload) {
    
    this.examplePayload = examplePayload;
    return this;
  }

   /**
   * It is often helpful to include an example payload with the event type definition for documentation purposes.
   * @return examplePayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "It is often helpful to include an example payload with the event type definition for documentation purposes.")

  public String getExamplePayload() {
    return examplePayload;
  }


  public void setExamplePayload(String examplePayload) {
    this.examplePayload = examplePayload;
  }


  public EventType schema(Map<String, Object> schema) {
    
    this.schema = schema;
    return this;
  }

  public EventType putSchemaItem(String key, Object schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<String, Object>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

   /**
   * It is strongly recommended to define a JSON schema that will be used to perform structural validation of request payloads after parsing. 
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "It is strongly recommended to define a JSON schema that will be used to perform structural validation of request payloads after parsing. ")

  public Map<String, Object> getSchema() {
    return schema;
  }


  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }


  public EventType handlerLanguage(HandlerLanguageEnum handlerLanguage) {
    
    this.handlerLanguage = handlerLanguage;
    return this;
  }

   /**
   * The language of the handler code. Currently only &#x60;\&quot;talang\&quot;&#x60; is supported.
   * @return handlerLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language of the handler code. Currently only `\"talang\"` is supported.")

  public HandlerLanguageEnum getHandlerLanguage() {
    return handlerLanguage;
  }


  public void setHandlerLanguage(HandlerLanguageEnum handlerLanguage) {
    this.handlerLanguage = handlerLanguage;
  }


  public EventType handler(String handler) {
    
    this.handler = handler;
    return this;
  }

   /**
   * Code that will be run after successful parsing &amp; validation of the payload for this event. This code _may_ choose to evaluate campaign rules. 
   * @return handler
  **/
  @ApiModelProperty(required = true, value = "Code that will be run after successful parsing & validation of the payload for this event. This code _may_ choose to evaluate campaign rules. ")

  public String getHandler() {
    return handler;
  }


  public void setHandler(String handler) {
    this.handler = handler;
  }


  public EventType version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of this event type. When updating an existing event type this must be **exactly** &#x60;currentVersion + 1&#x60;. 
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of this event type. When updating an existing event type this must be **exactly** `currentVersion + 1`. ")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventType eventType = (EventType) o;
    return Objects.equals(this.id, eventType.id) &&
        Objects.equals(this.created, eventType.created) &&
        Objects.equals(this.applicationIds, eventType.applicationIds) &&
        Objects.equals(this.title, eventType.title) &&
        Objects.equals(this.name, eventType.name) &&
        Objects.equals(this.description, eventType.description) &&
        Objects.equals(this.mimeType, eventType.mimeType) &&
        Objects.equals(this.examplePayload, eventType.examplePayload) &&
        Objects.equals(this.schema, eventType.schema) &&
        Objects.equals(this.handlerLanguage, eventType.handlerLanguage) &&
        Objects.equals(this.handler, eventType.handler) &&
        Objects.equals(this.version, eventType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, applicationIds, title, name, description, mimeType, examplePayload, schema, handlerLanguage, handler, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    examplePayload: ").append(toIndentedString(examplePayload)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    handlerLanguage: ").append(toIndentedString(handlerLanguage)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

