/*
 * LoginID Service API
 * # Introduction  <span class=\"subtext\"> Welcome to the LoginID API docs. This documentation will help understand the API calls being made behind our SDKs.  These APIs can be used to manage authentication, users, and user credentials. </span>  # Authentication  <span class=\"subtext\"> There is one main form of authentication for the API: <br/>&bull; API Service Token </span> 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.loginid.sdk.java.api;

import com.google.gson.reflect.TypeToken;
import io.loginid.sdk.java.invokers.*;
import io.loginid.sdk.java.model.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class CredentialsApi {
    private ApiClient apiClient;

    public CredentialsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CredentialsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for credentialsFido2CompletePost
     * @param body  (optional)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2CompletePostCall(CredentialsFido2CompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/credentials/fido2/complete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (requestID != null)
        localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsFido2CompletePostValidateBeforeCall(CredentialsFido2CompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = credentialsFido2CompletePostCall(body, requestID, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Finalize adding a new FIDO2 credential
     *
     * @param body  (optional)
     * @param requestID  (optional)
     * @return InlineResponse20014
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsFido2CompleteResponse credentialsFido2CompletePost(CredentialsFido2CompleteBody body, UUID requestID) throws ApiException {
        ApiResponse<CredentialsFido2CompleteResponse> resp = credentialsFido2CompletePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Finalize adding a new FIDO2 credential
     *
     * @param body  (optional)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20014&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsFido2CompleteResponse> credentialsFido2CompletePostWithHttpInfo(CredentialsFido2CompleteBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsFido2CompletePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsFido2CompleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finalize adding a new FIDO2 credential (asynchronously)
     *
     * @param body  (optional)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2CompletePostAsync(CredentialsFido2CompleteBody body, UUID requestID, final ApiCallback<CredentialsFido2CompleteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsFido2CompletePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsFido2CompleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for credentialsFido2InitCodePost
     * @param body  (optional)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2InitCodePostCall(CredentialsFido2InitCodeBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/credentials/fido2/init/code";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (requestID != null)
        localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "serviceToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsFido2InitCodePostValidateBeforeCall(CredentialsFido2InitCodeBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = credentialsFido2InitCodePostCall(body, requestID, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Initiate adding a new FIDO2 credential
     * **Service token scope:** &#x60;credentials.add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return InlineResponse20013
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsFido2InitCodeResponse credentialsFido2InitCodePost(CredentialsFido2InitCodeBody body, UUID requestID) throws ApiException {
        ApiResponse<CredentialsFido2InitCodeResponse> resp = credentialsFido2InitCodePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Initiate adding a new FIDO2 credential
     * **Service token scope:** &#x60;credentials.add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20013&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsFido2InitCodeResponse> credentialsFido2InitCodePostWithHttpInfo(CredentialsFido2InitCodeBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsFido2InitCodePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsFido2InitCodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Initiate adding a new FIDO2 credential (asynchronously)
     * **Service token scope:** &#x60;credentials.add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2InitCodePostAsync(CredentialsFido2InitCodeBody body, UUID requestID, final ApiCallback<CredentialsFido2InitCodeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsFido2InitCodePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsFido2InitCodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for credentialsGet
     * @param userId User ID to retrieve credentials for (required)
     * @param xClientID Management API client ID which is created on LoginID admin dashboard. (required)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsGetCall(UUID userId, String xClientID, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_id", userId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xClientID != null)
        localVarHeaderParams.put("X-Client-ID", apiClient.parameterToString(xClientID));
        if (requestID != null)
        localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "serviceToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsGetValidateBeforeCall(UUID userId, String xClientID, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling credentialsGet(Async)");
        }
        // verify the required parameter 'xClientID' is set
        if (xClientID == null) {
            throw new ApiException("Missing the required parameter 'xClientID' when calling credentialsGet(Async)");
        }

        com.squareup.okhttp.Call call = credentialsGetCall(userId, xClientID, requestID, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Retrieve credentials for user
     * **Service token scope:** &#x60;credentials.list&#x60;
     * @param userId User ID to retrieve credentials for (required)
     * @param xClientID Management API client ID which is created on LoginID admin dashboard. (required)
     * @param requestID  (optional)
     * @return InlineResponse20011
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsResponse credentialsGet(UUID userId, String xClientID, UUID requestID) throws ApiException {
        ApiResponse<CredentialsResponse> resp = credentialsGetWithHttpInfo(userId, xClientID, requestID);
        return resp.getData();
    }

    /**
     * Retrieve credentials for user
     * **Service token scope:** &#x60;credentials.list&#x60;
     * @param userId User ID to retrieve credentials for (required)
     * @param xClientID Management API client ID which is created on LoginID admin dashboard. (required)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20011&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsResponse> credentialsGetWithHttpInfo(UUID userId, String xClientID, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsGetValidateBeforeCall(userId, xClientID, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve credentials for user (asynchronously)
     * **Service token scope:** &#x60;credentials.list&#x60;
     * @param userId User ID to retrieve credentials for (required)
     * @param xClientID Management API client ID which is created on LoginID admin dashboard. (required)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsGetAsync(UUID userId, String xClientID, UUID requestID, final ApiCallback<CredentialsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsGetValidateBeforeCall(userId, xClientID, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for credentialsRenamePost
     * @param body  (optional)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsRenamePostCall(CredentialsRenameBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/credentials/rename";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (requestID != null)
        localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "serviceToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsRenamePostValidateBeforeCall(CredentialsRenameBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = credentialsRenamePostCall(body, requestID, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Rename user&#x27;s credential
     * **Service token scope:** &#x60;credentials.rename&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return InlineResponse20012
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsChangeResponse credentialsRenamePost(CredentialsRenameBody body, UUID requestID) throws ApiException {
        ApiResponse<CredentialsChangeResponse> resp = credentialsRenamePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Rename user&#x27;s credential
     * **Service token scope:** &#x60;credentials.rename&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20012&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsChangeResponse> credentialsRenamePostWithHttpInfo(CredentialsRenameBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsRenamePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsChangeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rename user&#x27;s credential (asynchronously)
     * **Service token scope:** &#x60;credentials.rename&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsRenamePostAsync(CredentialsRenameBody body, UUID requestID, final ApiCallback<CredentialsChangeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsRenamePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsChangeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for credentialsRevokePost
     * @param body  (optional)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsRevokePostCall(CredentialsRevokeBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/credentials/revoke";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (requestID != null)
        localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "serviceToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsRevokePostValidateBeforeCall(CredentialsRevokeBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = credentialsRevokePostCall(body, requestID, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Revoke user&#x27;s credential
     * **Service token scope:** &#x60;credentials.revoke&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return InlineResponse20012
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsChangeResponse credentialsRevokePost(CredentialsRevokeBody body, UUID requestID) throws ApiException {
        ApiResponse<CredentialsChangeResponse> resp = credentialsRevokePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Revoke user&#x27;s credential
     * **Service token scope:** &#x60;credentials.revoke&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20012&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsChangeResponse> credentialsRevokePostWithHttpInfo(CredentialsRevokeBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsRevokePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsChangeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Revoke user&#x27;s credential (asynchronously)
     * **Service token scope:** &#x60;credentials.revoke&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsRevokePostAsync(CredentialsRevokeBody body, UUID requestID, final ApiCallback<CredentialsChangeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsRevokePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsChangeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for credentialsFido2InitForcePost
     * @param body  (optional)
     * @param requestID  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2InitForcePostCall(CredentialsFido2InitForceBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/credentials/fido2/init/force";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (requestID != null)
            localVarHeaderParams.put("Request-ID", apiClient.parameterToString(requestID));

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

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call credentialsFido2InitForcePostValidateBeforeCall(CredentialsFido2InitForceBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = credentialsFido2InitForcePostCall(body, requestID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Begin adding FIDO2 authenticator as new credential (initiated by client backend)
     * **Service token scope:** &#x60;credentials.force_add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return InlineResponse20014
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CredentialsFido2InitForceResponse credentialsFido2InitForcePost(CredentialsFido2InitForceBody body, UUID requestID) throws ApiException {
        ApiResponse<CredentialsFido2InitForceResponse> resp = credentialsFido2InitForcePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Begin adding FIDO2 authenticator as new credential (initiated by client backend)
     * **Service token scope:** &#x60;credentials.force_add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @return ApiResponse&lt;InlineResponse20014&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CredentialsFido2InitForceResponse> credentialsFido2InitForcePostWithHttpInfo(CredentialsFido2InitForceBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = credentialsFido2InitForcePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<CredentialsFido2InitForceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Begin adding FIDO2 authenticator as new credential (initiated by client backend) (asynchronously)
     * **Service token scope:** &#x60;credentials.force_add&#x60;
     * @param body  (optional)
     * @param requestID  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call credentialsFido2InitForcePostAsync(CredentialsFido2InitForceBody body, UUID requestID, final ApiCallback<CredentialsFido2InitForceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = credentialsFido2InitForcePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CredentialsFido2InitForceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
