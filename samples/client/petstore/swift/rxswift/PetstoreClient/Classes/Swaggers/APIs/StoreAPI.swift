//
// StoreAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire
import RxSwift



public class StoreAPI: APIBase {
    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteOrder(orderId orderId: String, completion: ((error: ErrorType?) -> Void)) {
        deleteOrderWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(error: error);
        }
    }

    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - returns: Observable<Void>
     */
    public class func deleteOrder(orderId orderId: String) -> Observable<Void> {
        return Observable.create { observer -> Disposable in
            deleteOrder(orderId: orderId) { error in
                if let error = error {
                    observer.on(.Error(error as ErrorType))
                } else {
                    observer.on(.Next())
                }
                observer.on(.Completed)
            }
            return NopDisposable.instance
        }
    }

    /**
     Delete purchase order by ID
     - DELETE /store/order/{orderId}
     - For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     
     - parameter orderId: (path) ID of the order that needs to be deleted 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteOrderWithRequestBuilder(orderId orderId: String) -> RequestBuilder<Void> {
        var path = "/store/order/{orderId}"
        path = path.stringByReplacingOccurrencesOfString("{orderId}", withString: "\(orderId)", options: .LiteralSearch, range: nil)
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Returns pet inventories by status
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getInventory(completion: ((data: [String:Int32]?, error: ErrorType?) -> Void)) {
        getInventoryWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }

    /**
     Returns pet inventories by status
     
     - returns: Observable<[String:Int32]>
     */
    public class func getInventory() -> Observable<[String:Int32]> {
        return Observable.create { observer -> Disposable in
            getInventory() { data, error in
                if let error = error {
                    observer.on(.Error(error as ErrorType))
                } else {
                    observer.on(.Next(data!))
                }
                observer.on(.Completed)
            }
            return NopDisposable.instance
        }
    }

    /**
     Returns pet inventories by status
     - GET /store/inventory
     - Returns a map of status codes to quantities
     - API Key:
       - type: apiKey api_key 
       - name: api_key
     - examples: [{example={
  "key" : 123
}, contentType=application/json}, {example=not implemented io.swagger.models.properties.MapProperty@d1e580af, contentType=application/xml}]
     - examples: [{example={
  "key" : 123
}, contentType=application/json}, {example=not implemented io.swagger.models.properties.MapProperty@d1e580af, contentType=application/xml}]

     - returns: RequestBuilder<[String:Int32]> 
     */
    public class func getInventoryWithRequestBuilder() -> RequestBuilder<[String:Int32]> {
        let path = "/store/inventory"
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
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
    public class func getOrderById(orderId orderId: String, completion: ((data: Order?, error: ErrorType?) -> Void)) {
        getOrderByIdWithRequestBuilder(orderId: orderId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }

    /**
     Find purchase order by ID
     
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - returns: Observable<Order>
     */
    public class func getOrderById(orderId orderId: String) -> Observable<Order> {
        return Observable.create { observer -> Disposable in
            getOrderById(orderId: orderId) { data, error in
                if let error = error {
                    observer.on(.Error(error as ErrorType))
                } else {
                    observer.on(.Next(data!))
                }
                observer.on(.Completed)
            }
            return NopDisposable.instance
        }
    }

    /**
     Find purchase order by ID
     - GET /store/order/{orderId}
     - For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
     - examples: [{example={
  "id" : 123456789,
  "petId" : 123456789,
  "complete" : true,
  "status" : "aeiou",
  "quantity" : 123,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}, {example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>, contentType=application/xml}]
     - examples: [{example={
  "id" : 123456789,
  "petId" : 123456789,
  "complete" : true,
  "status" : "aeiou",
  "quantity" : 123,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}, {example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>, contentType=application/xml}]
     
     - parameter orderId: (path) ID of pet that needs to be fetched 

     - returns: RequestBuilder<Order> 
     */
    public class func getOrderByIdWithRequestBuilder(orderId orderId: String) -> RequestBuilder<Order> {
        var path = "/store/order/{orderId}"
        path = path.stringByReplacingOccurrencesOfString("{orderId}", withString: "\(orderId)", options: .LiteralSearch, range: nil)
        let URLString = PetstoreClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func placeOrder(body body: Order? = nil, completion: ((data: Order?, error: ErrorType?) -> Void)) {
        placeOrderWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet (optional)
     - returns: Observable<Order>
     */
    public class func placeOrder(body body: Order? = nil) -> Observable<Order> {
        return Observable.create { observer -> Disposable in
            placeOrder(body: body) { data, error in
                if let error = error {
                    observer.on(.Error(error as ErrorType))
                } else {
                    observer.on(.Next(data!))
                }
                observer.on(.Completed)
            }
            return NopDisposable.instance
        }
    }

    /**
     Place an order for a pet
     - POST /store/order
     - 
     - examples: [{example={
  "id" : 123456789,
  "petId" : 123456789,
  "complete" : true,
  "status" : "aeiou",
  "quantity" : 123,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}, {example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>, contentType=application/xml}]
     - examples: [{example={
  "id" : 123456789,
  "petId" : 123456789,
  "complete" : true,
  "status" : "aeiou",
  "quantity" : 123,
  "shipDate" : "2000-01-23T04:56:07.000+00:00"
}, contentType=application/json}, {example=<Order>
  <id>123456</id>
  <petId>123456</petId>
  <quantity>0</quantity>
  <shipDate>2000-01-23T04:56:07.000Z</shipDate>
  <status>string</status>
  <complete>true</complete>
</Order>, contentType=application/xml}]
     
     - parameter body: (body) order placed for purchasing the pet (optional)

     - returns: RequestBuilder<Order> 
     */
    public class func placeOrderWithRequestBuilder(body body: Order? = nil) -> RequestBuilder<Order> {
        let path = "/store/order"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = body?.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
