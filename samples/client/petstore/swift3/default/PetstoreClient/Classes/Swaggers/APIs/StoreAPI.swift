//
// StoreAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class StoreAPI: APIBase {
    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deleteOrder(orderId: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        deleteOrderWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(error);
        }
    }


    /**
     Delete purchase order by ID
     - DELETE /store/order/{orderId}
     - For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     
     - parameter orderId: (path) ID of the order that needs to be deleted 

     - returns: RequestBuilder<Void> 
     */
    open class func deleteOrderWithRequestBuilder(orderId: String) -> RequestBuilder<Void> {
        var path = "/store/order/{orderId}"
        path = path.replacingOccurrences(of: "{orderId}", with: "\(orderId)", options: .literal, range: nil)
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Returns pet inventories by status
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getInventory(completion: @escaping ((_ data: [String:Int32]?,_ error: ErrorResponse?) -> Void)) {
        getInventoryWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Returns pet inventories by status
     - GET /store/inventory
     - Returns a map of status codes to quantities
     - API Key:
       - type: apiKey api_key 
       - name: api_key
     - examples: [{contentType=application/json, example={
  "key" : 123
}}]

     - returns: RequestBuilder<[String:Int32]> 
     */
    open class func getInventoryWithRequestBuilder() -> RequestBuilder<[String:Int32]> {
        let path = "/store/inventory"
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[String:Int32]>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Find purchase order by ID
     
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getOrderById(orderId: Int64, completion: @escaping ((_ data: Order?,_ error: ErrorResponse?) -> Void)) {
        getOrderByIdWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Find purchase order by ID
     - GET /store/order/{orderId}
     - For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
     - examples: [{contentType=application/xml, example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>}, {contentType=application/json, example={
  "petId" : 123456789,
  "quantity" : 123,
  "id" : 123456789,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : true,
  "status" : "aeiou"
}}]
     - examples: [{contentType=application/xml, example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>}, {contentType=application/json, example={
  "petId" : 123456789,
  "quantity" : 123,
  "id" : 123456789,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : true,
  "status" : "aeiou"
}}]
     
     - parameter orderId: (path) ID of pet that needs to be fetched 

     - returns: RequestBuilder<Order> 
     */
    open class func getOrderByIdWithRequestBuilder(orderId: Int64) -> RequestBuilder<Order> {
        var path = "/store/order/{orderId}"
        path = path.replacingOccurrences(of: "{orderId}", with: "\(orderId)", options: .literal, range: nil)
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func placeOrder(body: Order, completion: @escaping ((_ data: Order?,_ error: ErrorResponse?) -> Void)) {
        placeOrderWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Place an order for a pet
     - POST /store/order
     - 
     - examples: [{contentType=application/xml, example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>}, {contentType=application/json, example={
  "petId" : 123456789,
  "quantity" : 123,
  "id" : 123456789,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : true,
  "status" : "aeiou"
}}]
     - examples: [{contentType=application/xml, example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>}, {contentType=application/json, example={
  "petId" : 123456789,
  "quantity" : 123,
  "id" : 123456789,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : true,
  "status" : "aeiou"
}}]
     
     - parameter body: (body) order placed for purchasing the pet 

     - returns: RequestBuilder<Order> 
     */
    open class func placeOrderWithRequestBuilder(body: Order) -> RequestBuilder<Order> {
        let path = "/store/order"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
