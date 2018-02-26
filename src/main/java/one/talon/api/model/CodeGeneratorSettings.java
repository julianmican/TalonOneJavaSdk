/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
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

/**
 * CodeGeneratorSettings
 */

public class CodeGeneratorSettings {
  @SerializedName("validCharacters")
  private List<String> validCharacters = new ArrayList<String>();

  @SerializedName("couponPattern")
  private String couponPattern = null;

  public CodeGeneratorSettings validCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
    return this;
  }

  public CodeGeneratorSettings addValidCharactersItem(String validCharactersItem) {
    this.validCharacters.add(validCharactersItem);
    return this;
  }

   /**
   * Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).
   * @return validCharacters
  **/
  @ApiModelProperty(required = true, value = "Set of characters to be used when generating random part of code. Defaults to [A-Z, 0-9] (in terms of RegExp).")
  public List<String> getValidCharacters() {
    return validCharacters;
  }

  public void setValidCharacters(List<String> validCharacters) {
    this.validCharacters = validCharacters;
  }

  public CodeGeneratorSettings couponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
    return this;
  }

   /**
   * The pattern that will be used to generate coupon codes. The character &#x60;#&#x60; acts as a placeholder and will be replaced by a random character from the &#x60;validCharacters&#x60; set. 
   * @return couponPattern
  **/
  @ApiModelProperty(required = true, value = "The pattern that will be used to generate coupon codes. The character `#` acts as a placeholder and will be replaced by a random character from the `validCharacters` set. ")
  public String getCouponPattern() {
    return couponPattern;
  }

  public void setCouponPattern(String couponPattern) {
    this.couponPattern = couponPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeGeneratorSettings codeGeneratorSettings = (CodeGeneratorSettings) o;
    return Objects.equals(this.validCharacters, codeGeneratorSettings.validCharacters) &&
        Objects.equals(this.couponPattern, codeGeneratorSettings.couponPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCharacters, couponPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeGeneratorSettings {\n");
    
    sb.append("    validCharacters: ").append(toIndentedString(validCharacters)).append("\n");
    sb.append("    couponPattern: ").append(toIndentedString(couponPattern)).append("\n");
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

