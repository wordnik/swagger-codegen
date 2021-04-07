/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models


/**
 * A User who is purchasing from the pet store
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
*/
data class User (
    val id: kotlin.Long? = null,
    val username: kotlin.String? = null,
    val firstName: kotlin.String? = null,
    val lastName: kotlin.String? = null,
    val email: kotlin.String? = null,
    val password: kotlin.String? = null,
    val phone: kotlin.String? = null,
    /* User Status */
    val userStatus: kotlin.Int? = null
) {

}

