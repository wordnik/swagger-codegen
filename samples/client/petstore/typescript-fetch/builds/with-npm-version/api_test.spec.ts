/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This file is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the file manually.
 */

import * as api from "./api"
import { Configuration } from "./configuration"

const config: Configuration = {}

describe("DefaultApi", () => {
  let instance: api.DefaultApi
  beforeEach(function() {
    instance = new api.DefaultApi(config)
  });

  test("testMethod", () => {
    return expect(instance.testMethod({})).resolves.toBe(null)
  })
})

describe("PetApi", () => {
  let instance: api.PetApi
  beforeEach(function() {
    instance = new api.PetApi(config)
  });

  test("addPet", () => {
    const body: api.Pet = undefined
    return expect(instance.addPet(body, {})).resolves.toBe(null)
  })
  test("deletePet", () => {
    const petId: number = 789
    const apiKey: string = "apiKey_example"
    return expect(instance.deletePet(petId, apiKey, {})).resolves.toBe(null)
  })
  test("doCategoryStuff", () => {
    const body: api.SubCategory = undefined
    return expect(instance.doCategoryStuff(body, {})).resolves.toBe(null)
  })
  test("findPetsByStatus", () => {
    const status: api.Array<string> = undefined
    return expect(instance.findPetsByStatus(status, {})).resolves.toBe(null)
  })
  test("findPetsByTags", () => {
    const tags: api.Array<string> = undefined
    return expect(instance.findPetsByTags(tags, {})).resolves.toBe(null)
  })
  test("getAllPets", () => {
    return expect(instance.getAllPets({})).resolves.toBe(null)
  })
  test("getPetById", () => {
    const petId: number = 789
    return expect(instance.getPetById(petId, {})).resolves.toBe(null)
  })
  test("getRandomPet", () => {
    return expect(instance.getRandomPet({})).resolves.toBe(null)
  })
  test("updatePet", () => {
    const body: api.Pet = undefined
    return expect(instance.updatePet(body, {})).resolves.toBe(null)
  })
  test("updatePetWithForm", () => {
    const petId: number = 789
    const name: string = "name_example"
    const status: string = "status_example"
    return expect(instance.updatePetWithForm(petId, name, status, {})).resolves.toBe(null)
  })
  test("uploadFile", () => {
    const petId: number = 789
    const body: Object = undefined
    return expect(instance.uploadFile(petId, body, {})).resolves.toBe(null)
  })
})

describe("StoreApi", () => {
  let instance: api.StoreApi
  beforeEach(function() {
    instance = new api.StoreApi(config)
  });

  test("deleteOrder", () => {
    const orderId: number = 789
    return expect(instance.deleteOrder(orderId, {})).resolves.toBe(null)
  })
  test("getInventory", () => {
    return expect(instance.getInventory({})).resolves.toBe(null)
  })
  test("getOrderById", () => {
    const orderId: number = 789
    return expect(instance.getOrderById(orderId, {})).resolves.toBe(null)
  })
  test("placeOrder", () => {
    const body: api.Order = undefined
    return expect(instance.placeOrder(body, {})).resolves.toBe(null)
  })
})

describe("UserApi", () => {
  let instance: api.UserApi
  beforeEach(function() {
    instance = new api.UserApi(config)
  });

  test("createUser", () => {
    const body: api.User = undefined
    return expect(instance.createUser(body, {})).resolves.toBe(null)
  })
  test("createUsersWithArrayInput", () => {
    const body: api.Array<User> = undefined
    return expect(instance.createUsersWithArrayInput(body, {})).resolves.toBe(null)
  })
  test("createUsersWithListInput", () => {
    const body: api.Array<User> = undefined
    return expect(instance.createUsersWithListInput(body, {})).resolves.toBe(null)
  })
  test("deleteUser", () => {
    const username: string = "username_example"
    return expect(instance.deleteUser(username, {})).resolves.toBe(null)
  })
  test("getUserByName", () => {
    const username: string = "username_example"
    return expect(instance.getUserByName(username, {})).resolves.toBe(null)
  })
  test("loginUser", () => {
    const username: string = "username_example"
    const password: string = "password_example"
    return expect(instance.loginUser(username, password, {})).resolves.toBe(null)
  })
  test("logoutUser", () => {
    return expect(instance.logoutUser({})).resolves.toBe(null)
  })
  test("userUsernamePut", () => {
    const body: api.User = undefined
    const username: string = "username_example"
    return expect(instance.userUsernamePut(body, username, {})).resolves.toBe(null)
  })
})

