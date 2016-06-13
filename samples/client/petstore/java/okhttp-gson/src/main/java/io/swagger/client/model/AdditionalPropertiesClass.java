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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;


/**
 * AdditionalPropertiesClass
 */
public class AdditionalPropertiesClass   {
    @SerializedName("map_property")
    private Map<String, String> mapProperty = new HashMap<String, String>();
    @SerializedName("map_of_map_property")
    private Map<String, Map<String, String>> mapOfMapProperty = new HashMap<String, Map<String, String>>();

    /**
     * Get mapProperty
     * @return mapProperty
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getMapProperty() {
        return mapProperty;
    }

    /**
     * Set mapProperty
     *
     * @param mapProperty mapProperty
     */
    public void setMapProperty(Map<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    /**
     * Get mapOfMapProperty
     * @return mapOfMapProperty
     **/
    @ApiModelProperty(value = "")
    public Map<String, Map<String, String>> getMapOfMapProperty() {
        return mapOfMapProperty;
    }

    /**
     * Set mapOfMapProperty
     *
     * @param mapOfMapProperty mapOfMapProperty
     */
    public void setMapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
        this.mapOfMapProperty = mapOfMapProperty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
        return Objects.equals(this.mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(this.mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapProperty, mapOfMapProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalPropertiesClass {\n");
        
        sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
        sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o Object to be converted to indented string
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

