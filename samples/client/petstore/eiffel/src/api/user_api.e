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

class
	USER_API

inherit

    API_I


feature -- API Access


	create_user (body: USER)
			-- Create user
			-- This can only be done by the logged in user.
			-- 
			-- argument: body Created user object (required)
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(body)
			l_path := "/user"

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	create_users_with_array_input (body: LIST [USER])
			-- Creates list of users with given input array
			-- 
			-- 
			-- argument: body List of user object (required)
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(body)
			l_path := "/user/createWithArray"

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	create_users_with_list_input (body: LIST [USER])
			-- Creates list of users with given input array
			-- 
			-- 
			-- argument: body List of user object (required)
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(body)
			l_path := "/user/createWithList"

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Post", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	delete_user (username: STRING_32)
			-- Delete user
			-- This can only be done by the logged in user.
			-- 
			-- argument: username The name that needs to be deleted (required)
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/user/{username}"
			l_path.replace_substring_all ("{"+"username"+"}", api_client.url_encode (username.out))

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Delete", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	login_user (username: STRING_32; password: STRING_32): detachable STRING_32
			-- Logs user into the system
			-- 
			-- 
			-- argument: username The user name for login (required)
			-- 
			-- argument: password The password for login in clear text (required)
			-- 
			-- 
			-- Result STRING_32
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/user/login"
			l_request.fill_query_params(api_client.parameter_to_tuple("", "username", username));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "password", password));

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { STRING_32 } l_response.data ({ STRING_32 }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	logout_user 
			-- Logs out current logged in user session
			-- 
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/user/logout"

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	update_user (username: STRING_32; body: USER)
			-- Updated user
			-- This can only be done by the logged in user.
			-- 
			-- argument: username name that need to be deleted (required)
			-- 
			-- argument: body Updated user object (required)
			-- 
			-- 
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(body)
			l_path := "/user/{username}"
			l_path.replace_substring_all ("{"+"username"+"}", api_client.url_encode (username.out))

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Put", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	user_by_name (username: STRING_32): detachable USER
			-- Get user by user name
			-- 
			-- 
			-- argument: username The name that needs to be fetched. Use user1 for testing.  (required)
			-- 
			-- 
			-- Result USER
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/user/{username}"
			l_path.replace_substring_all ("{"+"username"+"}", api_client.url_encode (username.out))

			if attached {STRING} api_client.select_header_accept (<<"application/xml", "application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { USER } l_response.data ({ USER }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
