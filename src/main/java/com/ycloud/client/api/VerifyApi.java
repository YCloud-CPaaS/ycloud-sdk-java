/*
 * YCloud API
 * The [YCloud](https://ycloud.com) API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer). Our API is designed to have predictable, resource-oriented URLs, return [JSON](https://www.json.org) responses, and use standard HTTP response codes and verbs.
 *
 * The version of the OpenAPI document: v2
 * Contact: service@ycloud.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ycloud.client.api;

import com.ycloud.client.ApiCallback;
import com.ycloud.client.ApiClient;
import com.ycloud.client.ApiException;
import com.ycloud.client.ApiResponse;
import com.ycloud.client.Configuration;
import com.ycloud.client.Pair;
import com.ycloud.client.ProgressRequestBody;
import com.ycloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ycloud.client.model.Verification;
import com.ycloud.client.model.VerificationCheck;
import com.ycloud.client.model.VerificationCheckRequest;
import com.ycloud.client.model.VerificationSendRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VerifyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VerifyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VerifyApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for check
     * @param verificationCheckRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the verification check. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkCall(VerificationCheckRequest verificationCheckRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = verificationCheckRequest;

        // create path and map variables
        String localVarPath = "/verify/verificationChecks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkValidateBeforeCall(VerificationCheckRequest verificationCheckRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'verificationCheckRequest' is set
        if (verificationCheckRequest == null) {
            throw new ApiException("Missing the required parameter 'verificationCheckRequest' when calling check(Async)");
        }
        

        okhttp3.Call localVarCall = checkCall(verificationCheckRequest, _callback);
        return localVarCall;

    }

    /**
     * Check a verification
     * <p>
     * Checks a verification with a phone number, an email address, or a verification ID. A &#x60;pending&#x60; verification status changes to &#x60;approved&#x60; once you receive a response with the &#x60;valid&#x60; parameter is &#x60;true&#x60;. An approved verification cannot be checked anymore.
     * @param verificationCheckRequest  (required)
     * @return VerificationCheck
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the verification check. </td><td>  -  </td></tr>
     </table>
     */
    public VerificationCheck check(VerificationCheckRequest verificationCheckRequest) throws ApiException {
        ApiResponse<VerificationCheck> localVarResp = checkWithHttpInfo(verificationCheckRequest);
        return localVarResp.getData();
    }

    /**
     * Check a verification
     * <p>
     * Checks a verification with a phone number, an email address, or a verification ID. A &#x60;pending&#x60; verification status changes to &#x60;approved&#x60; once you receive a response with the &#x60;valid&#x60; parameter is &#x60;true&#x60;. An approved verification cannot be checked anymore.
     * @param verificationCheckRequest  (required)
     * @return ApiResponse&lt;VerificationCheck&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the verification check. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VerificationCheck> checkWithHttpInfo(VerificationCheckRequest verificationCheckRequest) throws ApiException {
        okhttp3.Call localVarCall = checkValidateBeforeCall(verificationCheckRequest, null);
        Type localVarReturnType = new TypeToken<VerificationCheck>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check a verification (asynchronously)
     * <p>
     * Checks a verification with a phone number, an email address, or a verification ID. A &#x60;pending&#x60; verification status changes to &#x60;approved&#x60; once you receive a response with the &#x60;valid&#x60; parameter is &#x60;true&#x60;. An approved verification cannot be checked anymore.
     * @param verificationCheckRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed the verification check. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkAsync(VerificationCheckRequest verificationCheckRequest, final ApiCallback<VerificationCheck> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkValidateBeforeCall(verificationCheckRequest, _callback);
        Type localVarReturnType = new TypeToken<VerificationCheck>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for send
     * @param verificationSendRequest Verification request that needs to be sent. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendCall(VerificationSendRequest verificationSendRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = verificationSendRequest;

        // create path and map variables
        String localVarPath = "/verify/verifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendValidateBeforeCall(VerificationSendRequest verificationSendRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'verificationSendRequest' is set
        if (verificationSendRequest == null) {
            throw new ApiException("Missing the required parameter 'verificationSendRequest' when calling send(Async)");
        }
        

        okhttp3.Call localVarCall = sendCall(verificationSendRequest, _callback);
        return localVarCall;

    }

    /**
     * Start a verification
     * <p>
     * Starts a verification by sending an SMS, voice, or email message to the recipient. This verification is charged once the message is sent successfully.
     * @param verificationSendRequest Verification request that needs to be sent. (required)
     * @return Verification
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public Verification send(VerificationSendRequest verificationSendRequest) throws ApiException {
        ApiResponse<Verification> localVarResp = sendWithHttpInfo(verificationSendRequest);
        return localVarResp.getData();
    }

    /**
     * Start a verification
     * <p>
     * Starts a verification by sending an SMS, voice, or email message to the recipient. This verification is charged once the message is sent successfully.
     * @param verificationSendRequest Verification request that needs to be sent. (required)
     * @return ApiResponse&lt;Verification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Verification> sendWithHttpInfo(VerificationSendRequest verificationSendRequest) throws ApiException {
        okhttp3.Call localVarCall = sendValidateBeforeCall(verificationSendRequest, null);
        Type localVarReturnType = new TypeToken<Verification>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Start a verification (asynchronously)
     * <p>
     * Starts a verification by sending an SMS, voice, or email message to the recipient. This verification is charged once the message is sent successfully.
     * @param verificationSendRequest Verification request that needs to be sent. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendAsync(VerificationSendRequest verificationSendRequest, final ApiCallback<Verification> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(verificationSendRequest, _callback);
        Type localVarReturnType = new TypeToken<Verification>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
