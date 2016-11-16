/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package petstore

import (
	"time"
)

type FormatTest struct {

	Integer int32 `json:"integer,omitempty"`

	Int32_ int32 `json:"int32,omitempty"`

	Int64_ int64 `json:"int64,omitempty"`

	Number float32 `json:"number,omitempty"`

	Float float32 `json:"float,omitempty"`

	Double float64 `json:"double,omitempty"`

	String_ string `json:"string,omitempty"`

	Byte_ string `json:"byte,omitempty"`

	Binary string `json:"binary,omitempty"`

	Date time.Time `json:"date,omitempty"`

	DateTime time.Time `json:"dateTime,omitempty"`

	Uuid string `json:"uuid,omitempty"`

	Password string `json:"password,omitempty"`
}
