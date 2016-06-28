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
import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;


/**
 * Order
 */
public class Order   {
    @SerializedName("id")
    private Long id = null;
    @SerializedName("petId")
    private Long petId = null;
    @SerializedName("quantity")
    private Integer quantity = null;
    @SerializedName("shipDate")
    private DateTime shipDate = null;
  /**
   * Order Status
   */
  public enum StatusEnum {
    @SerializedName("placed")
    PLACED("placed"),

    @SerializedName("approved")
    APPROVED("approved"),

    @SerializedName("delivered")
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

    @SerializedName("status")
    private StatusEnum status = null;
    @SerializedName("complete")
    private Boolean complete = false;

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    /**
     * Set id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get petId
     * @return petId
     **/
    @ApiModelProperty(value = "")
    public Long getPetId() {
        return petId;
    }

    /**
     * Set petId
     *
     * @param petId petId
     */
    public void setPetId(Long petId) {
        this.petId = petId;
    }

    /**
     * Get quantity
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set quantity
     *
     * @param quantity quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Get shipDate
     * @return shipDate
     **/
    @ApiModelProperty(value = "")
    public DateTime getShipDate() {
        return shipDate;
    }

    /**
     * Set shipDate
     *
     * @param shipDate shipDate
     */
    public void setShipDate(DateTime shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * Order Status
     * @return status
     **/
    @ApiModelProperty(value = "Order Status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set status
     *
     * @param status status
     */
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get complete
     * @return complete
     **/
    @ApiModelProperty(value = "")
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Set complete
     *
     * @param complete complete
     */
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, petId, quantity, shipDate, status, complete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

