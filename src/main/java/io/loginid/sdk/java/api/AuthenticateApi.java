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

public class AuthenticateApi {
    private ApiClient apiClient;

    public AuthenticateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authenticateCodeWaitPost
     *
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticateCodeWaitPostCall(AuthenticateCodeWaitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/code/wait";

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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticateCodeWaitPostValidateBeforeCall(AuthenticateCodeWaitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        com.squareup.okhttp.Call call = authenticateCodeWaitPostCall(body, requestID, progressListener, progressRequestListener);
        return call;
    }

    /**
     * User login (authentication code)
     * **Service token scope:** &#x60;auth.temporary&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return AuthenticationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticationResponse authenticateCodeWaitPost(AuthenticateCodeWaitBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticationResponse> resp = authenticateCodeWaitPostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * User login (authentication code)
     * **Service token scope:** &#x60;auth.temporary&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;AuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticationResponse> authenticateCodeWaitPostWithHttpInfo(AuthenticateCodeWaitBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticateCodeWaitPostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * User login (authentication code) (asynchronously)
     * **Service token scope:** &#x60;auth.temporary&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticateCodeWaitPostAsync(AuthenticateCodeWaitBody body, UUID requestID, final ApiCallback<AuthenticationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticateCodeWaitPostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for authenticateCompletePost
     *
     * @param origin                  (required)
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticateCompletePostCall(String origin, AuthenticateCompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/complete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (origin != null)
            localVarHeaderParams.put("Origin", apiClient.parameterToString(origin));
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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticateCompletePostValidateBeforeCall(String origin, AuthenticateCompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new ApiException("Missing the required parameter 'origin' when calling authenticateCompletePost(Async)");
        }

        com.squareup.okhttp.Call call = authenticateCompletePostCall(origin, body, requestID, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Finalize user login process
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticateCompleteResponse authenticateCompletePost(String origin, AuthenticateCompleteBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticateCompleteResponse> resp = authenticateCompletePostWithHttpInfo(origin, body, requestID);
        return resp.getData();
    }

    /**
     * Finalize user login process
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticateCompleteResponse> authenticateCompletePostWithHttpInfo(String origin, AuthenticateCompleteBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticateCompletePostValidateBeforeCall(origin, body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticateCompleteResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finalize user login process (asynchronously)
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticateCompletePostAsync(String origin, AuthenticateCompleteBody body, UUID requestID, final ApiCallback<AuthenticateCompleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticateCompletePostValidateBeforeCall(origin, body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticateCompleteResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for authenticateFido2CompletePost
     *
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticateFido2CompletePostCall(AuthenticateFido2CompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/fido2/complete";

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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticateFido2CompletePostValidateBeforeCall(AuthenticateFido2CompleteBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = authenticateFido2CompletePostCall(body, requestID, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Finalize user login (FIDO2)
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return AuthenticationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticationResponse authenticateFido2CompletePost(AuthenticateFido2CompleteBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticationResponse> resp = authenticateFido2CompletePostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Finalize user login (FIDO2)
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;AuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticationResponse> authenticateFido2CompletePostWithHttpInfo(AuthenticateFido2CompleteBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticateFido2CompletePostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finalize user login (FIDO2) (asynchronously)
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticateFido2CompletePostAsync(AuthenticateFido2CompleteBody body, UUID requestID, final ApiCallback<AuthenticationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticateFido2CompletePostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for authenticateFido2InitPost
     *
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticateFido2InitPostCall(AuthenticateFido2InitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/fido2/init";

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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticateFido2InitPostValidateBeforeCall(AuthenticateFido2InitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = authenticateFido2InitPostCall(body, requestID, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Initiate user login (FIDO2)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticateFido2InitResponse authenticateFido2InitPost(AuthenticateFido2InitBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticateFido2InitResponse> resp = authenticateFido2InitPostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * Initiate user login (FIDO2)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticateFido2InitResponse> authenticateFido2InitPostWithHttpInfo(AuthenticateFido2InitBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticateFido2InitPostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticateFido2InitResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Initiate user login (FIDO2) (asynchronously)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticateFido2InitPostAsync(AuthenticateFido2InitBody body, UUID requestID, final ApiCallback<AuthenticateFido2InitResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticateFido2InitPostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticateFido2InitResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for authenticateInitPost
     *
     * @param origin                  (required)
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticateInitPostCall(String origin, AuthenticateInitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/init";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (origin != null)
            localVarHeaderParams.put("Origin", apiClient.parameterToString(origin));
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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticateInitPostValidateBeforeCall(String origin, AuthenticateInitBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new ApiException("Missing the required parameter 'origin' when calling authenticateInitPost(Async)");
        }

        com.squareup.okhttp.Call call = authenticateInitPostCall(origin, body, requestID, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Initiate user login process
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticateInitResponse authenticateInitPost(String origin, AuthenticateInitBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticateInitResponse> resp = authenticateInitPostWithHttpInfo(origin, body, requestID);
        return resp.getData();
    }

    /**
     * Initiate user login process
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticateInitResponse> authenticateInitPostWithHttpInfo(String origin, AuthenticateInitBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticateInitPostValidateBeforeCall(origin, body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticateInitResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Initiate user login process (asynchronously)
     *
     * @param origin    (required)
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticateInitPostAsync(String origin, AuthenticateInitBody body, UUID requestID, final ApiCallback<AuthenticateInitResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticateInitPostValidateBeforeCall(origin, body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticateInitResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for authenticatePasswordPost
     *
     * @param body                    (optional)
     * @param requestID               (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticatePasswordPostCall(AuthenticatePasswordBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/authenticate/password";

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

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticatePasswordPostValidateBeforeCall(AuthenticatePasswordBody body, UUID requestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = authenticatePasswordPostCall(body, requestID, progressListener, progressRequestListener);
        return call;


    }

    /**
     * User login (password)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return AuthenticationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthenticationResponse authenticatePasswordPost(AuthenticatePasswordBody body, UUID requestID) throws ApiException {
        ApiResponse<AuthenticationResponse> resp = authenticatePasswordPostWithHttpInfo(body, requestID);
        return resp.getData();
    }

    /**
     * User login (password)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @return ApiResponse&lt;AuthenticationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthenticationResponse> authenticatePasswordPostWithHttpInfo(AuthenticatePasswordBody body, UUID requestID) throws ApiException {
        com.squareup.okhttp.Call call = authenticatePasswordPostValidateBeforeCall(body, requestID, null, null);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * User login (password) (asynchronously)
     * **Service token scope:** &#x60;auth.login&#x60;
     *
     * @param body      (optional)
     * @param requestID (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticatePasswordPostAsync(AuthenticatePasswordBody body, UUID requestID, final ApiCallback<AuthenticationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authenticatePasswordPostValidateBeforeCall(body, requestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthenticationResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
