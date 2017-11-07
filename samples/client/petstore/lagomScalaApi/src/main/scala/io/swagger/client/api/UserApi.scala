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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.User

trait UserApi extends Service {


  final override def descriptor = {
    import Service._
    named("UserApi").withCalls(
      restCall(Method.POST, "/user", createUser _), 
      restCall(Method.POST, "/user/createWithArray", createUsersWithArrayInput _), 
      restCall(Method.POST, "/user/createWithList", createUsersWithListInput _), 
      restCall(Method.DELETE, "/user/:username", deleteUser _), 
      restCall(Method.GET, "/user/:username", getUserByName _), 
      restCall(Method.GET, "/user/login?username&password", loginUser _), 
      restCall(Method.GET, "/user/logout", logoutUser _), 
      restCall(Method.PUT, "/user/:username", updateUser _)
    ).withAutoAcl(true)
  }



  /**
    * Create user
    * This can only be done by the logged in user.
         
    * @return void
         Body Parameter  Created user object 
    */
  def createUser(        ): ServiceCall[User ,Done]


  /**
    * Creates list of users with given input array
    * 
         
    * @return void
         Body Parameter  List of user object 
    */
  def createUsersWithArrayInput(        ): ServiceCall[Seq[User] ,Done]


  /**
    * Creates list of users with given input array
    * 
         
    * @return void
         Body Parameter  List of user object 
    */
  def createUsersWithListInput(        ): ServiceCall[Seq[User] ,Done]


  /**
    * Delete user
    * This can only be done by the logged in user.
         
    * @param username The name that needs to be deleted   
    * @return void
        
    */
  def deleteUser(        username: String
        ): ServiceCall[NotUsed ,Done]


  /**
    * Get user by user name
    * 
         
    * @param username The name that needs to be fetched. Use user1 for testing.    
    * @return User
        
    */
  def getUserByName(        username: String
        ): ServiceCall[NotUsed ,User]



  /**
    * Logs user into the system
    * 
         
    * @param username The user name for login   
 
    * @param password The password for login in clear text   
    * @return String
        
    */
  def loginUser(
            username:String
            ,
        

            password:String
            
        
        ): ServiceCall[NotUsed ,String]


  /**
    * Logs out current logged in user session
    * 
            * @return void
        
    */
  def logoutUser(        ): ServiceCall[NotUsed ,Done]


  /**
    * Updated user
    * This can only be done by the logged in user.
         
    * @param username name that need to be updated   
 
    * @return void
         Body Parameter  Updated user object 
    */
  def updateUser(        username: String
        ): ServiceCall[User ,Done]

}

