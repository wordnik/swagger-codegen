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
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wordnik.client.api

import com.wordnik.client.model.ApiResponse
import java.io.File
import com.wordnik.client.model.Pet

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class PetApi (implicit val swagger: Swagger) extends ScalatraServlet
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "PetApi"
  override protected val applicationName: Option[String] = Some("/v2/Pet")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val addPetOperation = (apiOperation[Unit]("addPet")
      summary "Add a new pet to the store"
      parameters(bodyParam[Pet]("body").description(""))
  )

  post("/pet",operation(addPetOperation)) {
    
    
          val body = parsedBody.extract[Pet]

    println("body: " + body)
  }

  

  val deletePetOperation = (apiOperation[Unit]("deletePet")
      summary "Deletes a pet"
      parameters(pathParam[Long]("petId").description(""), headerParam[String]("apiKey").description("").optional)
  )

  delete("/pet/:petId",operation(deletePetOperation)) {
    
    
      val petId = params.getOrElse("petId", halt(400))
    
    println("petId: " + petId)
    
    
          val apiKey = request.getHeader("apiKey")

    println("apiKey: " + apiKey)
  }

  

  val findPetsByStatusOperation = (apiOperation[List[Pet]]("findPetsByStatus")
      summary "Finds Pets by status"
      parameters(queryParam[List[String]]("status").description(""))
  )

  get("/pet/findByStatus",operation(findPetsByStatusOperation)) {
    
    
          val statusString = params.getAs[String]("status")
      val status = if("csv".equals("default")) {
        statusString match {
          case Some(str) => str.split(",")
          case None => List()
        }
      }
      else
        List()
      

    println("status: " + status)
  }

  

  val findPetsByTagsOperation = (apiOperation[List[Pet]]("findPetsByTags")
      summary "Finds Pets by tags"
      parameters(queryParam[List[String]]("tags").description(""))
  )

  get("/pet/findByTags",operation(findPetsByTagsOperation)) {
    
    
          val tagsString = params.getAs[String]("tags")
      val tags = if("csv".equals("default")) {
        tagsString match {
          case Some(str) => str.split(",")
          case None => List()
        }
      }
      else
        List()
      

    println("tags: " + tags)
  }

  

  val getPetByIdOperation = (apiOperation[Pet]("getPetById")
      summary "Find pet by ID"
      parameters(pathParam[Long]("petId").description(""))
  )

  get("/pet/:petId",operation(getPetByIdOperation)) {
    
    
      val petId = params.getOrElse("petId", halt(400))
    
    println("petId: " + petId)
  }

  

  val updatePetOperation = (apiOperation[Unit]("updatePet")
      summary "Update an existing pet"
      parameters(bodyParam[Pet]("body").description(""))
  )

  put("/pet",operation(updatePetOperation)) {
    
    
          val body = parsedBody.extract[Pet]

    println("body: " + body)
  }

  

  val updatePetWithFormOperation = (apiOperation[Unit]("updatePetWithForm")
      summary "Updates a pet in the store with form data"
      parameters(pathParam[Long]("petId").description(""), formParam[String]("name").description("").optional, formParam[String]("status").description("").optional)
  )

  post("/pet/:petId",operation(updatePetWithFormOperation)) {
    
    
      val petId = params.getOrElse("petId", halt(400))
    
    println("petId: " + petId)
    
    
          val name = params.getAs[String]("name")

    println("name: " + name)
    
    
          val status = params.getAs[String]("status")

    println("status: " + status)
  }

  

  val uploadFileOperation = (apiOperation[ApiResponse]("uploadFile")
      summary "uploads an image"
      parameters(pathParam[Long]("petId").description(""), formParam[String]("additionalMetadata").description("").optional, formParam[File]("file").description("").optional)
  )

  post("/pet/:petId/uploadImage",operation(uploadFileOperation)) {
    
    
      val petId = params.getOrElse("petId", halt(400))
    
    println("petId: " + petId)
    
    
          val additionalMetadata = params.getAs[String]("additionalMetadata")

    println("additionalMetadata: " + additionalMetadata)
    val file = fileParams("file")
        println("file: " + file)
  }

}
