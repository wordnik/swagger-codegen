<?php
/**
 * StoreApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\Configuration;
use \Swagger\Client\ObjectSerializer;

/**
 * StoreApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class StoreApi
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
        if ($apiClient === null) {
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
     * @return StoreApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation deleteOrder
     *
     * Delete purchase order by ID
     *
     * @param string $order_id ID of the order that needs to be deleted (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function deleteOrder($order_id)
    {
        list($response) = $this->deleteOrderWithHttpInfo($order_id);
        return $response;
    }

    /**
     * Operation deleteOrderWithHttpInfo
     *
     * Delete purchase order by ID
     *
     * @param string $order_id ID of the order that needs to be deleted (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteOrderWithHttpInfo($order_id)
    {
        // verify the required parameter 'order_id' is set
        if ($order_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $order_id when calling deleteOrder');
        }
        if (($order_id < 1.0)) {
            throw new \InvalidArgumentException('invalid value for "$order_id" when calling StoreApi.deleteOrder, must be bigger than or equal to 1.0.');
        }

        // parse inputs
        $resourcePath = "/store/order/{orderId}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/xml', 'application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType([]);

        // path params
        if ($order_id !== null) {
            $resourcePath = str_replace(
                "{" . "orderId" . "}",
                $this->apiClient->getSerializer()->toPathValue($order_id),
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
                $headerParams,
                null,
                '/store/order/{orderId}'
            );

            return [null, $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
    }

    /**
     * Operation getInventory
     *
     * Returns pet inventories by status
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return map[string,int]
     */
    public function getInventory()
    {
        list($response) = $this->getInventoryWithHttpInfo();
        return $response;
    }

    /**
     * Operation getInventoryWithHttpInfo
     *
     * Returns pet inventories by status
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of map[string,int], HTTP status code, HTTP response headers (array of strings)
     */
    public function getInventoryWithHttpInfo()
    {
        // parse inputs
        $resourcePath = "/store/inventory";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType([]);

        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // this endpoint requires API key authentication
        $apiKey = $this->apiClient->getApiKeyWithPrefix('api_key');
        if (strlen($apiKey) !== 0) {
            $headerParams['api_key'] = $apiKey;
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                'map[string,int]',
                '/store/inventory'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, 'map[string,int]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), 'map[string,int]', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation getOrderById
     *
     * Find purchase order by ID
     *
     * @param int $order_id ID of pet that needs to be fetched (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\Order
     */
    public function getOrderById($order_id)
    {
        list($response) = $this->getOrderByIdWithHttpInfo($order_id);
        return $response;
    }

    /**
     * Operation getOrderByIdWithHttpInfo
     *
     * Find purchase order by ID
     *
     * @param int $order_id ID of pet that needs to be fetched (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\Order, HTTP status code, HTTP response headers (array of strings)
     */
    public function getOrderByIdWithHttpInfo($order_id)
    {
        // verify the required parameter 'order_id' is set
        if ($order_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $order_id when calling getOrderById');
        }
        if (($order_id > 5)) {
            throw new \InvalidArgumentException('invalid value for "$order_id" when calling StoreApi.getOrderById, must be smaller than or equal to 5.');
        }
        if (($order_id < 1)) {
            throw new \InvalidArgumentException('invalid value for "$order_id" when calling StoreApi.getOrderById, must be bigger than or equal to 1.');
        }

        // parse inputs
        $resourcePath = "/store/order/{orderId}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/xml', 'application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType([]);

        // path params
        if ($order_id !== null) {
            $resourcePath = str_replace(
                "{" . "orderId" . "}",
                $this->apiClient->getSerializer()->toPathValue($order_id),
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
                '\Swagger\Client\Model\Order',
                '/store/order/{orderId}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\Order', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Order', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation placeOrder
     *
     * Place an order for a pet
     *
     * @param \Swagger\Client\Model\Order $body order placed for purchasing the pet (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\Order
     */
    public function placeOrder($body)
    {
        list($response) = $this->placeOrderWithHttpInfo($body);
        return $response;
    }

    /**
     * Operation placeOrderWithHttpInfo
     *
     * Place an order for a pet
     *
     * @param \Swagger\Client\Model\Order $body order placed for purchasing the pet (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\Order, HTTP status code, HTTP response headers (array of strings)
     */
    public function placeOrderWithHttpInfo($body)
    {
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling placeOrder');
        }
        // parse inputs
        $resourcePath = "/store/order";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/xml', 'application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType([]);

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
                $headerParams,
                '\Swagger\Client\Model\Order',
                '/store/order'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\Order', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Order', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
}
