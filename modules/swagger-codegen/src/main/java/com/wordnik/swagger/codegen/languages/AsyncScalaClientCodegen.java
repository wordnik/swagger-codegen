package com.wordnik.swagger.codegen.languages;

import com.wordnik.swagger.codegen.*;
import com.wordnik.swagger.models.properties.*;

import java.util.*;
import java.io.File;

public class AsyncScalaClientCodegen extends DefaultCodegen implements CodegenConfig {
  protected String invokerPackage = "io.swagger.client";
  protected String groupId = "com.wordnik";
  protected String artifactId = "swagger-async-scala-client";
  protected String artifactVersion = "1.0.0";
  protected String sourceFolder = "src/main/scala";
  protected String clientName = "SwaggerClient";
  protected String authScheme = "";
  protected boolean authPreemptive = false;
  protected boolean asyncHttpClient = !authScheme.isEmpty();

  public CodegenType getTag() {
    return CodegenType.CLIENT;
  }
  
  public String getName() {
    return "async-scala";
  }

  public String getHelp() {
    return "Generates an Asynchronous Scala client library.";
  }

  public AsyncScalaClientCodegen() {
    super();
    outputFolder = "generated-code/async-scala";
    modelTemplateFiles.put("model.mustache", ".scala");
    apiTemplateFiles.put("api.mustache", ".scala");
    templateDir = "asyncscala";
    apiPackage = "io.swagger.client.api";
    modelPackage = "io.swagger.client.model";

    reservedWords = new HashSet<String> (
      Arrays.asList(
        "abstract", "case", "catch", "class", "def", "do", "else", "extends",
        "false", "final", "finally", "for", "forSome", "if", "implicit", 
        "import", "lazy", "match", "new", "null", "object", "override", "package", 
        "private", "protected", "return", "sealed", "super", "this", "throw", 
        "trait", "try", "true", "type", "val", "var", "while", "with", "yield")
    );

    init();
    
    importMapping.remove("List");
    importMapping.remove("Set");
    importMapping.remove("Map");

    importMapping.put("DateTime", "org.joda.time.DateTime");
    importMapping.put("ListBuffer", "scala.collections.mutable.ListBuffer");

    typeMapping = new HashMap<String, String>();
    typeMapping.put("enum", "NSString");
    typeMapping.put("array", "List");
    typeMapping.put("set", "Set");
    typeMapping.put("boolean", "Boolean");
    typeMapping.put("string", "String");
    typeMapping.put("int", "Int");
    typeMapping.put("long", "Long");
    typeMapping.put("float", "Float");
    typeMapping.put("byte", "Byte");
    typeMapping.put("short", "Short");
    typeMapping.put("char", "Char");
    typeMapping.put("long", "Long");
    typeMapping.put("double", "Double");
    typeMapping.put("object", "Any");
    typeMapping.put("file", "File");

    languageSpecificPrimitives = new HashSet<String>(
      Arrays.asList(
        "String",
        "boolean",
        "Boolean",
        "Double",
        "Int",
        "Long",
        "Float",
        "Object",
        "List",
        "Map")
      );
    instantiationTypes.put("array", "ListBuffer");
    instantiationTypes.put("map", "HashMap");
  }

  protected void init() {
    additionalProperties.put("invokerPackage", invokerPackage);
    additionalProperties.put("groupId", groupId);
    additionalProperties.put("artifactId", artifactId);
    additionalProperties.put("artifactVersion", artifactVersion);
    additionalProperties.put("asyncHttpClient", asyncHttpClient);
    additionalProperties.put("authScheme", authScheme);
    additionalProperties.put("authPreemptive", authPreemptive);
    additionalProperties.put("clientName", clientName);

    supportingFiles.clear();
    supportingFiles.add(new SupportingFile("sbt.mustache", "", "build.sbt"));
    supportingFiles.add(new SupportingFile("client.mustache", 
      (sourceFolder + File.separator + invokerPackage).replace(".", java.io.File.separator), clientName + ".scala"));

  }
  
