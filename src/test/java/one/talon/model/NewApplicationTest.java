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
import one.talon.model.AttributesSettings;
import one.talon.model.LimitConfig;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NewApplication
 */
public class NewApplicationTest {
    private final NewApplication model = new NewApplication();

    /**
     * Model tests for NewApplication
     */
    @Test
    public void testNewApplication() {
        // TODO: test NewApplication
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'timezone'
     */
    @Test
    public void timezoneTest() {
        // TODO: test timezone
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'caseSensitivity'
     */
    @Test
    public void caseSensitivityTest() {
        // TODO: test caseSensitivity
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'limits'
     */
    @Test
    public void limitsTest() {
        // TODO: test limits
    }

    /**
     * Test the property 'defaultDiscountScope'
     */
    @Test
    public void defaultDiscountScopeTest() {
        // TODO: test defaultDiscountScope
    }

    /**
     * Test the property 'enableCascadingDiscounts'
     */
    @Test
    public void enableCascadingDiscountsTest() {
        // TODO: test enableCascadingDiscounts
    }

    /**
     * Test the property 'enableFlattenedCartItems'
     */
    @Test
    public void enableFlattenedCartItemsTest() {
        // TODO: test enableFlattenedCartItems
    }

    /**
     * Test the property 'attributesSettings'
     */
    @Test
    public void attributesSettingsTest() {
        // TODO: test attributesSettings
    }

    /**
     * Test the property 'sandbox'
     */
    @Test
    public void sandboxTest() {
        // TODO: test sandbox
    }

    /**
     * Test the property 'enablePartialDiscounts'
     */
    @Test
    public void enablePartialDiscountsTest() {
        // TODO: test enablePartialDiscounts
    }

    /**
     * Test the property 'defaultDiscountAdditionalCostPerItemScope'
     */
    @Test
    public void defaultDiscountAdditionalCostPerItemScopeTest() {
        // TODO: test defaultDiscountAdditionalCostPerItemScope
    }

    /**
     * Test the property 'key'
     */
    @Test
    public void keyTest() {
        // TODO: test key
    }

    /**
     * Test the property 'enableCampaignStateManagement'
     */
    @Test
    public void enableCampaignStateManagementTest() {
        // TODO: test enableCampaignStateManagement
    }

}
