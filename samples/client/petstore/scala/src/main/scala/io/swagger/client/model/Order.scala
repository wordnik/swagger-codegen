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

package io.swagger.client.model

import org.joda.time.DateTime

case class Order (
  id: Option[Long],
  petId: Option[Long],
  quantity: Option[Integer],
  shipDate: Option[DateTime],
  /* Order Status */
  status: Option[OrderEnums.StatusEnum],
  complete: Option[Boolean]
)

object OrderEnums {

  type StatusEnum = StatusEnum.Value
  object StatusEnum extends Enumeration {
    val  = Value("placed")
    val  = Value("approved")
    val  = Value("delivered")
  }

}
