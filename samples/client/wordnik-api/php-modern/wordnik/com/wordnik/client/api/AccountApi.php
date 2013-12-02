<?php
/**
 *  Copyright 2011 Wordnik, Inc.
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
namespace com\wordnik\client\api;

use com\wordnik\client\common\APIClient;
use com\wordnik\client\model\User;
use com\wordnik\client\model\WordList;
use com\wordnik\client\model\ApiTokenStatus;
use com\wordnik\client\model\AuthenticationToken;


/**
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 */
class AccountApi {

	function __construct(APIClient $apiClient) {
		$this->apiClient = $apiClient;
	}

	/**
	 * Authenticates a User.
	 *
	* @param string $username A confirmed Wordnik username (required)
	* @param string $password The user's password (required)
	* @return AuthenticationToken
	*/
	public function authenticate($username, $password) {

		//parse inputs
		$resourcePath = "/account.{format}/authenticate/{username}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($password != null) {
			$queryParams['password'] = $this->apiClient->toQueryValue($password);
		}
		if($username != null) {
			$resourcePath = str_replace("{" . "username" . "}", $this->apiClient->toPathValue($username), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'AuthenticationToken');
		
	}
	
	/**
	 * Authenticates a user.
	 *
	* @param string $username A confirmed Wordnik username (required)
	* @param string $body The user's password (required)
	* @return AuthenticationToken
	*/
	public function authenticatePost($username, $body) {

		//parse inputs
		$resourcePath = "/account.{format}/authenticate/{username}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "POST";
		$queryParams = array();
		$headerParams = array();

		if($username != null) {
			$resourcePath = str_replace("{" . "username" . "}", $this->apiClient->toPathValue($username), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'AuthenticationToken');
		
	}
	
	/**
	 * Fetches WordList objects for the logged-in user..
	 *
	* @param string $auth_token auth_token of logged-in user (required)
	* @param int $skip Results to skip (optional)
	* @param int $limit Maximum number of results to return (optional)
	* @return array[WordList]
	*/
	public function getWordListsForLoggedInUser($auth_token, $skip=null, $limit=null) {

		//parse inputs
		$resourcePath = "/account.{format}/wordLists";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($skip != null) {
			$queryParams['skip'] = $this->apiClient->toQueryValue($skip);
		}
		if($limit != null) {
			$queryParams['limit'] = $this->apiClient->toQueryValue($limit);
		}
		if($auth_token != null) {
			$headerParams['auth_token'] = $this->apiClient->toHeaderValue($auth_token);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'array[WordList]');
		
	}
	
	/**
	 * Returns usage statistics for the API account..
	 *
	* @param string $api_key Wordnik authentication token (optional)
	* @return ApiTokenStatus
	*/
	public function getApiTokenStatus($api_key=null) {

		//parse inputs
		$resourcePath = "/account.{format}/apiTokenStatus";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($api_key != null) {
			$headerParams['api_key'] = $this->apiClient->toHeaderValue($api_key);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'ApiTokenStatus');
		
	}
	
	/**
	 * Returns the logged-in User.
	 *
	* @param string $auth_token The auth token of the logged-in user, obtained by calling /account.{format}/authenticate/{username} (described above) (required)
	* @return User
	*/
	public function getLoggedInUser($auth_token) {

		//parse inputs
		$resourcePath = "/account.{format}/user";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($auth_token != null) {
			$headerParams['auth_token'] = $this->apiClient->toHeaderValue($auth_token);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'User');
		
	}
	
	}

