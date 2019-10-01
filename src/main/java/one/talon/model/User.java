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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_INVITE_TOKEN = "inviteToken";
  @SerializedName(SERIALIZED_NAME_INVITE_TOKEN)
  private String inviteToken;

  /**
   * Current user state.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INVITED("invited"),
    
    ACTIVE("active"),
    
    DEACTIVATED("deactivated");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_RELEASE_UPDATE = "releaseUpdate";
  @SerializedName(SERIALIZED_NAME_RELEASE_UPDATE)
  private Boolean releaseUpdate;

  public static final String SERIALIZED_NAME_LATEST_FEATURE = "latestFeature";
  @SerializedName(SERIALIZED_NAME_LATEST_FEATURE)
  private String latestFeature;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Integer> roles = null;

  public static final String SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS = "applicationNotificationSubscriptions";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NOTIFICATION_SUBSCRIPTIONS)
  private Object applicationNotificationSubscriptions = null;

  public User id(Integer id) {
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

  public User created(OffsetDateTime created) {
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

  public User modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The exact moment this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was last modified.")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address associated with your account.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address associated with your account.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public User inviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
    return this;
  }

   /**
   * Invite token, empty if the user as already accepted their invite.
   * @return inviteToken
  **/
  @ApiModelProperty(required = true, value = "Invite token, empty if the user as already accepted their invite.")
  public String getInviteToken() {
    return inviteToken;
  }

  public void setInviteToken(String inviteToken) {
    this.inviteToken = inviteToken;
  }

  public User state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current user state.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Current user state.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Full name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * A blob of ACL JSON
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "A blob of ACL JSON")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public User releaseUpdate(Boolean releaseUpdate) {
    this.releaseUpdate = releaseUpdate;
    return this;
  }

   /**
   * Update the user via email
   * @return releaseUpdate
  **/
  @ApiModelProperty(required = true, value = "Update the user via email")
  public Boolean getReleaseUpdate() {
    return releaseUpdate;
  }

  public void setReleaseUpdate(Boolean releaseUpdate) {
    this.releaseUpdate = releaseUpdate;
  }

  public User latestFeature(String latestFeature) {
    this.latestFeature = latestFeature;
    return this;
  }

   /**
   * Latest feature the user has been notified.
   * @return latestFeature
  **/
  @ApiModelProperty(value = "Latest feature the user has been notified.")
  public String getLatestFeature() {
    return latestFeature;
  }

  public void setLatestFeature(String latestFeature) {
    this.latestFeature = latestFeature;
  }

  public User roles(List<Integer> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Contains a list of all roles a user is a memeber of
   * @return roles
  **/
  @ApiModelProperty(value = "Contains a list of all roles a user is a memeber of")
  public List<Integer> getRoles() {
    return roles;
  }

  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }

  public User applicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
    return this;
  }

   /**
   * Get applicationNotificationSubscriptions
   * @return applicationNotificationSubscriptions
  **/
  @ApiModelProperty(value = "")
  public Object getApplicationNotificationSubscriptions() {
    return applicationNotificationSubscriptions;
  }

  public void setApplicationNotificationSubscriptions(Object applicationNotificationSubscriptions) {
    this.applicationNotificationSubscriptions = applicationNotificationSubscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.modified, user.modified) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.inviteToken, user.inviteToken) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.policy, user.policy) &&
        Objects.equals(this.releaseUpdate, user.releaseUpdate) &&
        Objects.equals(this.latestFeature, user.latestFeature) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.applicationNotificationSubscriptions, user.applicationNotificationSubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, email, accountId, inviteToken, state, name, policy, releaseUpdate, latestFeature, roles, applicationNotificationSubscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    inviteToken: ").append(toIndentedString(inviteToken)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    releaseUpdate: ").append(toIndentedString(releaseUpdate)).append("\n");
    sb.append("    latestFeature: ").append(toIndentedString(latestFeature)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    applicationNotificationSubscriptions: ").append(toIndentedString(applicationNotificationSubscriptions)).append("\n");
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

