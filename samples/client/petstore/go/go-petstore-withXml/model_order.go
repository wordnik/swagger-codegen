/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package petstore

import (
	"time"
)

type Order struct {
	Id int64 `json:"id,omitempty" xml:"id"`
	PetId int64 `json:"petId,omitempty" xml:"petId"`
	Quantity int32 `json:"quantity,omitempty" xml:"quantity"`
	ShipDate time.Time `json:"shipDate,omitempty" xml:"shipDate"`
	// Order Status
	Status string `json:"status,omitempty" xml:"status"`
	Complete bool `json:"complete,omitempty" xml:"complete"`
}
