/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp.Portable;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IFakeApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// To test \&quot;client\&quot; model
        /// </summary>
        /// <remarks>
        /// To test \&quot;client\&quot; model
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">client model</param>
        /// <returns>ModelClient</returns>
        ModelClient TestClientModel (ModelClient body);

        /// <summary>
        /// To test \&quot;client\&quot; model
        /// </summary>
        /// <remarks>
        /// To test \&quot;client\&quot; model
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">client model</param>
        /// <returns>ApiResponse of ModelClient</returns>
        ApiResponse<ModelClient> TestClientModelWithHttpInfo (ModelClient body);
        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <remarks>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="number">None</param>
        /// <param name="_double">None</param>
        /// <param name="patternWithoutDelimiter">None</param>
        /// <param name="_byte">None</param>
        /// <param name="integer">None (optional)</param>
        /// <param name="int32">None (optional)</param>
        /// <param name="int64">None (optional)</param>
        /// <param name="_float">None (optional)</param>
        /// <param name="_string">None (optional)</param>
        /// <param name="binary">None (optional)</param>
        /// <param name="date">None (optional)</param>
        /// <param name="dateTime">None (optional)</param>
        /// <param name="password">None (optional)</param>
        /// <param name="callback">None (optional)</param>
        /// <returns></returns>
        void TestEndpointParameters (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer = null, int? int32 = null, long? int64 = null, float? _float = null, string _string = null, byte[] binary = null, DateTime? date = null, DateTime? dateTime = null, string password = null, string callback = null);

        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <remarks>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="number">None</param>
        /// <param name="_double">None</param>
        /// <param name="patternWithoutDelimiter">None</param>
        /// <param name="_byte">None</param>
        /// <param name="integer">None (optional)</param>
        /// <param name="int32">None (optional)</param>
        /// <param name="int64">None (optional)</param>
        /// <param name="_float">None (optional)</param>
        /// <param name="_string">None (optional)</param>
        /// <param name="binary">None (optional)</param>
        /// <param name="date">None (optional)</param>
        /// <param name="dateTime">None (optional)</param>
        /// <param name="password">None (optional)</param>
        /// <param name="callback">None (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> TestEndpointParametersWithHttpInfo (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer = null, int? int32 = null, long? int64 = null, float? _float = null, string _string = null, byte[] binary = null, DateTime? date = null, DateTime? dateTime = null, string password = null, string callback = null);
        /// <summary>
        /// To test enum parameters
        /// </summary>
        /// <remarks>
        /// To test enum parameters
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enumFormStringArray">Form parameter enum test (string array) (optional)</param>
        /// <param name="enumFormString">Form parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array) (optional)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array) (optional)</param>
        /// <param name="enumQueryString">Query parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double) (optional)</param>
        /// <param name="enumQueryDouble">Query parameter enum test (double) (optional)</param>
        /// <returns></returns>
        void TestEnumParameters (List<string> enumFormStringArray = null, string enumFormString = null, List<string> enumHeaderStringArray = null, string enumHeaderString = null, List<string> enumQueryStringArray = null, string enumQueryString = null, int? enumQueryInteger = null, double? enumQueryDouble = null);

        /// <summary>
        /// To test enum parameters
        /// </summary>
        /// <remarks>
        /// To test enum parameters
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enumFormStringArray">Form parameter enum test (string array) (optional)</param>
        /// <param name="enumFormString">Form parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array) (optional)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array) (optional)</param>
        /// <param name="enumQueryString">Query parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double) (optional)</param>
        /// <param name="enumQueryDouble">Query parameter enum test (double) (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> TestEnumParametersWithHttpInfo (List<string> enumFormStringArray = null, string enumFormString = null, List<string> enumHeaderStringArray = null, string enumHeaderString = null, List<string> enumQueryStringArray = null, string enumQueryString = null, int? enumQueryInteger = null, double? enumQueryDouble = null);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class FakeApi : IFakeApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="FakeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public FakeApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FakeApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public FakeApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// To test \&quot;client\&quot; model To test \&quot;client\&quot; model
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">client model</param>
        /// <returns>ModelClient</returns>
        public ModelClient TestClientModel (ModelClient body)
        {
             ApiResponse<ModelClient> localVarResponse = TestClientModelWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// To test \&quot;client\&quot; model To test \&quot;client\&quot; model
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">client model</param>
        /// <returns>ApiResponse of ModelClient</returns>
        public ApiResponse< ModelClient > TestClientModelWithHttpInfo (ModelClient body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling FakeApi->TestClientModel");

            var localVarPath = "./fake";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TestClientModel", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ModelClient>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                (ModelClient) Configuration.ApiClient.Deserialize(localVarResponse, typeof(ModelClient)));
            
        }

        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="number">None</param>
        /// <param name="_double">None</param>
        /// <param name="patternWithoutDelimiter">None</param>
        /// <param name="_byte">None</param>
        /// <param name="integer">None (optional)</param>
        /// <param name="int32">None (optional)</param>
        /// <param name="int64">None (optional)</param>
        /// <param name="_float">None (optional)</param>
        /// <param name="_string">None (optional)</param>
        /// <param name="binary">None (optional)</param>
        /// <param name="date">None (optional)</param>
        /// <param name="dateTime">None (optional)</param>
        /// <param name="password">None (optional)</param>
        /// <param name="callback">None (optional)</param>
        /// <returns></returns>
        public void TestEndpointParameters (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer = null, int? int32 = null, long? int64 = null, float? _float = null, string _string = null, byte[] binary = null, DateTime? date = null, DateTime? dateTime = null, string password = null, string callback = null)
        {
             TestEndpointParametersWithHttpInfo(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, _string, binary, date, dateTime, password, callback);
        }

        /// <summary>
        /// Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="number">None</param>
        /// <param name="_double">None</param>
        /// <param name="patternWithoutDelimiter">None</param>
        /// <param name="_byte">None</param>
        /// <param name="integer">None (optional)</param>
        /// <param name="int32">None (optional)</param>
        /// <param name="int64">None (optional)</param>
        /// <param name="_float">None (optional)</param>
        /// <param name="_string">None (optional)</param>
        /// <param name="binary">None (optional)</param>
        /// <param name="date">None (optional)</param>
        /// <param name="dateTime">None (optional)</param>
        /// <param name="password">None (optional)</param>
        /// <param name="callback">None (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> TestEndpointParametersWithHttpInfo (decimal? number, double? _double, string patternWithoutDelimiter, byte[] _byte, int? integer = null, int? int32 = null, long? int64 = null, float? _float = null, string _string = null, byte[] binary = null, DateTime? date = null, DateTime? dateTime = null, string password = null, string callback = null)
        {
            // verify the required parameter 'number' is set
            if (number == null)
                throw new ApiException(400, "Missing required parameter 'number' when calling FakeApi->TestEndpointParameters");
            // verify the required parameter '_double' is set
            if (_double == null)
                throw new ApiException(400, "Missing required parameter '_double' when calling FakeApi->TestEndpointParameters");
            // verify the required parameter 'patternWithoutDelimiter' is set
            if (patternWithoutDelimiter == null)
                throw new ApiException(400, "Missing required parameter 'patternWithoutDelimiter' when calling FakeApi->TestEndpointParameters");
            // verify the required parameter '_byte' is set
            if (_byte == null)
                throw new ApiException(400, "Missing required parameter '_byte' when calling FakeApi->TestEndpointParameters");

            var localVarPath = "./fake";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/xml; charset=utf-8", 
                "application/json; charset=utf-8"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/xml; charset=utf-8", 
                "application/json; charset=utf-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (integer != null) localVarFormParams.Add("integer", Configuration.ApiClient.ParameterToString(integer)); // form parameter
            if (int32 != null) localVarFormParams.Add("int32", Configuration.ApiClient.ParameterToString(int32)); // form parameter
            if (int64 != null) localVarFormParams.Add("int64", Configuration.ApiClient.ParameterToString(int64)); // form parameter
            if (number != null) localVarFormParams.Add("number", Configuration.ApiClient.ParameterToString(number)); // form parameter
            if (_float != null) localVarFormParams.Add("float", Configuration.ApiClient.ParameterToString(_float)); // form parameter
            if (_double != null) localVarFormParams.Add("double", Configuration.ApiClient.ParameterToString(_double)); // form parameter
            if (_string != null) localVarFormParams.Add("string", Configuration.ApiClient.ParameterToString(_string)); // form parameter
            if (patternWithoutDelimiter != null) localVarFormParams.Add("pattern_without_delimiter", Configuration.ApiClient.ParameterToString(patternWithoutDelimiter)); // form parameter
            if (_byte != null) localVarFormParams.Add("byte", Configuration.ApiClient.ParameterToString(_byte)); // form parameter
            if (binary != null) localVarFormParams.Add("binary", Configuration.ApiClient.ParameterToString(binary)); // form parameter
            if (date != null) localVarFormParams.Add("date", Configuration.ApiClient.ParameterToString(date)); // form parameter
            if (dateTime != null) localVarFormParams.Add("dateTime", Configuration.ApiClient.ParameterToString(dateTime)); // form parameter
            if (password != null) localVarFormParams.Add("password", Configuration.ApiClient.ParameterToString(password)); // form parameter
            if (callback != null) localVarFormParams.Add("callback", Configuration.ApiClient.ParameterToString(callback)); // form parameter

            // authentication (http_basic_test) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(Configuration.Username) || !String.IsNullOrEmpty(Configuration.Password))
            {
                localVarHeaderParams["Authorization"] = "Basic " + ApiClient.Base64Encode(Configuration.Username + ":" + Configuration.Password);
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TestEndpointParameters", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enumFormStringArray">Form parameter enum test (string array) (optional)</param>
        /// <param name="enumFormString">Form parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array) (optional)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array) (optional)</param>
        /// <param name="enumQueryString">Query parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double) (optional)</param>
        /// <param name="enumQueryDouble">Query parameter enum test (double) (optional)</param>
        /// <returns></returns>
        public void TestEnumParameters (List<string> enumFormStringArray = null, string enumFormString = null, List<string> enumHeaderStringArray = null, string enumHeaderString = null, List<string> enumQueryStringArray = null, string enumQueryString = null, int? enumQueryInteger = null, double? enumQueryDouble = null)
        {
             TestEnumParametersWithHttpInfo(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble);
        }

        /// <summary>
        /// To test enum parameters To test enum parameters
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enumFormStringArray">Form parameter enum test (string array) (optional)</param>
        /// <param name="enumFormString">Form parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumHeaderStringArray">Header parameter enum test (string array) (optional)</param>
        /// <param name="enumHeaderString">Header parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryStringArray">Query parameter enum test (string array) (optional)</param>
        /// <param name="enumQueryString">Query parameter enum test (string) (optional, default to -efg)</param>
        /// <param name="enumQueryInteger">Query parameter enum test (double) (optional)</param>
        /// <param name="enumQueryDouble">Query parameter enum test (double) (optional)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> TestEnumParametersWithHttpInfo (List<string> enumFormStringArray = null, string enumFormString = null, List<string> enumHeaderStringArray = null, string enumHeaderString = null, List<string> enumQueryStringArray = null, string enumQueryString = null, int? enumQueryInteger = null, double? enumQueryDouble = null)
        {

            var localVarPath = "./fake";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "*/*"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "*/*"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (enumQueryStringArray != null) localVarQueryParams.Add("enum_query_string_array", Configuration.ApiClient.ParameterToString(enumQueryStringArray)); // query parameter
            if (enumQueryString != null) localVarQueryParams.Add("enum_query_string", Configuration.ApiClient.ParameterToString(enumQueryString)); // query parameter
            if (enumQueryInteger != null) localVarQueryParams.Add("enum_query_integer", Configuration.ApiClient.ParameterToString(enumQueryInteger)); // query parameter
            if (enumHeaderStringArray != null) localVarHeaderParams.Add("enum_header_string_array", Configuration.ApiClient.ParameterToString(enumHeaderStringArray)); // header parameter
            if (enumHeaderString != null) localVarHeaderParams.Add("enum_header_string", Configuration.ApiClient.ParameterToString(enumHeaderString)); // header parameter
            if (enumFormStringArray != null) localVarFormParams.Add("enum_form_string_array", Configuration.ApiClient.ParameterToString(enumFormStringArray)); // form parameter
            if (enumFormString != null) localVarFormParams.Add("enum_form_string", Configuration.ApiClient.ParameterToString(enumFormString)); // form parameter
            if (enumQueryDouble != null) localVarFormParams.Add("enum_query_double", Configuration.ApiClient.ParameterToString(enumQueryDouble)); // form parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TestEnumParameters", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Key, x => x.Value.ToString()),
                null);
        }

    }
}
