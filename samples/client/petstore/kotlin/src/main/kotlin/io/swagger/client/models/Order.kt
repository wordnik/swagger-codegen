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


import com.squareup.moshi.Json
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
@Parcelize
data class Order (
    val id: kotlin.Long? = null,
    val petId: kotlin.Long? = null,
    val quantity: kotlin.Int? = null,
    val shipDate: java.time.LocalDateTime? = null,
    /* Order Status */
    val status: Order.Status? = null,
    val complete: kotlin.Boolean? = null
) : Parcelable {

    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    enum class Status(val value: kotlin.String){
    
        @Json(name = "placed") placed("placed"),
    
        @Json(name = "approved") approved("approved"),
    
        @Json(name = "delivered") delivered("delivered");
    
    }

}

