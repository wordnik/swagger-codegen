package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.math.BigDecimal;
import io.swagger.client.model.Body2;
import io.swagger.client.model.Body3;
import io.swagger.client.model.Body4;
import io.swagger.client.model.Body5;
import io.swagger.client.model.Client;
import io.swagger.client.model.OuterComposite;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
public class FakeApiTest {

    private FakeApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(FakeApi.class);
    }

    /**
     * 
     *
     * Test serialization of outer boolean types
     */
    @Test
    public void fakeOuterBooleanSerializeTest() {
        Boolean body = null;
        // Boolean response = api.fakeOuterBooleanSerialize(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Test serialization of object with outer number type
     */
    @Test
    public void fakeOuterCompositeSerializeTest() {
        OuterComposite body = null;
        // OuterComposite response = api.fakeOuterCompositeSerialize(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Test serialization of outer number types
     */
    @Test
    public void fakeOuterNumberSerializeTest() {
        BigDecimal body = null;
        // BigDecimal response = api.fakeOuterNumberSerialize(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * Test serialization of outer string types
     */
    @Test
    public void fakeOuterStringSerializeTest() {
        String body = null;
        // String response = api.fakeOuterStringSerialize(body);

        // TODO: test validations
    }

    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     */
    @Test
    public void testClientModelTest() {
        Client body = null;
        // Client response = api.testClientModel(body);

        // TODO: test validations
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     */
    @Test
    public void testEndpointParametersTest() {
        Body2 body = null;
        // api.testEndpointParameters(body);

        // TODO: test validations
    }

    /**
     * To test enum parameters
     *
     * To test enum parameters
     */
    @Test
    public void testEnumParametersTest() {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        // api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);

        // TODO: test validations
    }

    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void testEnumParametersTestQueryMap() {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        FakeApi.TestEnumParametersQueryParams queryParams = new FakeApi.TestEnumParametersQueryParams()
            .enumQueryStringArray(null)
            .enumQueryString(null)
            .enumQueryInteger(null);
        // api.testEnumParameters(enumHeaderStringArray, enumHeaderString, queryParams);

    // TODO: test validations
    }
    /**
     * To test enum parameters
     *
     * To test enum parameters
     */
    @Test
    public void testEnumRequestBodyTest() {
        Body4 body = null;
        // api.testEnumRequestBody(body);

        // TODO: test validations
    }

    /**
     * test inline additionalProperties
     *
     * 
     */
    @Test
    public void testInlineAdditionalPropertiesTest() {
        Map<String, String> body = null;
        // api.testInlineAdditionalProperties(body);

        // TODO: test validations
    }

    /**
     * test json serialization of form data
     *
     * 
     */
    @Test
    public void testJsonFormDataTest() {
        Body5 body = null;
        // api.testJsonFormData(body);

        // TODO: test validations
    }

}