  @Override
  public String escapeReservedWord(String name) {
    return "_" + name;
  }

  @Override
  public String apiFileFolder() {
    return outputFolder + "/" + sourceFolder + "/" + apiPackage().replace('.', File.separatorChar);
  }

  public String modelFileFolder() {
    return outputFolder + "/" + sourceFolder + "/" + modelPackage().replace('.', File.separatorChar);
  }

  @Override
  public String getTypeDeclaration(Property p) {
    if(p instanceof ArrayProperty) {
      ArrayProperty ap = (ArrayProperty) p;
      Property inner = ap.getItems();
      return getSwaggerType(p) + "[" + getTypeDeclaration(inner) + "]";
    }
    else if (p instanceof MapProperty) {
      MapProperty mp = (MapProperty) p;
      Property inner = mp.getAdditionalProperties();

      return getSwaggerType(p) + "[String, " + getTypeDeclaration(inner) + "]";
    }
    return super.getTypeDeclaration(p);
  }

  @Override
  public String getSwaggerType(Property p) {
    String swaggerType = super.getSwaggerType(p);
    String type = null;
    if(typeMapping.containsKey(swaggerType)) {
      type = typeMapping.get(swaggerType);
      if(languageSpecificPrimitives.contains(type))
        return toModelName(type);
    }
    else
      type = swaggerType;
    return toModelName(type);
  }

  @Override
  public String toInstantiationType(Property p) {
    if (p instanceof MapProperty) {
      MapProperty ap = (MapProperty) p;
      String inner = getSwaggerType(ap.getAdditionalProperties());
      return instantiationTypes.get("map") + "[String, " + inner + "]";
    }
    else if (p instanceof ArrayProperty) {
      ArrayProperty ap = (ArrayProperty) p;
      String inner = getSwaggerType(ap.getItems());
      return instantiationTypes.get("array") + "[" + inner + "]";
    }
    else
      return null;
  }

  public String toDefaultValue(Property p) {
    if(p instanceof StringProperty)
      return "null";
    else if (p instanceof BooleanProperty)
      return "null";
    else if(p instanceof DateProperty)
      return "null";
    else if(p instanceof DateTimeProperty)
      return "null";
    else if (p instanceof DoubleProperty)
      return "null";
    else if (p instanceof FloatProperty)
      return "null";
    else if (p instanceof IntegerProperty)
      return "null";
    else if (p instanceof LongProperty)
      return "null";
    else if (p instanceof MapProperty) {
      MapProperty ap = (MapProperty) p;
      String inner = getSwaggerType(ap.getAdditionalProperties());
      return "new HashMap[String, " + inner + "]() ";
    }
    else if (p instanceof ArrayProperty) {
      ArrayProperty ap = (ArrayProperty) p;
      String inner = getSwaggerType(ap.getItems());
      return "new ListBuffer[" + inner + "]() ";
    }
    else
      return "null";
  }

  public String getInvokerPackage() {
    return invokerPackage;
  }

  public void setInvokerPackage(String invokerPackage) {
    this.invokerPackage = invokerPackage;
    init();
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
    init();
  }

  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(String artifactId) {
    this.artifactId = artifactId;
    init();
  }

  public String getArtifactVersion() {
    return artifactVersion;
  }

  public void setArtifactVersion(String artifactVersion) {
    this.artifactVersion = artifactVersion;
    init();
  }

  public String getSourceFolder() {
    return sourceFolder;
  }

  public void setSourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
    init();
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
    init();
  }

  public String getAuthScheme() {
    return authScheme;
  }

  public void setAuthScheme(String authScheme) {
    this.authScheme = authScheme;
    init();
  }

  public boolean isAuthPreemptive() {
    return authPreemptive;
  }

  public void setAuthPreemptive(boolean authPreemptive) {
    this.authPreemptive = authPreemptive;
    init();
  }

  public boolean isAsyncHttpClient() {
    return asyncHttpClient;
  }

  public void setAsyncHttpClient(boolean asyncHttpClient) {
    this.asyncHttpClient = asyncHttpClient;
    init();
  }

}