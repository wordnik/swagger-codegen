/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\ - - - -
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// some number
    /// </summary>
    /// <value>some number</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum Numbers
    {
        
        /// <summary>
        /// Enum _7 for value: 7
        /// </summary>
        [EnumMember(Value = "7")]
        _7 = 1,
        
        /// <summary>
        /// Enum _8 for value: 8
        /// </summary>
        [EnumMember(Value = "8")]
        _8 = 2,
        
        /// <summary>
        /// Enum _9 for value: 9
        /// </summary>
        [EnumMember(Value = "9")]
        _9 = 3,
        
        /// <summary>
        /// Enum _10 for value: 10
        /// </summary>
        [EnumMember(Value = "10")]
        _10 = 4
    }

}
