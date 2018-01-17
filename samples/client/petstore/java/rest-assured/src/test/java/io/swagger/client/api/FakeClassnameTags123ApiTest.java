/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Client;
import io.swagger.client.ApiClient;
import io.swagger.client.api.FakeClassnameTags123Api;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static io.restassured.http.ContentType.JSON;
import static io.restassured.mapper.ObjectMapperType.GSON;

/**
 * API tests for FakeClassnameTags123Api
 */
@Ignore
public class FakeClassnameTags123ApiTest {

    private FakeClassnameTags123Api api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setContentType(JSON)
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).fakeClassnameTags123();
    }

    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestClassname() {
        Client body = null;
        api.testClassname()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}