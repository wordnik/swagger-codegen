<?php
/**
 * UserApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * UserApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class UserApi
{

    /**
     * API Client
     *
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;

    /**
     * Constructor
     *
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    public function __construct(\Swagger\Client\ApiClient $apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('http://petstore.swagger.io/v2');
        }

        $this->apiClient = $apiClient;
    }

    /**
     * Get API client
     *
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }

    /**
     * Set the API client
     *
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     *
     * @return UserApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation createUser
     *
     * Create user.
     *
     * @param \Swagger\Client\Model\User $body Created user object (required)
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUser($body)
    {
        list($response) = $this->createUserWithHttpInfo($body);
        return $response;
    }


    /**
     * Operation createUserWithHttpInfo
     *
     * Create user.
     *
     * @param \Swagger\Client\Model\User $body Created user object (required)
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUserWithHttpInfo($body)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createUser');
        }

        // parse inputs
        $resourcePath = "/user";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'POST',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
    /**
     * Operation createUsersWithArrayInput
     *
     * Creates list of users with given input array.
     *
     * @param \Swagger\Client\Model\User[] $body List of user object (required)
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUsersWithArrayInput($body)
    {
        list($response) = $this->createUsersWithArrayInputWithHttpInfo($body);
        return $response;
    }


    /**
     * Operation createUsersWithArrayInputWithHttpInfo
     *
     * Creates list of users with given input array.
     *
     * @param \Swagger\Client\Model\User[] $body List of user object (required)
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUsersWithArrayInputWithHttpInfo($body)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createUsersWithArrayInput');
        }

        // parse inputs
        $resourcePath = "/user/createWithArray";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'POST',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
    /**
     * Operation createUsersWithListInput
     *
     * Creates list of users with given input array.
     *
     * @param \Swagger\Client\Model\User[] $body List of user object (required)
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUsersWithListInput($body)
    {
        list($response) = $this->createUsersWithListInputWithHttpInfo($body);
        return $response;
    }


    /**
     * Operation createUsersWithListInputWithHttpInfo
     *
     * Creates list of users with given input array.
     *
     * @param \Swagger\Client\Model\User[] $body List of user object (required)
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function createUsersWithListInputWithHttpInfo($body)
    {
        
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createUsersWithListInput');
        }

        // parse inputs
        $resourcePath = "/user/createWithList";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'POST',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
    /**
     * Operation deleteUser
     *
     * Delete user.
     *
     * @param string $username The name that needs to be deleted (required)
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function deleteUser($username)
    {
        list($response) = $this->deleteUserWithHttpInfo($username);
        return $response;
    }


    /**
     * Operation deleteUserWithHttpInfo
     *
     * Delete user.
     *
     * @param string $username The name that needs to be deleted (required)
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function deleteUserWithHttpInfo($username)
    {
        
        // verify the required parameter 'username' is set
        if ($username === null) {
            throw new \InvalidArgumentException('Missing the required parameter $username when calling deleteUser');
        }

        // parse inputs
        $resourcePath = "/user/{username}";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        // path params
        if ($username !== null) {
            $resourcePath = str_replace(
                "{" . "username" . "}",
                $this->apiClient->getSerializer()->toPathValue($username),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'DELETE',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
    /**
     * Operation getUserByName
     *
     * Get user by user name.
     *
     * @param string $username The name that needs to be fetched. Use user1 for testing.  (required)
     *
     * @return \Swagger\Client\Model\User
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getUserByName($username)
    {
        list($response) = $this->getUserByNameWithHttpInfo($username);
        return $response;
    }


    /**
     * Operation getUserByNameWithHttpInfo
     *
     * Get user by user name.
     *
     * @param string $username The name that needs to be fetched. Use user1 for testing.  (required)
     *
     * @return Array of \Swagger\Client\Model\User, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getUserByNameWithHttpInfo($username)
    {
        
        // verify the required parameter 'username' is set
        if ($username === null) {
            throw new \InvalidArgumentException('Missing the required parameter $username when calling getUserByName');
        }

        // parse inputs
        $resourcePath = "/user/{username}";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        // path params
        if ($username !== null) {
            $resourcePath = str_replace(
                "{" . "username" . "}",
                $this->apiClient->getSerializer()->toPathValue($username),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\User'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\User', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\User', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation loginUser
     *
     * Logs user into the system.
     *
     * @param string $username The user name for login (required)
     * @param string $password The password for login in clear text (required)
     *
     * @return string
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function loginUser($username, $password)
    {
        list($response) = $this->loginUserWithHttpInfo($username, $password);
        return $response;
    }


    /**
     * Operation loginUserWithHttpInfo
     *
     * Logs user into the system.
     *
     * @param string $username The user name for login (required)
     * @param string $password The password for login in clear text (required)
     *
     * @return Array of string, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function loginUserWithHttpInfo($username, $password)
    {
        
        // verify the required parameter 'username' is set
        if ($username === null) {
            throw new \InvalidArgumentException('Missing the required parameter $username when calling loginUser');
        }

        // verify the required parameter 'password' is set
        if ($password === null) {
            throw new \InvalidArgumentException('Missing the required parameter $password when calling loginUser');
        }

        // parse inputs
        $resourcePath = "/user/login";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        // query params
        if ($username !== null) {
            $queryParams['username'] = $this->apiClient->getSerializer()->toQueryValue($username);
        }// query params
        if ($password !== null) {
            $queryParams['password'] = $this->apiClient->getSerializer()->toQueryValue($password);
        }
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                'string'
            );
            if (!$response) {
                return array(null, $statusCode, $httpHeader);
            }

            return array($this->apiClient->getSerializer()->deserialize($response, 'string', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), 'string', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
    /**
     * Operation logoutUser
     *
     * Logs out current logged in user session.
     *
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function logoutUser()
    {
        list($response) = $this->logoutUserWithHttpInfo();
        return $response;
    }


    /**
     * Operation logoutUserWithHttpInfo
     *
     * Logs out current logged in user session.
     *
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function logoutUserWithHttpInfo()
    {
        
        // parse inputs
        $resourcePath = "/user/logout";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
    /**
     * Operation updateUser
     *
     * Updated user.
     *
     * @param string $username name that need to be deleted (required)
     * @param \Swagger\Client\Model\User $body Updated user object (required)
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function updateUser($username, $body)
    {
        list($response) = $this->updateUserWithHttpInfo($username, $body);
        return $response;
    }


    /**
     * Operation updateUserWithHttpInfo
     *
     * Updated user.
     *
     * @param string $username name that need to be deleted (required)
     * @param \Swagger\Client\Model\User $body Updated user object (required)
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function updateUserWithHttpInfo($username, $body)
    {
        
        // verify the required parameter 'username' is set
        if ($username === null) {
            throw new \InvalidArgumentException('Missing the required parameter $username when calling updateUser');
        }

        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling updateUser');
        }

        // parse inputs
        $resourcePath = "/user/{username}";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        
        
        // path params
        if ($username !== null) {
            $resourcePath = str_replace(
                "{" . "username" . "}",
                $this->apiClient->getSerializer()->toPathValue($username),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams
            );
            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }
}
