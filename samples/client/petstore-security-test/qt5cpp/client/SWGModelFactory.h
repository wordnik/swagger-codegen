/**
 * Swagger Petstore *_/ ' \" =end -- \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
 * Contact: apiteam@swagger.io *_/ ' \" =end -- \\r\\n \\n \\r
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SWGObject.h"

#include "SWGReturn.h"

namespace Swagger {

  inline void* create(QString type) {
    if(QString("SWGReturn").compare(type) == 0) {
      return new SWGReturn();
    }
    
    return nullptr;
  }

  
  inline void create(QString json, QString type, SWGReturn** ptr ) { 
    auto val = static_cast<SWGObject*>(create(type));
    if(val != nullptr) {
      *ptr = static_cast<SWGReturn*>(val->fromJson(json));
    }
  }
  

  inline void create(QString json, QString type, QString* str){
        if(type.startsWith("QString")) {
      *str = QString();
    }   
  }


}

#endif /* ModelFactory_H_ */
