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

#ifndef ModelFactory_H_
#define ModelFactory_H_


#include "SWGApiResponse.h"
#include "SWGCategory.h"
#include "SWGOrder.h"
#include "SWGPet.h"
#include "SWGTag.h"
#include "SWGUser.h"

namespace Swagger {

  inline void* create(QString type) {
    if(QString("SWGApiResponse").compare(type) == 0) {
      return new SWGApiResponse();
    }
    if(QString("SWGCategory").compare(type) == 0) {
      return new SWGCategory();
    }
    if(QString("SWGOrder").compare(type) == 0) {
      return new SWGOrder();
    }
    if(QString("SWGPet").compare(type) == 0) {
      return new SWGPet();
    }
    if(QString("SWGTag").compare(type) == 0) {
      return new SWGTag();
    }
    if(QString("SWGUser").compare(type) == 0) {
      return new SWGUser();
    }
    
    return nullptr;
  }

  inline void* create(QString json, QString type) {
    if(type.startsWith("QString")) {
      return new QString();
    }    
    auto val = static_cast<SWGObject*>(create(type));
    if(val != nullptr) {
      return val->fromJson(json);
    }
    return nullptr;
  }

}

#endif /* ModelFactory_H_ */
