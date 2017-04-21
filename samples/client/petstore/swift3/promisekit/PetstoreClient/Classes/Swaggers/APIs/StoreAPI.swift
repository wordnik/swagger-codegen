//
// StoreAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire
import PromiseKit



open class StoreAPI: APIBase {
    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deleteOrder(orderId: String, completion: @escaping ((_ error: ErrorResponse?) -> Void)) {
        deleteOrderWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(error)
        }
    }

    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - returns: Promise<Void>
     */
    open class func deleteOrder( orderId: String) -> Promise<Void> {
        let deferred = Promise<Void>.pending()
        deleteOrder(orderId: orderId) { error in
            if let error = error {
                deferred.reject(error)
            } else {
                deferred.fulfill()
            }
        }
        return deferred.promise
    }

    /**
     Delete purchase order by ID
     - DELETE /store/order/{order_id}
     - For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     
     - parameter orderId: (path) ID of the order that needs to be deleted 

     - returns: RequestBuilder<Void> 
     */
    open class func deleteOrderWithRequestBuilder(orderId: String) -> RequestBuilder<Void> {
        var path = "/store/order/{order_id}"
        path = path.replacingOccurrences(of: "{order_id}", with: "\(orderId)", options: .literal, range: nil)
        let URLString = PetstoreClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Returns pet inventories by status
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getInventory(completion: @escaping ((_ data: [String:Int32]?, _ error: ErrorResponse?) -> Void)) {
        getInventoryWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Returns pet inventories by status
     
     - returns: Promise<[String:Int32]>
     */
    open class func getInventory() -> Promise<[String:Int32]> {
        let deferred = Promise<[String:Int32]>.pending()
        getInventory() { data, error in
            if let error = error {
                deferred.reject(error)
            } else {
                deferred.fulfill(data!)
            }
        }
        return deferred.promise
    }

    /**
     Returns pet inventories by status
     - GET /store/inventory
     - Returns a map of status codes to quantities
     - API Key:
       - type: apiKey api_key 
       - name: api_key
     - examples: [{example={
  "key" : 0
}, contentType=application/json}]

     - returns: RequestBuilder<[String:Int32]> 
     */
    open class func getInventoryWithRequestBuilder() -> RequestBuilder<[String:Int32]> {
        let path = "/store/inventory"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<[String:Int32]>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find purchase order by ID
     
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getOrderById(orderId: Int64, completion: @escaping ((_ data: Order?, _ error: ErrorResponse?) -> Void)) {
        getOrderByIdWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Find purchase order by ID
     
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - returns: Promise<Order>
     */
    open class func getOrderById( orderId: Int64) -> Promise<Order> {
        let deferred = Promise<Order>.pending()
        getOrderById(orderId: orderId) { data, error in
            if let error = error {
                deferred.reject(error)
            } else {
                deferred.fulfill(data!)
            }
        }
        return deferred.promise
    }

    /**
     Find purchase order by ID
     - GET /store/order/{order_id}
     - For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
     - examples: [{example=<Order>
  <id>123456789</id>
  <petId>123456789</petId>
  <quantity>123</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>aeiou</status>
  <complete>true</complete>
</Order>, contentType=application/xml}, {example={
  "id" : 0,
  "petId" : 6,
  "complete" : false,
  "status" : "placed",
  "quantity" : 1,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}]
     - examples: [{example=<Order>
  <id>123456789</id>
  <petId>123456789</petId>
  <quantity>123</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>aeiou</status>
  <complete>true</complete>
</Order>, contentType=application/xml}, {example={
  "id" : 0,
  "petId" : 6,
  "complete" : false,
  "status" : "placed",
  "quantity" : 1,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}]
     
     - parameter orderId: (path) ID of pet that needs to be fetched 

     - returns: RequestBuilder<Order> 
     */
    open class func getOrderByIdWithRequestBuilder(orderId: Int64) -> RequestBuilder<Order> {
        var path = "/store/order/{order_id}"
        path = path.replacingOccurrences(of: "{order_id}", with: "\(orderId)", options: .literal, range: nil)
        let URLString = PetstoreClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func placeOrder(body: Order, completion: @escaping ((_ data: Order?, _ error: ErrorResponse?) -> Void)) {
        placeOrderWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet 
     - returns: Promise<Order>
     */
    open class func placeOrder( body: Order) -> Promise<Order> {
        let deferred = Promise<Order>.pending()
        placeOrder(body: body) { data, error in
            if let error = error {
                deferred.reject(error)
            } else {
                deferred.fulfill(data!)
            }
        }
        return deferred.promise
    }

    /**
     Place an order for a pet
     - POST /store/order
     - 
     - examples: [{example=<Order>
  <id>123456789</id>
  <petId>123456789</petId>
  <quantity>123</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>aeiou</status>
  <complete>true</complete>
</Order>, contentType=application/xml}, {example={
  "id" : 0,
  "petId" : 6,
  "complete" : false,
  "status" : "placed",
  "quantity" : 1,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}]
     - examples: [{example=<Order>
  <id>123456789</id>
  <petId>123456789</petId>
  <quantity>123</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>aeiou</status>
  <complete>true</complete>
</Order>, contentType=application/xml}, {example={
  "id" : 0,
  "petId" : 6,
  "complete" : false,
  "status" : "placed",
  "quantity" : 1,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}]
     
     - parameter body: (body) order placed for purchasing the pet 

     - returns: RequestBuilder<Order> 
     */
    open class func placeOrderWithRequestBuilder(body: Order) -> RequestBuilder<Order> {
        let path = "/store/order"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}
