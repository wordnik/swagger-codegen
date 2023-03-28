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
 * Swagger Codegen version: 2.4.27-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.Capitalization = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Capitalization model module.
   * @module model/Capitalization
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Capitalization</code>.
   * @alias module:model/Capitalization
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>Capitalization</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Capitalization} obj Optional instance to populate.
   * @return {module:model/Capitalization} The populated <code>Capitalization</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('smallCamel'))
        obj.smallCamel = ApiClient.convertToType(data['smallCamel'], 'String');
      if (data.hasOwnProperty('CapitalCamel'))
        obj.capitalCamel = ApiClient.convertToType(data['CapitalCamel'], 'String');
      if (data.hasOwnProperty('small_Snake'))
        obj.smallSnake = ApiClient.convertToType(data['small_Snake'], 'String');
      if (data.hasOwnProperty('Capital_Snake'))
        obj.capitalSnake = ApiClient.convertToType(data['Capital_Snake'], 'String');
      if (data.hasOwnProperty('SCA_ETH_Flow_Points'))
        obj.sCAETHFlowPoints = ApiClient.convertToType(data['SCA_ETH_Flow_Points'], 'String');
      if (data.hasOwnProperty('ATT_NAME'))
        obj.ATT_NAME = ApiClient.convertToType(data['ATT_NAME'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} smallCamel
   */
  exports.prototype.smallCamel = undefined;

  /**
   * @member {String} capitalCamel
   */
  exports.prototype.capitalCamel = undefined;

  /**
   * @member {String} smallSnake
   */
  exports.prototype.smallSnake = undefined;

  /**
   * @member {String} capitalSnake
   */
  exports.prototype.capitalSnake = undefined;

  /**
   * @member {String} sCAETHFlowPoints
   */
  exports.prototype.sCAETHFlowPoints = undefined;

  /**
   * Name of the pet 
   * @member {String} ATT_NAME
   */
  exports.prototype.ATT_NAME = undefined;


  return exports;

}));
