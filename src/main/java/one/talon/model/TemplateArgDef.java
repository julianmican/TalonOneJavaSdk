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

/**
 * TemplateArgDef
 */

public class TemplateArgDef {
  /**
   * The type of value this argument expects.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("string"),
    
    BOOLEAN("boolean"),
    
    NUMBER("number"),
    
    TIME("time"),
    
    _LIST_STRING_("(list string)");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private Object ui;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PICKLIST_I_D = "picklistID";
  @SerializedName(SERIALIZED_NAME_PICKLIST_I_D)
  private Integer picklistID;

  public static final String SERIALIZED_NAME_RESTRICTED_BY_PICKLIST = "restrictedByPicklist";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_BY_PICKLIST)
  private Boolean restrictedByPicklist;


  public TemplateArgDef type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of value this argument expects.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of value this argument expects.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TemplateArgDef description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A campaigner-friendly description of the argument, this will also be shown in the rule editor.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A campaigner-friendly description of the argument, this will also be shown in the rule editor.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TemplateArgDef title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A campaigner friendly name for the argument, this will be shown in the rule editor.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A campaigner friendly name for the argument, this will be shown in the rule editor.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TemplateArgDef ui(Object ui) {
    
    this.ui = ui;
    return this;
  }

   /**
   * Arbitrary metadata that may be used to render an input for this argument.
   * @return ui
  **/
  @ApiModelProperty(required = true, value = "Arbitrary metadata that may be used to render an input for this argument.")

  public Object getUi() {
    return ui;
  }


  public void setUi(Object ui) {
    this.ui = ui;
  }


  public TemplateArgDef key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The identifier for the associated value within the JSON object.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier for the associated value within the JSON object.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TemplateArgDef picklistID(Integer picklistID) {
    
    this.picklistID = picklistID;
    return this;
  }

   /**
   * ID of the picklist linked to a template.
   * @return picklistID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the picklist linked to a template.")

  public Integer getPicklistID() {
    return picklistID;
  }


  public void setPicklistID(Integer picklistID) {
    this.picklistID = picklistID;
  }


  public TemplateArgDef restrictedByPicklist(Boolean restrictedByPicklist) {
    
    this.restrictedByPicklist = restrictedByPicklist;
    return this;
  }

   /**
   * Whether or not this attribute&#39;s value is restricted by picklist (&#x60;picklist&#x60; property)
   * @return restrictedByPicklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this attribute's value is restricted by picklist (`picklist` property)")

  public Boolean getRestrictedByPicklist() {
    return restrictedByPicklist;
  }


  public void setRestrictedByPicklist(Boolean restrictedByPicklist) {
    this.restrictedByPicklist = restrictedByPicklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateArgDef templateArgDef = (TemplateArgDef) o;
    return Objects.equals(this.type, templateArgDef.type) &&
        Objects.equals(this.description, templateArgDef.description) &&
        Objects.equals(this.title, templateArgDef.title) &&
        Objects.equals(this.ui, templateArgDef.ui) &&
        Objects.equals(this.key, templateArgDef.key) &&
        Objects.equals(this.picklistID, templateArgDef.picklistID) &&
        Objects.equals(this.restrictedByPicklist, templateArgDef.restrictedByPicklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, title, ui, key, picklistID, restrictedByPicklist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateArgDef {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    picklistID: ").append(toIndentedString(picklistID)).append("\n");
    sb.append("    restrictedByPicklist: ").append(toIndentedString(restrictedByPicklist)).append("\n");
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

