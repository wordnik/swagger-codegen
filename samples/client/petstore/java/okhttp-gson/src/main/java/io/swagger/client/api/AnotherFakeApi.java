/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressListener;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Client;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnotherFakeApi {
    private ApiClient apiClient;

    public AnotherFakeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnotherFakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for testSpecialTags
     * @param body client model (required)
     * @param progressListener Progress listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call testSpecialTagsCall(Client body, final ProgressListener progressListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/another-fake/dummy";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call testSpecialTagsValidateBeforeCall(Client body, final ProgressListener progressListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling testSpecialTags(Async)");
        }
        

        com.squareup.okhttp.Call call = testSpecialTagsCall(body, progressListener);
        return call;

    }

    /**
     * To test special tags
     * To test special tags
     * @param body client model (required)
     * @return Client
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Client testSpecialTags(Client body) throws ApiException {
        ApiResponse<Client> resp = testSpecialTagsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * To test special tags
     * To test special tags
     * @param body client model (required)
     * @return ApiResponse&lt;Client&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Client> testSpecialTagsWithHttpInfo(Client body) throws ApiException {
        com.squareup.okhttp.Call call = testSpecialTagsValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Client>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To test special tags (asynchronously)
     * To test special tags
     * @param body client model (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call testSpecialTagsAsync(Client body, final ApiCallback<Client> callback) throws ApiException {

        ProgressListener progressListener = null;

        if (callback != null) {
            progressListener = new ProgressListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }

                @Override
                public void onResponseProgress(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = testSpecialTagsValidateBeforeCall(body, progressListener);
        Type localVarReturnType = new TypeToken<Client>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
