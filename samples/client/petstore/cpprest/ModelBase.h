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

/*
 * ModelBase.h
 * 
 * This is the base class for all model classes
 */

#ifndef ModelBase_H_
#define ModelBase_H_


#include "HttpContent.h"
#include "MultipartFormData.h"

#include <cpprest/details/basic_types.h>
#include <cpprest/json.h> 

namespace io {
namespace swagger {
namespace client {
namespace model {

class  ModelBase
{
public:
    ModelBase();
    virtual ~ModelBase();

    virtual void validate() = 0;

    virtual web::json::value toJson() const = 0;
    virtual void fromJson(web::json::value& json) = 0;

    virtual void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const = 0;
    virtual void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) = 0;

    static web::json::value toJson( const utility::string_t& value );
    static web::json::value toJson( const utility::datetime& value );
    static web::json::value toJson( std::shared_ptr<HttpContent> value );
    static web::json::value toJson( std::shared_ptr<ModelBase> value );
    static web::json::value toJson( int32_t value );
    static web::json::value toJson( int64_t value );
    static web::json::value toJson( double value );
    
    static int64_t int64_tFromJson(web::json::value& val);
    static int32_t int32_tFromJson(web::json::value& val);
    static utility::string_t stringFromJson(web::json::value& val);
    static utility::datetime dateFromJson(web::json::value& val);
    static double doubleFromJson(web::json::value& val);
    static bool boolFromJson(web::json::value& val);
    static std::shared_ptr<HttpContent> fileFromJson(web::json::value& val);
        
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType = U(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType = U(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, std::shared_ptr<HttpContent> value );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType = U("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType = U("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType = U("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType = U("") );
    
    static int64_t int64_tFromHttpContent(std::shared_ptr<HttpContent> val);
    static int32_t int32_tFromHttpContent(std::shared_ptr<HttpContent> val);
    static utility::string_t stringFromHttpContent(std::shared_ptr<HttpContent> val);
    static utility::datetime dateFromHttpContent(std::shared_ptr<HttpContent> val);
    static bool boolFromHttpContent(std::shared_ptr<HttpContent> val);
    static double doubleFromHttpContent(std::shared_ptr<HttpContent> val);
    

    static utility::string_t toBase64( utility::string_t value );
    static utility::string_t toBase64( std::shared_ptr<std::istream> value );
    static std::shared_ptr<std::istream> fromBase64( const utility::string_t& encoded );
};

}
}
}
}

#endif /* ModelBase_H_ */
