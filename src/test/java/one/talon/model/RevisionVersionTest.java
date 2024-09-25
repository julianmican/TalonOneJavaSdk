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
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for RevisionVersion
 */
public class RevisionVersionTest {
    private final RevisionVersion model = new RevisionVersion();

    /**
     * Model tests for RevisionVersion
     */
    @Test
    public void testRevisionVersion() {
        // TODO: test RevisionVersion
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        // TODO: test accountId
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        // TODO: test applicationId
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
        // TODO: test campaignId
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'revisionId'
     */
    @Test
    public void revisionIdTest() {
        // TODO: test revisionId
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {
        // TODO: test startTime
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {
        // TODO: test endTime
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'activeRulesetId'
     */
    @Test
    public void activeRulesetIdTest() {
        // TODO: test activeRulesetId
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'couponSettings'
     */
    @Test
    public void couponSettingsTest() {
        // TODO: test couponSettings
    }

    /**
     * Test the property 'referralSettings'
     */
    @Test
    public void referralSettingsTest() {
        // TODO: test referralSettings
    }

    /**
     * Test the property 'limits'
     */
    @Test
    public void limitsTest() {
        // TODO: test limits
    }

    /**
     * Test the property 'features'
     */
    @Test
    public void featuresTest() {
        // TODO: test features
    }

}
