note
 description:"[
		Swagger Petstore
 		This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
  		OpenAPI spec version: 1.0.0
 	    Contact: apiteam@swagger.io

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"

class
	API_ERROR

create
	make

feature {NONE} -- Initialization

	make (a_error: READABLE_STRING_GENERAL)
		do
			error := a_error
		ensure
			error_set: error = a_error
		end

feature -- Access

	error: READABLE_STRING_GENERAL
		-- Error generated by the API call.

end
