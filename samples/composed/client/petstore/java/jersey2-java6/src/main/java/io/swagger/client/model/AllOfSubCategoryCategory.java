/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.Category;
import io.swagger.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
/**
 * AllOfSubCategoryCategory
 */


public class AllOfSubCategoryCategory extends Category {
  @JsonProperty("foo")
  private Boolean foo = null;

  @JsonProperty("bar")
  private Integer bar = null;

  @JsonProperty("beer")
  private String beer = null;

  @JsonProperty("drunk")
  private User drunk = null;

  public AllOfSubCategoryCategory foo(Boolean foo) {
    this.foo = foo;
    return this;
  }

   /**
   * Get foo
   * @return foo
  **/
  @Schema(description = "")
  public Boolean isFoo() {
    return foo;
  }

  public void setFoo(Boolean foo) {
    this.foo = foo;
  }

  public AllOfSubCategoryCategory bar(Integer bar) {
    this.bar = bar;
    return this;
  }

   /**
   * Get bar
   * @return bar
  **/
  @Schema(description = "")
  public Integer getBar() {
    return bar;
  }

  public void setBar(Integer bar) {
    this.bar = bar;
  }

  public AllOfSubCategoryCategory beer(String beer) {
    this.beer = beer;
    return this;
  }

   /**
   * Get beer
   * @return beer
  **/
  @Schema(description = "")
  public String getBeer() {
    return beer;
  }

  public void setBeer(String beer) {
    this.beer = beer;
  }

  public AllOfSubCategoryCategory drunk(User drunk) {
    this.drunk = drunk;
    return this;
  }

   /**
   * Get drunk
   * @return drunk
  **/
  @Schema(description = "")
  public User getDrunk() {
    return drunk;
  }

  public void setDrunk(User drunk) {
    this.drunk = drunk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AllOfSubCategoryCategory allOfSubCategoryCategory = (AllOfSubCategoryCategory) o;
    return ObjectUtils.equals(this.foo, allOfSubCategoryCategory.foo) &&
    ObjectUtils.equals(this.bar, allOfSubCategoryCategory.bar) &&
    ObjectUtils.equals(this.beer, allOfSubCategoryCategory.beer) &&
    ObjectUtils.equals(this.drunk, allOfSubCategoryCategory.drunk) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(foo, bar, beer, drunk, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfSubCategoryCategory {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("    beer: ").append(toIndentedString(beer)).append("\n");
    sb.append("    drunk: ").append(toIndentedString(drunk)).append("\n");
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
