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
import org.threeten.bp.OffsetDateTime;

/**
 * Session
 */

public class Session {
  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  public Session userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user of this session
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The ID of the user of this session")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Session token(String token) {
    this.token = token;
    return this;
  }

   /**
   * An opaque session identifier
   * @return token
  **/
  @ApiModelProperty(required = true, value = "An opaque session identifier")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Session created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Unix timestamp indicating when the session was first created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "Unix timestamp indicating when the session was first created.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.userId, session.userId) &&
        Objects.equals(this.token, session.token) &&
        Objects.equals(this.created, session.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, token, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

