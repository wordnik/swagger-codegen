/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.6-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['petstore/ApiClient', 'petstore/mdl/ReadOnlyFirst'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ReadOnlyFirst'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.ArrayTest = factory(root.SwaggerPetstore.ApiClient, root.SwaggerPetstore.ReadOnlyFirst);
  }
}(this, function(ApiClient, ReadOnlyFirst) {
  'use strict';

  /**
   * The ArrayTest model module.
   * @module petstore/mdl/ArrayTest
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>ArrayTest</code>.
   * @alias module:petstore/mdl/ArrayTest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>ArrayTest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:petstore/mdl/ArrayTest} obj Optional instance to populate.
   * @return {module:petstore/mdl/ArrayTest} The populated <code>ArrayTest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('array_of_string'))
        obj.arrayOfString = ApiClient.convertToType(data['array_of_string'], ['String']);
      if (data.hasOwnProperty('array_array_of_integer'))
        obj.arrayArrayOfInteger = ApiClient.convertToType(data['array_array_of_integer'], [['Number']]);
      if (data.hasOwnProperty('array_array_of_model'))
        obj.arrayArrayOfModel = ApiClient.convertToType(data['array_array_of_model'], [[ReadOnlyFirst]]);
    }
    return obj;
  }

  /**
   * @member {Array.<String>} arrayOfString
   */
  exports.prototype.arrayOfString = undefined;

  /**
   * @member {Array.<Array.<Number>>} arrayArrayOfInteger
   */
  exports.prototype.arrayArrayOfInteger = undefined;

  /**
   * @member {Array.<Array.<module:petstore/mdl/ReadOnlyFirst>>} arrayArrayOfModel
   */
  exports.prototype.arrayArrayOfModel = undefined;

  return exports;

}));
