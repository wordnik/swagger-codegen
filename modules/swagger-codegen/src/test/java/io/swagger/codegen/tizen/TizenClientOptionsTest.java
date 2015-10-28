package io.swagger.codegen.tizen;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.languages.TizenClientCodegen;

import com.google.common.collect.ImmutableMap;
import mockit.Expectations;
import mockit.Tested;

import java.util.Map;

public class TizenClientOptionsTest extends AbstractOptionsTest {
    protected static final String MODEL_PACKAGE_VALUE = "package";
    protected static final String API_PACKAGE_VALUE = "apiPackage";
    protected static final String SORT_PARAMS_VALUE = "false";

    @Tested
    private TizenClientCodegen clientCodegen;

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
            clientCodegen.setModelPackage(MODEL_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setApiPackage(API_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setSortParamsByRequiredFlag(Boolean.valueOf(SORT_PARAMS_VALUE));
            times = 1;
        }};
    }

    @Override
    protected Map<String, String> getAvaliableOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder.put(CodegenConstants.MODEL_PACKAGE, MODEL_PACKAGE_VALUE)
                .put(CodegenConstants.API_PACKAGE, API_PACKAGE_VALUE)
                .put(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG, SORT_PARAMS_VALUE)
                .build();
    }
}
