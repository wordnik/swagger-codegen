/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{

    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class ArrayOfArrayOfNumberOnly :  IEquatable<ArrayOfArrayOfNumberOnly>
    {

        /// <summary>
        /// Initializes a new instance of the <see cref="ArrayOfArrayOfNumberOnly" /> class.
        /// </summary>
        /// <param name="ArrayArrayNumber">ArrayArrayNumber.</param>
        public ArrayOfArrayOfNumberOnly(List<List<decimal?>> ArrayArrayNumber = default(List<List<decimal?>>))
        {
            this.ArrayArrayNumber = ArrayArrayNumber;
            
        }

        /// <summary>
        /// Gets or Sets ArrayArrayNumber
        /// </summary>
        [DataMember(Name="ArrayArrayNumber")]
        public List<List<decimal?>> ArrayArrayNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArrayOfArrayOfNumberOnly {\n");
            sb.Append("  ArrayArrayNumber: ").Append(ArrayArrayNumber).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            if (obj.GetType() != GetType()) return false;
            return Equals((ArrayOfArrayOfNumberOnly)obj);
        }

        /// <summary>
        /// Returns true if ArrayOfArrayOfNumberOnly instances are equal
        /// </summary>
        /// <param name="other">Instance of ArrayOfArrayOfNumberOnly to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayOfArrayOfNumberOnly other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.ArrayArrayNumber == other.ArrayArrayNumber ||
                    this.ArrayArrayNumber != null &&
                    this.ArrayArrayNumber.SequenceEqual(other.ArrayArrayNumber)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                    if (this.ArrayArrayNumber != null)
                    hash = hash * 59 + this.ArrayArrayNumber.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(ArrayOfArrayOfNumberOnly left, ArrayOfArrayOfNumberOnly right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ArrayOfArrayOfNumberOnly left, ArrayOfArrayOfNumberOnly right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
