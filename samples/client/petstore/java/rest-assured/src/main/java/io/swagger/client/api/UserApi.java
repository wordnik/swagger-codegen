package io.swagger.client.api;

import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.*;
import static io.restassured.mapper.ObjectMapperType.GSON;

public class UserApi {

    private RequestSpecBuilder reqSpec;

    private UserApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static UserApi user(RequestSpecBuilder reqSpec) {
        return new UserApi(reqSpec);
    }

    public CreateUserOper createUser() {
        return new CreateUserOper(reqSpec);
    }

    public CreateUsersWithArrayInputOper createUsersWithArrayInput() {
        return new CreateUsersWithArrayInputOper(reqSpec);
    }

    public CreateUsersWithListInputOper createUsersWithListInput() {
        return new CreateUsersWithListInputOper(reqSpec);
    }

    public DeleteUserOper deleteUser() {
        return new DeleteUserOper(reqSpec);
    }

    public GetUserByNameOper getUserByName() {
        return new GetUserByNameOper(reqSpec);
    }

    public LoginUserOper loginUser() {
        return new LoginUserOper(reqSpec);
    }

    public LogoutUserOper logoutUser() {
        return new LogoutUserOper(reqSpec);
    }

    public UpdateUserOper updateUser() {
        return new UpdateUserOper(reqSpec);
    }


    /**
     * Create user
     * This can only be done by the logged in user.
     *
     * @see #body Created user object (required)
     */
    public class CreateUserOper {

        public static final String REQ_URI = "/user";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }


         /**
         * @param body Created user object (required)
         */
        public CreateUserOper body(User body) {
            reqSpec.setBody(body, GSON);
            return this;
        }





        /**
         * Customise request specification
         */
        public CreateUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public CreateUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public class CreateUsersWithArrayInputOper {

        public static final String REQ_URI = "/user/createWithArray";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUsersWithArrayInputOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUsersWithArrayInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithArray
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }


         /**
         * @param body List of user object (required)
         */
        public CreateUsersWithArrayInputOper body(List<User> body) {
            reqSpec.setBody(body, GSON);
            return this;
        }





        /**
         * Customise request specification
         */
        public CreateUsersWithArrayInputOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public CreateUsersWithArrayInputOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public class CreateUsersWithListInputOper {

        public static final String REQ_URI = "/user/createWithList";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUsersWithListInputOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUsersWithListInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithList
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }


         /**
         * @param body List of user object (required)
         */
        public CreateUsersWithListInputOper body(List<User> body) {
            reqSpec.setBody(body, GSON);
            return this;
        }





        /**
         * Customise request specification
         */
        public CreateUsersWithListInputOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public CreateUsersWithListInputOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath The name that needs to be deleted (required)
     */
    public class DeleteUserOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeleteUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeleteUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /user/{username}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }




        /**
         * @param username The name that needs to be deleted (required)
         */
        public DeleteUserOper usernamePath(String username) {
            reqSpec.addPathParam("username", username);
            return this;
        }



        /**
         * Customise request specification
         */
        public DeleteUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public DeleteUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get user by user name
     * 
     *
     * @see #usernamePath The name that needs to be fetched. Use user1 for testing.  (required)
     * return User
     */
    public class GetUserByNameOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetUserByNameOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetUserByNameOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/{username}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /user/{username}
         * @return User
         */
        public User executeAs(Function<Response, Response> handler) {
            return execute(handler).as(User.class, GSON);
        }




        /**
         * @param username The name that needs to be fetched. Use user1 for testing.  (required)
         */
        public GetUserByNameOper usernamePath(String username) {
            reqSpec.addPathParam("username", username);
            return this;
        }



        /**
         * Customise request specification
         */
        public GetUserByNameOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public GetUserByNameOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs user into the system
     * 
     *
     * @see #usernameQuery The user name for login (required)
     * @see #passwordQuery The password for login in clear text (required)
     * return String
     */
    public class LoginUserOper {

        public static final String REQ_URI = "/user/login";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public LoginUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public LoginUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/login
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /user/login
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            return execute(handler).as(String.class, GSON);
        }





        /**
         * @param username The user name for login (required)
         */
        public LoginUserOper usernameQuery(String username) {
            reqSpec.addQueryParam("username", username);
            return this;
        }
        /**
         * @param password The password for login in clear text (required)
         */
        public LoginUserOper passwordQuery(String password) {
            reqSpec.addQueryParam("password", password);
            return this;
        }


        /**
         * Customise request specification
         */
        public LoginUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public LoginUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs out current logged in user session
     * 
     *
     */
    public class LogoutUserOper {

        public static final String REQ_URI = "/user/logout";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public LogoutUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public LogoutUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/logout
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }







        /**
         * Customise request specification
         */
        public LogoutUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public LogoutUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath name that need to be deleted (required)
     * @see #body Updated user object (required)
     */
    public class UpdateUserOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UpdateUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            this.respSpec = new ResponseSpecBuilder();
        }

        public UpdateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /user/{username}
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PUT, REQ_URI));
        }


         /**
         * @param body Updated user object (required)
         */
        public UpdateUserOper body(User body) {
            reqSpec.setBody(body, GSON);
            return this;
        }


        /**
         * @param username name that need to be deleted (required)
         */
        public UpdateUserOper usernamePath(String username) {
            reqSpec.addPathParam("username", username);
            return this;
        }



        /**
         * Customise request specification
         */
        public UpdateUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public UpdateUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}