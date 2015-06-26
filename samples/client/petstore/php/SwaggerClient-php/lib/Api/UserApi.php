<?php
/**
 *  Copyright 2015 SmartBear Software
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
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

class UserApi {

  /** @var \Swagger\Client\ApiClient instance of the ApiClient */
  private $apiClient;

  /**
   * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
   */
  function __construct($apiClient = null) {
    if ($apiClient == null) {
      $apiClient = new ApiClient();
      $apiClient->getConfig()->setHost('http://petstore.swagger.io/v2');
    }

    $this->apiClient = $apiClient;
  }

  /**
   * @return \Swagger\Client\ApiClient get the API client
   */
  public function getApiClient() {
    return $this->apiClient;
  }

  /**
   * @param \Swagger\Client\ApiClient $apiClient set the API client
   * @return UserApi
   */
  public function setApiClient(ApiClient $apiClient) {
    $this->apiClient = $apiClient;
    return $this;
  }

  
  /**
   * createUser
   *
   * Create user
   *
   * @param \Swagger\Client\Model\User $body Created user object (required)
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function createUser($body) {
      

      // parse inputs
      $resourcePath = "/user";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "POST";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      
      
      // body params
      $_tempBody = null;
      if (isset($body)) {
        $_tempBody = $body;
      }

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
  /**
   * createUsersWithArrayInput
   *
   * Creates list of users with given input array
   *
   * @param \Swagger\Client\Model\User[] $body List of user object (required)
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function createUsersWithArrayInput($body) {
      

      // parse inputs
      $resourcePath = "/user/createWithArray";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "POST";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      
      
      // body params
      $_tempBody = null;
      if (isset($body)) {
        $_tempBody = $body;
      }

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
  /**
   * createUsersWithListInput
   *
   * Creates list of users with given input array
   *
   * @param \Swagger\Client\Model\User[] $body List of user object (required)
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function createUsersWithListInput($body) {
      

      // parse inputs
      $resourcePath = "/user/createWithList";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "POST";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      
      
      // body params
      $_tempBody = null;
      if (isset($body)) {
        $_tempBody = $body;
      }

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
  /**
   * loginUser
   *
   * Logs user into the system
   *
   * @param string $username The user name for login (required)
   * @param string $password The password for login in clear text (required)
   * @return string
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function loginUser($username, $password) {
      

      // parse inputs
      $resourcePath = "/user/login";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "GET";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      // query params
      if($username !== null) {
        $queryParams['username'] = $this->apiClient->getSerializer()->toQueryValue($username);
      }// query params
      if($password !== null) {
        $queryParams['password'] = $this->apiClient->getSerializer()->toQueryValue($password);
      }
      
      
      
      

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
          case 200:
            $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), 'string');
            $e->setResponseObject($data);
            break;
        }

        throw $e;
      }
      
      if (!$response) {
        return null;
      }

      $responseObject = $this->apiClient->getSerializer()->deserialize($response,'string');
      return $responseObject;
      
  }
  
  /**
   * logoutUser
   *
   * Logs out current logged in user session
   *
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function logoutUser() {
      

      // parse inputs
      $resourcePath = "/user/logout";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "GET";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      
      
      

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
  /**
   * getUserByName
   *
   * Get user by user name
   *
   * @param string $username The name that needs to be fetched. Use user1 for testing.  (required)
   * @return \Swagger\Client\Model\User
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function getUserByName($username) {
      
      // verify the required parameter 'username' is set
      if ($username === null) {
        throw new \InvalidArgumentException('Missing the required parameter $username when calling getUserByName');
      }
      

      // parse inputs
      $resourcePath = "/user/{username}";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "GET";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      // path params
      if($username !== null) {
        $resourcePath = str_replace("{" . "username" . "}",
                                    $this->apiClient->getSerializer()->toPathValue($username),
                                    $resourcePath);
      }
      
      

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
          case 200:
            $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\User');
            $e->setResponseObject($data);
            break;
        }

        throw $e;
      }
      
      if (!$response) {
        return null;
      }

      $responseObject = $this->apiClient->getSerializer()->deserialize($response,'\Swagger\Client\Model\User');
      return $responseObject;
      
  }
  
  /**
   * updateUser
   *
   * Updated user
   *
   * @param string $username name that need to be deleted (required)
   * @param \Swagger\Client\Model\User $body Updated user object (required)
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function updateUser($username, $body) {
      
      // verify the required parameter 'username' is set
      if ($username === null) {
        throw new \InvalidArgumentException('Missing the required parameter $username when calling updateUser');
      }
      

      // parse inputs
      $resourcePath = "/user/{username}";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "PUT";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      // path params
      if($username !== null) {
        $resourcePath = str_replace("{" . "username" . "}",
                                    $this->apiClient->getSerializer()->toPathValue($username),
                                    $resourcePath);
      }
      
      // body params
      $_tempBody = null;
      if (isset($body)) {
        $_tempBody = $body;
      }

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
  /**
   * deleteUser
   *
   * Delete user
   *
   * @param string $username The name that needs to be deleted (required)
   * @return void
   * @throws \Swagger\Client\ApiException on non-2xx response
   */
   public function deleteUser($username) {
      
      // verify the required parameter 'username' is set
      if ($username === null) {
        throw new \InvalidArgumentException('Missing the required parameter $username when calling deleteUser');
      }
      

      // parse inputs
      $resourcePath = "/user/{username}";
      $resourcePath = str_replace("{format}", "json", $resourcePath);
      $method = "DELETE";
      $httpBody = '';
      $queryParams = array();
      $headerParams = array();
      $formParams = array();
      $_header_accept = ApiClient::selectHeaderAccept(array('application/json', 'application/xml'));
      if (!is_null($_header_accept)) {
        $headerParams['Accept'] = $_header_accept;
      }
      $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());

      
      
      // path params
      if($username !== null) {
        $resourcePath = str_replace("{" . "username" . "}",
                                    $this->apiClient->getSerializer()->toPathValue($username),
                                    $resourcePath);
      }
      
      

      // for model (json/xml)
      if (isset($_tempBody)) {
        $httpBody = $_tempBody; // $_tempBody is the method argument, if present
      } else if (count($formParams) > 0) {
        // for HTTP post (form)
        $httpBody = $formParams;
      }
      
      // make the API Call
      try {
        $response = $this->apiClient->callAPI($resourcePath, $method,
                                              $queryParams, $httpBody,
                                              $headerParams);
      } catch (ApiException $e) {
        switch ($e->getCode()) { 
        }

        throw $e;
      }
      
  }
  
}
