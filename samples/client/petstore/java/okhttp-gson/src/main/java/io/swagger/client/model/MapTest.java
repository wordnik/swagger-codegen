/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * MapTest
 */

public class MapTest   {
  @SerializedName("map_map_of_string")
  private Map<String, Map<String, String>> mapMapOfString = new HashMap<String, Map<String, String>>();

  @SerializedName("map_map_of_enum")
  private Map<String, Map<String, InnerEnum>> mapMapOfEnum = new HashMap<String, InnerEnum<String, String>>();

  /**
   * Gets or Sets inner
   */
  public enum InnerEnum {
    @SerializedName("UPPER")
    UPPER("UPPER"),
    
    @SerializedName("lower")
    LOWER("lower");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("map_of_enum_string")
  private Map<String, InnerEnum> mapOfEnumString = new HashMap<String, InnerEnum>();

  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

   /**
   * Get mapMapOfString
   * @return mapMapOfString
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest mapMapOfEnum(Map<String, Map<String, InnerEnum>> mapMapOfEnum) {
    this.mapMapOfEnum = mapMapOfEnum;
    return this;
  }

   /**
   * Get mapMapOfEnum
   * @return mapMapOfEnum
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Map<String, InnerEnum>> getMapMapOfEnum() {
    return mapMapOfEnum;
  }

  public void setMapMapOfEnum(Map<String, Map<String, InnerEnum>> mapMapOfEnum) {
    this.mapMapOfEnum = mapMapOfEnum;
  }

  public MapTest mapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

   /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, InnerEnum> getMapOfEnumString() {
    return mapOfEnumString;
  }

  public void setMapOfEnumString(Map<String, InnerEnum> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(this.mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(this.mapMapOfEnum, mapTest.mapMapOfEnum) &&
        Objects.equals(this.mapOfEnumString, mapTest.mapOfEnumString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapMapOfEnum, mapOfEnumString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapMapOfEnum: ").append(toIndentedString(mapMapOfEnum)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
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

