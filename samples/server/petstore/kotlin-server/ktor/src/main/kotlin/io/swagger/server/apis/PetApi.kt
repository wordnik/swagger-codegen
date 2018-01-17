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
package io.swagger.server.apis

import io.ktor.application.call
import io.ktor.auth.authentication
import io.ktor.http.HttpStatusCode
import io.ktor.locations.location
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.delete as DELETE
import io.ktor.routing.get as GET
import io.ktor.routing.head as HEAD
import io.ktor.routing.options as OPTIONS
import io.ktor.routing.patch as PATCH
import io.ktor.routing.post as POST
import io.ktor.routing.put as PUT

import io.swagger.server.Paths

import io.swagger.server.models.ApiResponse
import io.swagger.server.models.Pet

fun Route.PetApi() {
    location<Paths.addPet> {
        POST {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.deletePet> {
        DELETE {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.findPetsByStatus> {
        GET {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.findPetsByTags> {
        GET {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.getPetById> {
        GET {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.updatePet> {
        PUT {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.updatePetWithForm> {
        POST {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    location<Paths.uploadFile> {
        POST {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
}
