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


package one.talon.api;

import one.talon.ApiException;
import one.talon.model.Coupon;
import one.talon.model.CouponReservations;
import one.talon.model.CustomerInventory;
import one.talon.model.CustomerProfileAudienceRequest;
import one.talon.model.CustomerProfileIntegrationRequestV2;
import one.talon.model.InlineResponse200;
import one.talon.model.InlineResponse201;
import one.talon.model.IntegrationRequest;
import one.talon.model.IntegrationState;
import one.talon.model.IntegrationStateV2;
import one.talon.model.MultipleCustomerProfileIntegrationRequest;
import one.talon.model.MultipleCustomerProfileIntegrationResponseV2;
import one.talon.model.NewCustomerProfile;
import one.talon.model.NewCustomerSession;
import one.talon.model.NewEvent;
import one.talon.model.NewReferral;
import one.talon.model.NewReferralsForMultipleAdvocates;
import one.talon.model.Referral;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationApi
 */
@Ignore
public class IntegrationApiTest {

    private final IntegrationApi api = new IntegrationApi();

    
    /**
     * Create a new coupon reservation
     *
     * Creates a coupon reservation for all passed customer profiles on this couponID 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations couponReservations = null;
        Coupon response = api.createCouponReservation(couponValue, couponReservations);

        // TODO: test validations
    }
    
    /**
     * Create a referral code for an advocate
     *
     * Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralTest() throws ApiException {
        NewReferral newReferral = null;
        Referral response = api.createReferral(newReferral);

        // TODO: test validations
    }
    
    /**
     * Create referral codes for multiple advocates
     *
     * Creates unique referral codes for multiple advocates. The code will be valid for the referral campaign for which it is created, indicated in the &#x60;campaignId&#x60; parameter, and one referral code will be associated with one advocate using the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralsForMultipleAdvocatesTest() throws ApiException {
        NewReferralsForMultipleAdvocates newReferralsForMultipleAdvocates = null;
        String silent = null;
        InlineResponse201 response = api.createReferralsForMultipleAdvocates(newReferralsForMultipleAdvocates, silent);

        // TODO: test validations
    }
    
    /**
     * Delete coupon reservations
     *
     * Removes all passed customer profiles reservation from this coupon 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations couponReservations = null;
        api.deleteCouponReservation(couponValue, couponReservations);

        // TODO: test validations
    }
    
    /**
     * Delete the personal data of a customer
     *
     * Delete all attributes on the customer profile and on entities that reference that customer profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerDataTest() throws ApiException {
        String integrationId = null;
        api.deleteCustomerData(integrationId);

        // TODO: test validations
    }
    
    /**
     * Get an inventory of all data associated with a specific customer profile
     *
     * Get information regarding entities referencing this customer profile&#39;s integrationId. Currently we support customer profile information, referral codes and reserved coupons. In the future, this will be expanded with loyalty points.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerInventoryTest() throws ApiException {
        String integrationId = null;
        Boolean profile = null;
        Boolean referrals = null;
        Boolean coupons = null;
        Boolean loyalty = null;
        Boolean giveaways = null;
        CustomerInventory response = api.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways);

        // TODO: test validations
    }
    
    /**
     * Get the users that have this coupon reserved
     *
     * Returns all users that have this coupon marked as reserved 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservedCustomersTest() throws ApiException {
        String couponValue = null;
        InlineResponse200 response = api.getReservedCustomers(couponValue);

        // TODO: test validations
    }
    
    /**
     * Track an Event
     *
     * Records an arbitrary event in a customer session. For example, an integration might record an event when a user updates their payment information.  The &#x60;sessionId&#x60; body parameter is required, an event is always part of a session. Much like updating a customer session, if either the profile or the session do not exist, a new empty one will be created. Note that if the specified session already exists, it must belong to the same &#x60;profileId&#x60; or an error will be returned.  As with customer sessions, you can use an empty string for &#x60;profileId&#x60; to indicate that this is an anonymous session.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackEventTest() throws ApiException {
        NewEvent newEvent = null;
        Boolean dry = null;
        IntegrationState response = api.trackEvent(newEvent, dry);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Profile V1
     *
     * ⚠️ Deprecation Notice: Support for requests to this endpoint will end on 15.07.2021. We will not remove the endpoint, and it will still be accessible for you to use. For new features support, migrate to [API V2.0](/Getting-Started/APIV2).  Update (or create) a [Customer Profile](https://developers.talon.one/Getting-Started/entities#/customer-profile). This profile information can then be matched and/or updated by campaign [Rules][].  The &#x60;integrationId&#x60; may be any identifier that will remain stable for the customer. For example, you might use a database ID, an email, or a phone number as the &#x60;integrationId&#x60;. It is vital that this ID **not** change over time, so **don&#39;t** use any identifier that the customer can update themselves. E.g. if your application allows a customer to update their e-mail address, you should instead use a database ID.  Updating a customer profile will return a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  [Customer Profile]: /Getting-Started/entities#/customer-profile [Rules]: /Getting-Started/entities#/campaigns-rulesets-and-coupons 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileTest() throws ApiException {
        String integrationId = null;
        NewCustomerProfile newCustomerProfile = null;
        Boolean dry = null;
        IntegrationState response = api.updateCustomerProfile(integrationId, newCustomerProfile, dry);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Profile Audiences
     *
     * Update one ore multiple Customer Profiles with the specified Audiences 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileAudiencesTest() throws ApiException {
        CustomerProfileAudienceRequest customerProfileAudienceRequest = null;
        api.updateCustomerProfileAudiences(customerProfileAudienceRequest);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Profile
     *
     * Update (or create) a [Customer Profile](https://developers.talon.one/Getting-Started/entities#/customer-profile).  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  Updating a customer profile returns a response with the requested integration state. If &#x60;runRuleEngine&#x60; is set to &#x60;true&#x60;, the response includes:  - The effects generated by the triggered campaigns. - The created coupons and referral objects. - Any entity that was requested in the &#x60;responseContent&#x60; request parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileV2Test() throws ApiException {
        String integrationId = null;
        CustomerProfileIntegrationRequestV2 customerProfileIntegrationRequestV2 = null;
        Boolean runRuleEngine = null;
        Boolean dry = null;
        IntegrationStateV2 response = api.updateCustomerProfileV2(integrationId, customerProfileIntegrationRequestV2, runRuleEngine, dry);

        // TODO: test validations
    }
    
    /**
     * Update multiple Customer Profiles
     *
     * Update (or create) up to 1000 [Customer Profiles](https://developers.talon.one/Getting-Started/entities#/customer-profile) in 1 request.  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  A customer profile [can be linked to one or more sessions](https://developers.talon.one/Integration-API/API-Reference#updateCustomerSessionV2). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfilesV2Test() throws ApiException {
        MultipleCustomerProfileIntegrationRequest multipleCustomerProfileIntegrationRequest = null;
        String silent = null;
        MultipleCustomerProfileIntegrationResponseV2 response = api.updateCustomerProfilesV2(multipleCustomerProfileIntegrationRequest, silent);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Session V1
     *
     * ⚠️ Deprecation Notice: Support for requests to this endpoint will end on 15.07.2021. We will not remove the endpoint, and it will still be accessible for you to use. For new features support, migrate to [API V2.0](https://developers.talon.one/Getting-Started/APIV2).  Update (or create) a [Customer Session](https://developers.talon.one/Getting-Started/entities#/customer-session). For example, use this endpoint to represent which items are in the customer&#39;s cart.  The Talon.One platform supports multiple simultaneous sessions for the same profile. If you have multiple ways of accessing the same application you can either:  - Track multiple independent sessions or, - Use the same session across all of them.  You should share sessions when application access points share other state, such as the user&#39;s cart. If two points of access to the application have independent states, for example a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;. To track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. **Note:** You do **not** have to create a customer profile first. If the specified profile does not exist, an empty profile is created automatically.  Updating a customer profile returns a response with the full integration state. This includes the current state of the customer profile, the customer session, the event that was recorded, and an array of effects that took place.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerSessionTest() throws ApiException {
        String customerSessionId = null;
        NewCustomerSession newCustomerSession = null;
        Boolean dry = null;
        IntegrationState response = api.updateCustomerSession(customerSessionId, newCustomerSession, dry);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Session
     *
     * Update (or create) a [Customer Session](https://developers.talon.one/Getting-Started/entities#/customer-session). For example, use this endpoint to represent which items are in the customer&#39;s cart.  The Talon.One platform supports multiple simultaneous sessions for the same profile. If you have multiple ways of accessing the same application you can either:  - Track multiple independent sessions or, - Use the same session across all of them.  You should share sessions when application access points share other state, such as the user&#39;s cart. If two points of access to the application have independent states, for example a user can have different items in their cart across the two) they should use independent customer session ID&#39;s.  To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;. To track an anonymous session use the empty string (&#x60;\&quot;\&quot;&#x60;) as the &#x60;profileId&#x60;. **Note:** You do **not** have to create a customer profile first. If the specified profile does not exist, an empty profile is created automatically.  Updating a customer session returns a response with the requested integration state. If &#x60;runRuleEngine&#x60; is set to &#x60;true&#x60;, the response includes:  - The effects generated by the triggered campaigns. - The created coupons and referral objects. - Any entity that was requested in the &#x60;responseContent&#x60; request parameter.  The currency for the session and the cart items in the session is the same as that of the application with which the session is associated. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerSessionV2Test() throws ApiException {
        String customerSessionId = null;
        IntegrationRequest integrationRequest = null;
        Boolean dry = null;
        IntegrationStateV2 response = api.updateCustomerSessionV2(customerSessionId, integrationRequest, dry);

        // TODO: test validations
    }
    
}
