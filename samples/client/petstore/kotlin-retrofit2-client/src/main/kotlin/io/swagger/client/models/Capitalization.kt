/**
* Swagger Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import com.google.gson.TypeAdapter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

/**
 * 
 * @param smallCamel 
 * @param CapitalCamel 
 * @param small_Snake 
 * @param Capital_Snake 
 * @param SCA_ETH_Flow_Points 
 * @param ATT_NAME Name of the pet 
*/
data class Capitalization (
    val smallCamel: kotlin.String? = null,
    val CapitalCamel: kotlin.String? = null,
    val small_Snake: kotlin.String? = null,
    val Capital_Snake: kotlin.String? = null,
    val SCA_ETH_Flow_Points: kotlin.String? = null,
    /* Name of the pet  */
    val ATT_NAME: kotlin.String? = null
) 
