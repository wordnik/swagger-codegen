package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PetApi {
  private ApiClient apiClient;

  public PetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }



  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public void addPet(Pet body) throws ApiException {

    addPetWithHttpInfo(body);
  }


  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addPetWithHttpInfo(Pet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addPet");
    }
    
    // create path and map variables
    String localVarPath = "/pet";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  public static class DeletePetOptionals {
    
    public String apiKey() {
      return this.apiKey;
    }

    public DeletePetOptionals apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    private String apiKey = null;
    
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePet(Long petId) throws ApiException {
    deletePet(petId, (String) null);
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @throws ApiException if fails to make API call
   */
  public void deletePetUsingOptionalsObj(Long petId, DeletePetOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new DeletePetOptionals();
    }
    deletePet(petId, optionals.apiKey());
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePet(Long petId, String apiKey) throws ApiException {

    deletePetWithHttpInfo(petId, apiKey);
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePetWithHttpInfo(Long petId) throws ApiException {
    return deletePetWithHttpInfo(petId, (String) null);
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePetUsingOptionalsObjWithHttpInfo(Long petId, DeletePetOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new DeletePetOptionals();
    }
    return deletePetWithHttpInfo(petId, optionals.apiKey());
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePetWithHttpInfo(Long petId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling deletePet");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }


  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Pet> findPetsByStatus(List<String> status) throws ApiException {
    return findPetsByStatusWithHttpInfo(status).getData();
      }


  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Pet>> findPetsByStatusWithHttpInfo(List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling findPetsByStatus");
    }
    
    // create path and map variables
    String localVarPath = "/pet/findByStatus";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "status", status));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<List<Pet>> localVarReturnType = new GenericType<List<Pet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }


  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Pet> findPetsByTags(List<String> tags) throws ApiException {
    return findPetsByTagsWithHttpInfo(tags).getData();
      }


  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<Pet>> findPetsByTagsWithHttpInfo(List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling findPetsByTags");
    }
    
    // create path and map variables
    String localVarPath = "/pet/findByTags";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tags", tags));

    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<List<Pet>> localVarReturnType = new GenericType<List<Pet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }


  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet getPetById(Long petId) throws ApiException {
    return getPetByIdWithHttpInfo(petId).getData();
      }


  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Pet> getPetByIdWithHttpInfo(Long petId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling getPetById");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }


  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePet(Pet body) throws ApiException {

    updatePetWithHttpInfo(body);
  }


  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithHttpInfo(Pet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePet");
    }
    
    // create path and map variables
    String localVarPath = "/pet";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  public static class UpdatePetWithFormOptionals {
    
    public String name() {
      return this.name;
    }

    public UpdatePetWithFormOptionals name(String name) {
      this.name = name;
      return this;
    }

    private String name = null;
    
    public String status() {
      return this.status;
    }

    public UpdatePetWithFormOptionals status(String status) {
      this.status = status;
      return this;
    }

    private String status = null;
    
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePetWithForm(Long petId) throws ApiException {
    updatePetWithForm(petId, (String) null, (String) null);
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @throws ApiException if fails to make API call
   */
  public void updatePetWithFormUsingOptionalsObj(Long petId, UpdatePetWithFormOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new UpdatePetWithFormOptionals();
    }
    updatePetWithForm(petId, optionals.name(), optionals.status());
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @throws ApiException if fails to make API call
   */
  public void updatePetWithForm(Long petId, String name, String status) throws ApiException {

    updatePetWithFormWithHttpInfo(petId, name, status);
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithFormWithHttpInfo(Long petId) throws ApiException {
    return updatePetWithFormWithHttpInfo(petId, (String) null, (String) null);
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithFormUsingOptionalsObjWithHttpInfo(Long petId, UpdatePetWithFormOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new UpdatePetWithFormOptionals();
    }
    return updatePetWithFormWithHttpInfo(petId, optionals.name(), optionals.status());
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling updatePetWithForm");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (name != null)
      localVarFormParams.put("name", name);
if (status != null)
      localVarFormParams.put("status", status);

    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  public static class UploadFileOptionals {
    
    public String additionalMetadata() {
      return this.additionalMetadata;
    }

    public UploadFileOptionals additionalMetadata(String additionalMetadata) {
      this.additionalMetadata = additionalMetadata;
      return this;
    }

    private String additionalMetadata = null;
    
    public File file() {
      return this.file;
    }

    public UploadFileOptionals file(File file) {
      this.file = file;
      return this;
    }

    private File file = null;
    
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFile(Long petId) throws ApiException {
    return uploadFile(petId, (String) null, (File) null);
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFileUsingOptionalsObj(Long petId, UploadFileOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new UploadFileOptionals();
    }
    return uploadFile(petId, optionals.additionalMetadata(), optionals.file());
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   */
  public ModelApiResponse uploadFile(Long petId, String additionalMetadata, File file) throws ApiException {
    return uploadFileWithHttpInfo(petId, additionalMetadata, file).getData();
      }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelApiResponse> uploadFileWithHttpInfo(Long petId) throws ApiException {
    return uploadFileWithHttpInfo(petId, (String) null, (File) null);
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param optionals An object containing the optional parameters for this API call.
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelApiResponse> uploadFileUsingOptionalsObjWithHttpInfo(Long petId, UploadFileOptionals optionals) throws ApiException {
    if (optionals == null) {
      optionals = new UploadFileOptionals();
    }
    return uploadFileWithHttpInfo(petId, optionals.additionalMetadata(), optionals.file());
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelApiResponse> uploadFileWithHttpInfo(Long petId, String additionalMetadata, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}/uploadImage"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (additionalMetadata != null)
      localVarFormParams.put("additionalMetadata", additionalMetadata);
if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<ModelApiResponse> localVarReturnType = new GenericType<ModelApiResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
