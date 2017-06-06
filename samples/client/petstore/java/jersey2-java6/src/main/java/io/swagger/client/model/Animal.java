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


package io.swagger.client.model;

import org.apache.commons.lang3.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Animal
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true, defaultImpl = Animal.UnknownAnimal.class )
@JsonSubTypes({
  @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
  @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
})

public class Animal {
  public static class UnknownAnimal extends Animal {
    private final Map<String, Object> data = new HashMap<>();

    @JsonAnySetter
    public void set(String name, Object value) {
        data.put(name, value);
    }

    @JsonAnyGetter
    public Map<String, Object> get() {
      return data;
    }
  }

  @JsonProperty("className")
  private String className = null;

  @JsonProperty("color")
  private String color = "red";

  public Animal className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Animal color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Animal animal = (Animal) o;
    return ObjectUtils.equals(this.className, animal.className) &&
    ObjectUtils.equals(this.color, animal.color);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(className, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ").append(this.getClass().getSimpleName()).append(" {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

