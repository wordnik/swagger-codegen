/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.0-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

#include "ApiConfiguration.h"

namespace io {
namespace swagger {
namespace client {
namespace api {

ApiConfiguration::ApiConfiguration()
{
}

ApiConfiguration::~ApiConfiguration()
{
}

web::http::client::http_client_config& ApiConfiguration::getHttpConfig()
{
    return m_HttpConfig;
}

void ApiConfiguration::setHttpConfig( web::http::client::http_client_config& value )
{
    m_HttpConfig = value;
}

utility::string_t ApiConfiguration::getBaseUrl() const
{
    return m_BaseUrl;
}

void ApiConfiguration::setBaseUrl( const utility::string_t value )
{
    m_BaseUrl = value;
}

utility::string_t ApiConfiguration::getUserAgent() const
{
    return m_UserAgent;
}

void ApiConfiguration::setUserAgent( const utility::string_t value )
{
    m_UserAgent = value;
}

std::map<utility::string_t, utility::string_t>& ApiConfiguration::getDefaultHeaders()
{
    return m_DefaultHeaders;
}

utility::string_t ApiConfiguration::getApiKey( const utility::string_t& prefix) const
{
    auto result = m_ApiKeys.find(prefix);
    if( result != m_ApiKeys.end() )
    {
        return result->second;
    }
    return utility::conversions::to_string_t("");
}

void ApiConfiguration::setApiKey( const utility::string_t& prefix, const utility::string_t& apiKey )
{
    m_ApiKeys[prefix] = apiKey;
}

}
}
}
}
