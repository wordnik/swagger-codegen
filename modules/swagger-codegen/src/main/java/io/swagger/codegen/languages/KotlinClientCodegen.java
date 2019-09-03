package io.swagger.codegen.languages;

import io.swagger.codegen.CliOption;
import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenOperation;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.CodegenType;
import io.swagger.codegen.SupportingFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class KotlinClientCodegen extends AbstractKotlinCodegen {

    protected static final String VENDOR_EXTENSION_ESCAPED_NAME = "x-escapedName";

    public static final String DATE_LIBRARY = "dateLibrary";

    protected CodegenConstants.ENUM_PROPERTY_NAMING_TYPE enumPropertyNaming = CodegenConstants.ENUM_PROPERTY_NAMING_TYPE.camelCase;
    static Logger LOGGER = LoggerFactory.getLogger(KotlinClientCodegen.class);

    protected static final String JVM = "jvm";
    protected static final String MULTIPLATFORM = "multiplatform";

    protected String dateLibrary = DateLibrary.JAVA8.value;

    // https://kotlinlang.org/docs/reference/grammar.html#Identifier
    protected static final Pattern IDENTIFIER_PATTERN =
            Pattern.compile("[\\p{Ll}\\p{Lm}\\p{Lo}\\p{Lt}\\p{Lu}\\p{Nl}_][\\p{Ll}\\p{Lm}\\p{Lo}\\p{Lt}\\p{Lu}\\p{Nl}\\p{Nd}_]*");

    // https://kotlinlang.org/docs/reference/grammar.html#Identifier
    protected static final String IDENTIFIER_REPLACEMENTS =
            "[.;:/\\[\\]<>]";

    public enum DateLibrary {
        STRING("string"),
        THREETENBP("threetenbp"),
        JAVA8("java8");

        public final String value;

        DateLibrary(String value) {
            this.value = value;
        }
    }

    /**
     * Constructs an instance of `KotlinClientCodegen`.
     */
    public KotlinClientCodegen() {
        super();

        artifactId = "kotlin-client";
        packageName = "io.swagger.client";

        outputFolder = "generated-code" + File.separator + "kotlin-client";
        modelTemplateFiles.put("model.mustache", ".kt");
        apiTemplateFiles.put("api.mustache", ".kt");
        modelDocTemplateFiles.put("model_doc.mustache", ".md");
        apiDocTemplateFiles.put("api_doc.mustache", ".md");
        embeddedTemplateDir = templateDir = "kotlin-client";
        apiPackage = packageName + ".apis";
        modelPackage = packageName + ".models";

        CliOption dateLibrary = new CliOption(DATE_LIBRARY, "Option. Date library to use");
        Map<String, String> dateOptions = new HashMap<>();
        dateOptions.put(DateLibrary.STRING.value, "String");
        dateOptions.put(DateLibrary.THREETENBP.value, "Threetenbp (jvm only)");
        dateOptions.put(DateLibrary.JAVA8.value, "Java 8 native JSR310 (jvm only)");
        dateLibrary.setEnum(dateOptions);
        cliOptions.add(dateLibrary);

        supportedLibraries.put(JVM, "Platform: Java Virtual Machine. HTTP client: OkHttp 2.7.5. JSON processing: Gson 2.8.1.");
        supportedLibraries.put(MULTIPLATFORM, "Platform: Kotlin multiplatform. HTTP client: Ktor 1.2.4. JSON processing: Kotlinx Serialization: 0.12.0.");

        CliOption libraryOption = new CliOption(CodegenConstants.LIBRARY, "Library template (sub-template) to use");
        libraryOption.setEnum(supportedLibraries);
        libraryOption.setDefault(JVM);
        cliOptions.add(libraryOption);
        setLibrary(JVM);
    }

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "kotlin";
    }

    public String getHelp() {
        return "Generates a kotlin client.";
    }

    public void setDateLibrary(String library) {
        this.dateLibrary = library;
    }

    @Override
    public void processOpts() {
        super.processOpts();

        if (MULTIPLATFORM.equals(getLibrary())) {
            sourceFolder = "src/commonMain/kotlin";
        }

        // infrastructure destination folder
        final String infrastructureFolder = (sourceFolder + File.separator + packageName + File.separator + "infrastructure").replace(".", "/");

        // additional properties
        if (additionalProperties.containsKey(DATE_LIBRARY)) {
            setDateLibrary(additionalProperties.get(DATE_LIBRARY).toString());
        }

        // common (jvm/multiplatform) supporting files
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        supportingFiles.add(new SupportingFile("build.gradle.mustache", "", "build.gradle"));
        supportingFiles.add(new SupportingFile("settings.gradle.mustache", "", "settings.gradle"));
        supportingFiles.add(new SupportingFile("infrastructure/ApiClient.kt.mustache", infrastructureFolder, "ApiClient.kt"));
        supportingFiles.add(new SupportingFile("infrastructure/ApiAbstractions.kt.mustache", infrastructureFolder, "ApiAbstractions.kt"));
        supportingFiles.add(new SupportingFile("infrastructure/RequestConfig.kt.mustache", infrastructureFolder, "RequestConfig.kt"));
        supportingFiles.add(new SupportingFile("infrastructure/RequestMethod.kt.mustache", infrastructureFolder, "RequestMethod.kt"));

        if (JVM.equals(getLibrary())) {
            additionalProperties.put(JVM, true);

            // jvm specific supporting files
            supportingFiles.add(new SupportingFile("infrastructure/ApplicationDelegates.kt.mustache", infrastructureFolder, "ApplicationDelegates.kt"));
            supportingFiles.add(new SupportingFile("infrastructure/Errors.kt.mustache", infrastructureFolder, "Errors.kt"));
            supportingFiles.add(new SupportingFile("infrastructure/ResponseExtensions.kt.mustache", infrastructureFolder, "ResponseExtensions.kt"));
            supportingFiles.add(new SupportingFile("infrastructure/Serializer.kt.mustache", infrastructureFolder, "Serializer.kt"));
            supportingFiles.add(new SupportingFile("infrastructure/ApiInfrastructureResponse.kt.mustache", infrastructureFolder, "ApiInfrastructureResponse.kt"));

        } else if (MULTIPLATFORM.equals(getLibrary())) {
            additionalProperties.put(MULTIPLATFORM, true);
            setDateLibrary(DateLibrary.STRING.value);

            // multiplatform import mapping
            importMapping.put("InputProvider", "io.ktor.client.request.forms.InputProvider");
            defaultIncludes.add("io.ktor.client.request.forms.InputProvider");

            // multiplatform type mapping
            typeMapping.put("number", "kotlin.Double");
            typeMapping.put("file", "InputProvider");

            // multiplatform specific supporting files
            supportingFiles.add(new SupportingFile("infrastructure/HttpResponse.kt.mustache", infrastructureFolder, "HttpResponse.kt"));

            // gradle wrapper supporting files
            supportingFiles.add(new SupportingFile("gradlew.mustache", "", "gradlew"));
            supportingFiles.add(new SupportingFile("gradlew.bat.mustache", "", "gradlew.bat"));
            supportingFiles.add(new SupportingFile("gradle-wrapper.properties.mustache", "gradle.wrapper".replace(".", File.separator), "gradle-wrapper.properties"));
            supportingFiles.add(new SupportingFile("gradle-wrapper.jar", "gradle.wrapper".replace(".", File.separator), "gradle-wrapper.jar"));
        }

        // date library processing
        if (DateLibrary.THREETENBP.value.equals(dateLibrary)) {
            additionalProperties.put(DateLibrary.THREETENBP.value, true);
            typeMapping.put("date", "LocalDate");
            typeMapping.put("DateTime", "LocalDateTime");
            importMapping.put("LocalDate", "org.threeten.bp.LocalDate");
            importMapping.put("LocalDateTime", "org.threeten.bp.LocalDateTime");
            defaultIncludes.add("org.threeten.bp.LocalDateTime");
        } else if (DateLibrary.STRING.value.equals(dateLibrary)) {
            typeMapping.put("date-time", "kotlin.String");
            typeMapping.put("date", "kotlin.String");
            typeMapping.put("Date", "kotlin.String");
            typeMapping.put("DateTime", "kotlin.String");
        } else if (DateLibrary.JAVA8.value.equals(dateLibrary)) {
            additionalProperties.put(DateLibrary.JAVA8.value, true);
        }
    }

    @Override
    public Map<String, Object> postProcessModels(Map<String, Object> objs) {

        // workaround for: https://github.com/swagger-api/swagger-codegen/issues/4258
        objs = postProcessModelsRemoveDuplicates(super.postProcessModels(objs));
        return postProcessModelsEscapeNames(objs);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> postProcessModelsRemoveDuplicates(Map<String, Object> objs) {
        List<Object> models = (List<Object>) objs.get("models");
        for (Object _mo : models) {
            Map<String, Object> mo = (Map<String, Object>) _mo;
            CodegenModel cm = (CodegenModel) mo.get("model");
            if (cm.requiredVars != null) removeDuplicates(cm.requiredVars);
            if (cm.optionalVars != null) removeDuplicates(cm.optionalVars);
        }
        return objs;
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> postProcessModelsEscapeNames(Map<String, Object> objs) {
        List<Object> models = (List<Object>) objs.get("models");
        for (Object _mo : models) {
            Map<String, Object> mo = (Map<String, Object>) _mo;
            CodegenModel cm = (CodegenModel) mo.get("model");

            if (cm.vars != null) {
                for (CodegenProperty var : cm.vars) {
                    var.vendorExtensions.put(VENDOR_EXTENSION_ESCAPED_NAME, escapeIdentifier(var.name));
                }
            }
        }
        return objs;
    }

    private static String escapeIdentifier(String identifier) {

        // the kotlin grammar permits a wider set of characters in their identifiers that all target
        // platforms permit (namely jvm). in order to remain compatible with target platforms, we
        // initially replace all illegal target characters before escaping the identifier if required.
        identifier = identifier.replaceAll(IDENTIFIER_REPLACEMENTS, "_");
        if (IDENTIFIER_PATTERN.matcher(identifier).matches()) return identifier;
        return '`' + identifier + '`';
    }

    private static void removeDuplicates(List<CodegenProperty> list) {
        Set<String> set = new HashSet<>();
        Iterator<CodegenProperty> iterator = list.iterator();
        while (iterator.hasNext()) {
            CodegenProperty item = iterator.next();
            if (set.contains(item.name)) iterator.remove();
            else set.add(item.name);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> postProcessOperations(Map<String, Object> objs) {
        super.postProcessOperations(objs);
        Map<String, Object> operations = (Map<String, Object>) objs.get("operations");
        if (operations != null) {
            List<CodegenOperation> ops = (List<CodegenOperation>) operations.get("operation");
            for (CodegenOperation operation : ops) {
                if (operation.hasConsumes == Boolean.TRUE) {
                    if (isMultipartType(operation.consumes)) {
                        operation.isMultipart = Boolean.TRUE;
                    }
                }
            }
        }
        return operations;
    }

    private static boolean isMultipartType(List<Map<String, String>> consumes) {
        Map<String, String> firstType = consumes.get(0);
        if (firstType != null) {
            return "multipart/form-data".equals(firstType.get("mediaType"));
        }
        return false;
    }

}
