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
namespace com\wordnik\petstore\api;

use com\wordnik\client\APIClient;
use com\wordnik\petstore\model\Pet;
use com\wordnik\petstore\model\File;


/**
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 */
class PetApi {

	function __construct(APIClient $apiClient) {
		$this->apiClient = $apiClient;
	}

	/**
	 * Find pet by ID.
	 *
	* @param int $petId ID of pet that needs to be fetched (required)
	* @return Pet
	*/
	public function getPetById($petId) {

		//parse inputs
		$resourcePath = "/pet/{petId}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($petId != null) {
			$resourcePath = str_replace("{" . "petId" . "}", $this->apiClient->toPathValue($petId), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'Pet');
		
	}
	
	/**
	 * Deletes a pet.
	 *
	* @param string $petId Pet id to delete (required)
	*/
	public function deletePet($petId) {

		//parse inputs
		$resourcePath = "/pet/{petId}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "DELETE";
		$queryParams = array();
		$headerParams = array();

		if($petId != null) {
			$resourcePath = str_replace("{" . "petId" . "}", $this->apiClient->toPathValue($petId), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		
	}
	
	/**
	 * partial updates to a pet.
	 *
	* @param string $petId ID of pet that needs to be fetched (required)
	* @param Pet $body Pet object that needs to be added to the store (required)
	* @return Array[Pet]
	*/
	public function partialUpdate($petId, $body) {

		//parse inputs
		$resourcePath = "/pet/{petId}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "PATCH";
		$queryParams = array();
		$headerParams = array();

		if($petId != null) {
			$resourcePath = str_replace("{" . "petId" . "}", $this->apiClient->toPathValue($petId), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'Array[Pet]');
		
	}
	
	/**
	 * Updates a pet in the store with form data.
	 *
	* @param string $petId ID of pet that needs to be updated (required)
	* @param string $name Updated name of the pet (optional)
	* @param string $status Updated status of the pet (optional)
	*/
	public function updatePetWithForm($petId, $name=null, $status=null) {

		//parse inputs
		$resourcePath = "/pet/{petId}";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "POST";
		$queryParams = array();
		$headerParams = array();

		if($petId != null) {
			$resourcePath = str_replace("{" . "petId" . "}", $this->apiClient->toPathValue($petId), $resourcePath);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		
	}
	
	/**
	 * uploads an image.
	 *
	* @param string $additionalMetadata Additional data to pass to server (optional)
	* @param File $body file to upload (optional)
	*/
	public function uploadFile($additionalMetadata=null, $body=null) {

		//parse inputs
		$resourcePath = "/pet/uploadImage";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "POST";
		$queryParams = array();
		$headerParams = array();

		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		
	}
	
	/**
	 * Add a new pet to the store.
	 *
	* @param Pet $body Pet object that needs to be added to the store (required)
	*/
	public function addPet($body) {

		//parse inputs
		$resourcePath = "/pet";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "POST";
		$queryParams = array();
		$headerParams = array();

		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		
	}
	
	/**
	 * Update an existing pet.
	 *
	* @param Pet $body Pet object that needs to be updated in the store (required)
	*/
	public function updatePet($body) {

		//parse inputs
		$resourcePath = "/pet";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "PUT";
		$queryParams = array();
		$headerParams = array();

		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		
	}
	
	/**
	 * Finds Pets by status.
	 *
	* @param string $status Status values that need to be considered for filter (required)
	* @return Array[Pet]
	*/
	public function findPetsByStatus($status) {

		//parse inputs
		$resourcePath = "/pet/findByStatus";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($status != null) {
			$queryParams['status'] = $this->apiClient->toQueryValue($status);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'Array[Pet]');
		
	}
	
	/**
	 * Finds Pets by tags.
	 *
	* @param string $tags Tags to filter by (required)
	* @return Array[Pet]
	*/
	public function findPetsByTags($tags) {

		//parse inputs
		$resourcePath = "/pet/findByTags";
		$resourcePath = str_replace("{format}", "json", $resourcePath);
		$method = "GET";
		$queryParams = array();
		$headerParams = array();

		if($tags != null) {
			$queryParams['tags'] = $this->apiClient->toQueryValue($tags);
		}
		//make the API Call
		if (!isset($body)) {
			$body = null;
		}
		$response = $this->apiClient->callAPI($resourcePath, $method, $queryParams, $body, $headerParams);
		if(!$response){
			return null;
		}

		return $this->apiClient->deserialize($response, 'Array[Pet]');
		
	}
	
	}

