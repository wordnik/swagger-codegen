note
 description:"[
		Swagger Petstore
 		This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
  		OpenAPI spec version: 1.0.0
 	    Contact: apiteam@swagger.io

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"
class BOOLEAN

feature -- Access

  value: detachable BOOLEAN
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_true: BOOLEAN
    once
      create Result
      Result.set_value ("true")
    end

 val_false: BOOLEAN
    once
      create Result
      Result.set_value ("false")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end


