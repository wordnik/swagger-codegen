/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

import expect, { createSpy, spyOn, isSpy } from 'expect';

(function(root, factory) {

}(this, function(expect, SwaggerPetstore) {
  'use strict';

  let instance;

  beforeEach(function() {
    instance = new SwaggerPetstore.ModelReturn();
  });

  let getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  let setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ModelReturn', function() {
    it('should create an instance of ModelReturn', function() {
      // uncomment below and update the code to test ModelReturn
      //var instane = new SwaggerPetstore.ModelReturn();
      //expect(instance).to.be.a(SwaggerPetstore.ModelReturn);
    });

    it('should have the property _return (base name: "return")', function() {
      // uncomment below and update the code to test the property _return
      //var instane = new SwaggerPetstore.ModelReturn();
      //expect(instance).to.be();
    });

  });

}));
