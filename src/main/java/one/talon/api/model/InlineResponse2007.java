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
import one.talon.api.model.CampaignAnalytics;

/**
 * InlineResponse2007
 */

public class InlineResponse2007 {
  @SerializedName("totalResultSize")
  private Integer totalResultSize = null;

  @SerializedName("data")
  private List<CampaignAnalytics> data = new ArrayList<CampaignAnalytics>();

  public InlineResponse2007 totalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Get totalResultSize
   * @return totalResultSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalResultSize() {
    return totalResultSize;
  }

  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }

  public InlineResponse2007 data(List<CampaignAnalytics> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2007 addDataItem(CampaignAnalytics dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CampaignAnalytics> getData() {
    return data;
  }

  public void setData(List<CampaignAnalytics> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.totalResultSize, inlineResponse2007.totalResultSize) &&
        Objects.equals(this.data, inlineResponse2007.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResultSize, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

