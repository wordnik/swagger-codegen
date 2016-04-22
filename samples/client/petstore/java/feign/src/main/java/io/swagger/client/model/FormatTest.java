package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-19T19:29:57.731+08:00")
public class FormatTest   {
  
  private Integer integer = null;
  private Integer int32 = null;
  private Long int64 = null;
  private BigDecimal number = null;
  private Float _float = null;
  private Double _double = null;
  private String string = null;
  private byte[] _byte = null;
  private byte[] binary = null;
  private Date date = null;
  private Date dateTime = null;
  private String password = null;

  
  /**
   **/
  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integer")
  public Integer getInteger() {
    return integer;
  }
  public void setInteger(Integer integer) {
    this.integer = integer;
  }


  /**
   **/
  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("int32")
  public Integer getInt32() {
    return int32;
  }
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }


  /**
   **/
  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("int64")
  public Long getInt64() {
    return int64;
  }
  public void setInt64(Long int64) {
    this.int64 = int64;
  }


  /**
   **/
  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("number")
  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  /**
   **/
  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("float")
  public Float getFloat() {
    return _float;
  }
  public void setFloat(Float _float) {
    this._float = _float;
  }


  /**
   **/
  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("double")
  public Double getDouble() {
    return _double;
  }
  public void setDouble(Double _double) {
    this._double = _double;
  }


  /**
   **/
  public FormatTest string(String string) {
    this.string = string;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("string")
  public String getString() {
    return string;
  }
  public void setString(String string) {
    this.string = string;
  }


  /**
   **/
  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("byte")
  public byte[] getByte() {
    return _byte;
  }
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }


  /**
   **/
  public FormatTest binary(byte[] binary) {
    this.binary = binary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("binary")
  public byte[] getBinary() {
    return binary;
  }
  public void setBinary(byte[] binary) {
    this.binary = binary;
  }


  /**
   **/
  public FormatTest date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   **/
  public FormatTest dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateTime")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }


  /**
   **/
  public FormatTest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.string, formatTest.string) &&
        Objects.equals(this._byte, formatTest._byte) &&
        Objects.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.password, formatTest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, _byte, binary, date, dateTime, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

