/* 
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

-- pet class
local pet = {}
local pet_mt = {
  __name = "pet";
  __index = pet;
}

local function cast_pet(t)
  return setmetatable(t, pet_mt)
end

local function new_pet(id, category, name, photo_urls, tags, status)
  return cast_pet({
    id = id;
    category = category;
    name = name;
    photo_urls = photo_urls;
    tags = tags;
    status = status;
  })
end

return {
  cast = cast_pet;
  new = new_pet;
}
