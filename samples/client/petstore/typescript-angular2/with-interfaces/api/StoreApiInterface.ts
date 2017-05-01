/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { Headers }                                           from '@angular/http';

import { Observable }                                        from 'rxjs/Observable';

import * as models                                           from '../model/models';
import { Configuration }                                     from '../configuration';


export interface IStoreApi {
    defaultHeaders: Headers;
    configuration: Configuration;
    [others: string]: any;

    /**
    * Delete purchase order by ID
    * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    * @param orderId ID of the order that needs to be deleted
    */
    deleteOrder(orderId: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    */
    getInventory(extraHttpRequestParams?: any): Observable<{ [key: string]: number; }>;

    /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
    * @param orderId ID of pet that needs to be fetched
    */
    getOrderById(orderId: string, extraHttpRequestParams?: any): Observable<models.Order>;

    /**
    * Place an order for a pet
    * 
    * @param body order placed for purchasing the pet
    */
    placeOrder(body?: models.Order, extraHttpRequestParams?: any): Observable<models.Order>;

}
