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

import com.google.gson.annotations.SerializedName;


/**
 * Model for testing model name starting with number
 */
@ApiModel(description = "Model for testing model name starting with number")
public class Model200Response   {
    @SerializedName("name")
    private Integer name = null;
    @SerializedName("class")
    private String PropertyClass = null;

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Integer getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name name
     */
    public void setName(Integer name) {
        this.name = name;
    }

    /**
     * Get PropertyClass
     * @return PropertyClass
     **/
    @ApiModelProperty(value = "")
    public String getPropertyClass() {
        return PropertyClass;
    }

    /**
     * Set PropertyClass
     *
     * @param PropertyClass PropertyClass
     */
    public void setPropertyClass(String PropertyClass) {
        this.PropertyClass = PropertyClass;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Model200Response _200Response = (Model200Response) o;
        return Objects.equals(this.name, _200Response.name) &&
        Objects.equals(this.PropertyClass, _200Response.PropertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, PropertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model200Response {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
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

