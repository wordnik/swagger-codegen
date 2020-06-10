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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Model for testing model name same as property name
 */
@ApiModel(description = "Model for testing model name same as property name")




public class Name implements Parcelable {
  @SerializedName("name")
  private Integer name = null;

  @SerializedName("snake_case")
  private Integer snakeCase = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("123Number")
  private Integer _123Number = null;

  public Name() {
  }
  public Name name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

   /**
   * Get snakeCase
   * @return snakeCase
  **/
  @ApiModelProperty(value = "")
  public Integer getSnakeCase() {
    return snakeCase;
  }

  public Name property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

   /**
   * Get _123Number
   * @return _123Number
  **/
  @ApiModelProperty(value = "")
  public Integer get123Number() {
    return _123Number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123Number, name._123Number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123Number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123Number: ").append(toIndentedString(_123Number)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(name);
    out.writeValue(snakeCase);
    out.writeValue(property);
    out.writeValue(_123Number);
  }

  Name(Parcel in) {
    name = (Integer)in.readValue(null);
    snakeCase = (Integer)in.readValue(null);
    property = (String)in.readValue(null);
    _123Number = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Name> CREATOR = new Parcelable.Creator<Name>() {
    public Name createFromParcel(Parcel in) {
      return new Name(in);
    }
    public Name[] newArray(int size) {
      return new Name[size];
    }
  };
}

