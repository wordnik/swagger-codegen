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
 * @param integer 
 * @param int32 
 * @param int64 
 * @param number 
 * @param float 
 * @param double 
 * @param string 
 * @param byte 
 * @param binary 
 * @param date 
 * @param dateTime 
 * @param uuid 
 * @param password 
*/
data class FormatTest (
    val number: java.math.BigDecimal,
    val byte: kotlin.ByteArray,
    val date: java.time.OffsetDateTime,
    val password: kotlin.String,
    val integer: kotlin.Int? = null,
    val int32: kotlin.Int? = null,
    val int64: kotlin.Long? = null,
    val float: kotlin.Float? = null,
    val double: kotlin.Double? = null,
    val string: kotlin.String? = null,
    val binary: kotlin.Array<kotlin.Byte>? = null,
    val dateTime: java.time.OffsetDateTime? = null,
    val uuid: java.util.UUID? = null
) 
