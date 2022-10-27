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


import com.ycloud.client.model.WhatsappMessage;
import com.ycloud.client.model.WhatsappMessageSendRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WhatsappMessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WhatsappMessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WhatsappMessagesApi(ApiClient apiClient) {
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
     * Build call for retrieve
     * @param id ID of the object. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveCall(String id, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/whatsapp/messages/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling retrieve(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveCall(id, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a WhatsApp message
     * <p>
     * Retrieves a WhatsApp message you&#39;ve previously sent.
     * @param id ID of the object. (required)
     * @return WhatsappMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the object. </td><td>  -  </td></tr>
     </table>
     */
    public WhatsappMessage retrieve(String id) throws ApiException {
        ApiResponse<WhatsappMessage> localVarResp = retrieveWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Retrieve a WhatsApp message
     * <p>
     * Retrieves a WhatsApp message you&#39;ve previously sent.
     * @param id ID of the object. (required)
     * @return ApiResponse&lt;WhatsappMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the object. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WhatsappMessage> retrieveWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = retrieveValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<WhatsappMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a WhatsApp message (asynchronously)
     * <p>
     * Retrieves a WhatsApp message you&#39;ve previously sent.
     * @param id ID of the object. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveAsync(String id, final ApiCallback<WhatsappMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<WhatsappMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for send
     * @param whatsappMessageSendRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendCall(WhatsappMessageSendRequest whatsappMessageSendRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = whatsappMessageSendRequest;

        // create path and map variables
        String localVarPath = "/whatsapp/messages";

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
    private okhttp3.Call sendValidateBeforeCall(WhatsappMessageSendRequest whatsappMessageSendRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'whatsappMessageSendRequest' is set
        if (whatsappMessageSendRequest == null) {
            throw new ApiException("Missing the required parameter 'whatsappMessageSendRequest' when calling send(Async)");
        }
        

        okhttp3.Call localVarCall = sendCall(whatsappMessageSendRequest, _callback);
        return localVarCall;

    }

    /**
     * Send a WhatsApp message
     * <p>
     * Sends an outbound WhatsApp message.
     * @param whatsappMessageSendRequest  (required)
     * @return WhatsappMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public WhatsappMessage send(WhatsappMessageSendRequest whatsappMessageSendRequest) throws ApiException {
        ApiResponse<WhatsappMessage> localVarResp = sendWithHttpInfo(whatsappMessageSendRequest);
        return localVarResp.getData();
    }

    /**
     * Send a WhatsApp message
     * <p>
     * Sends an outbound WhatsApp message.
     * @param whatsappMessageSendRequest  (required)
     * @return ApiResponse&lt;WhatsappMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WhatsappMessage> sendWithHttpInfo(WhatsappMessageSendRequest whatsappMessageSendRequest) throws ApiException {
        okhttp3.Call localVarCall = sendValidateBeforeCall(whatsappMessageSendRequest, null);
        Type localVarReturnType = new TypeToken<WhatsappMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send a WhatsApp message (asynchronously)
     * <p>
     * Sends an outbound WhatsApp message.
     * @param whatsappMessageSendRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request is successfully accepted. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendAsync(WhatsappMessageSendRequest whatsappMessageSendRequest, final ApiCallback<WhatsappMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendValidateBeforeCall(whatsappMessageSendRequest, _callback);
        Type localVarReturnType = new TypeToken<WhatsappMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}