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
    root.SwaggerPetstore.FormatTest = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The FormatTest model module.
   * @module model/FormatTest
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>FormatTest</code>.
   * @alias module:model/FormatTest
   * @class
   * @param _number {Number} 
   * @param _byte {Blob} 
   * @param _date {Date} 
   * @param password {String} 
   */
  var exports = function(_number, _byte, _date, password) {
    this._number = _number;
    this._byte = _byte;
    this._date = _date;
    this.password = password;
  };

  /**
   * Constructs a <code>FormatTest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FormatTest} obj Optional instance to populate.
   * @return {module:model/FormatTest} The populated <code>FormatTest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('integer'))
        obj.integer = ApiClient.convertToType(data['integer'], 'Number');
      if (data.hasOwnProperty('int32'))
        obj.int32 = ApiClient.convertToType(data['int32'], 'Number');
      if (data.hasOwnProperty('int64'))
        obj.int64 = ApiClient.convertToType(data['int64'], 'Number');
      if (data.hasOwnProperty('number'))
        obj._number = ApiClient.convertToType(data['number'], 'Number');
      if (data.hasOwnProperty('float'))
        obj._float = ApiClient.convertToType(data['float'], 'Number');
      if (data.hasOwnProperty('double'))
        obj._double = ApiClient.convertToType(data['double'], 'Number');
      if (data.hasOwnProperty('string'))
        obj._string = ApiClient.convertToType(data['string'], 'String');
      if (data.hasOwnProperty('byte'))
        obj._byte = ApiClient.convertToType(data['byte'], 'Blob');
      if (data.hasOwnProperty('binary'))
        obj.binary = ApiClient.convertToType(data['binary'], 'Blob');
      if (data.hasOwnProperty('date'))
        obj._date = ApiClient.convertToType(data['date'], 'Date');
      if (data.hasOwnProperty('dateTime'))
        obj.dateTime = ApiClient.convertToType(data['dateTime'], 'Date');
      if (data.hasOwnProperty('uuid'))
        obj.uuid = ApiClient.convertToType(data['uuid'], 'String');
      if (data.hasOwnProperty('password'))
        obj.password = ApiClient.convertToType(data['password'], 'String');
    }
    return obj;
  }

  /**
   * @member {Number} integer
   */
  exports.prototype.integer = undefined;

  /**
   * @member {Number} int32
   */
  exports.prototype.int32 = undefined;

  /**
   * @member {Number} int64
   */
  exports.prototype.int64 = undefined;

  /**
   * @member {Number} _number
   */
  exports.prototype._number = undefined;

  /**
   * @member {Number} _float
   */
  exports.prototype._float = undefined;

  /**
   * @member {Number} _double
   */
  exports.prototype._double = undefined;

  /**
   * @member {String} _string
   */
  exports.prototype._string = undefined;

  /**
   * @member {Blob} _byte
   */
  exports.prototype._byte = undefined;

  /**
   * @member {Blob} binary
   */
  exports.prototype.binary = undefined;

  /**
   * @member {Date} _date
   */
  exports.prototype._date = undefined;

  /**
   * @member {Date} dateTime
   */
  exports.prototype.dateTime = undefined;

  /**
   * @member {String} uuid
   */
  exports.prototype.uuid = undefined;

  /**
   * @member {String} password
   */
  exports.prototype.password = undefined;


  return exports;

}));
