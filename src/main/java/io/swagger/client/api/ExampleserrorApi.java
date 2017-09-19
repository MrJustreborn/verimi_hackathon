/**
 * Digital Identity and Payments Platform (verimi)
 * The Digital Identity and Payments Platform (verimi) provides identity,  payment and data services for identity owners and service providers.  The services follows the schema defined by [JSON API](http://jsonapi.org/).    ## Schema  A JSON object MUST be at the root of every JSON API response containing data.  This object defines a document’s \"top level\".  A document MUST contain at least one of the following top-level members:   * `data`: the document’s \"primary data\"   * `errors`: an array of error objects   * `meta`: a meta object that contains non-standard meta-information.   ##  Processing Errors  A server MAY choose to stop processing as soon as a problem is encountered,  or it MAY continue processing and encounter multiple problems.  For instance, a server might process multiple attributes and then return multiple validation problems in a single response.  When a server encounters multiple problems for a single request,  the most generally applicable HTTP error code SHOULD be used in the response.  For instance, 400 Bad Request might be appropriate for multiple 4xx errors or  500 Internal Server Error might be appropriate for multiple 5xx errors.  ## Error Objects  Error objects provide additional information about problems encountered while performing an operation.  Error objects MUST be returned as an array keyed by errors in the top level of a JSON API document.  An error object MUST have the following members:  * `id`: a unique identifier for this particular occurrence of the problem  * `timestamp`: timestamp of the error recorded by the service (GMT) (extension of JSON API)  * `code`: an application-specific error code, expressed as a string value,   that MUST NOT change from occurrence to occurrence of the problem  * `title`: a short, human-readable summary of the problem   that SHOULD NOT change from occurrence to occurrence of the problem,   except for purposes of localization.  * `detail`: a human-readable explanation specific to this occurrence of the problem.   Like title, this field’s value can be localized.       An error object MAY have the following members:  * `status`: the HTTP status code applicable to this problem, expressed as a string value.      * `links`: a links object containing the following members:    * `about`: a link that leads to further details about this particular occurrence of the problem.       * `source`: an object containing references to the source of the error, optionally including any of the following members:    * `pointer`: a JSON Pointer [RFC6901] to the associated entity in the request document [e.g. \"/data\" for a primary data object, or \"/data/attributes/title\" for a specific attribute].    * `parameter`: a string indicating which URI query parameter caused the error.  * `meta`: a meta object containing non-standard meta-information about the error. 
 *
 * OpenAPI spec version: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.ResponseDocument;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleserrorApi {
    private ApiClient apiClient;

    public ExampleserrorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExampleserrorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for examplesErrorGet */
    private com.squareup.okhttp.Call examplesErrorGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/examples/error".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Example for error messages
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void examplesErrorGet() throws ApiException {
        examplesErrorGetWithHttpInfo();
    }

    /**
     * Example for error messages
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> examplesErrorGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = examplesErrorGetCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Example for error messages (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call examplesErrorGetAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = examplesErrorGetCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
