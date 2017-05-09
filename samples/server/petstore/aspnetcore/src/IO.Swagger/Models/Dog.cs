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
    public partial class Dog : Animal,  IEquatable<Dog>
    {

        /// <summary>
        /// Initializes a new instance of the <see cref="Dog" /> class.
        /// </summary>
        /// <param name="ClassName">ClassName (required).</param>
        /// <param name="Color">Color (default to &quot;red&quot;).</param>
        /// <param name="Breed">Breed.</param>
        public Dog(string ClassName = default(string), string Color = "red", string Breed = default(string))
        {
            // to ensure "ClassName" is required (not null)
            if (ClassName == null)
            {
                throw new InvalidDataException("ClassName is a required property for Dog and cannot be null");
            }
            else
            {
                this.ClassName = ClassName;
            }
            // use default value if no "Color" provided
            if (Color == null)
            {
                this.Color = "red";
            }
            else
            {
                this.Color = Color;
            }
            this.Breed = Breed;
            
        }

        /// <summary>
        /// Gets or Sets ClassName
        /// </summary>
        [DataMember(Name="className")]
        public string ClassName { get; set; }
        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [DataMember(Name="color")]
        public string Color { get; set; }
        /// <summary>
        /// Gets or Sets Breed
        /// </summary>
        [DataMember(Name="breed")]
        public string Breed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Dog {\n");
            sb.Append("  ClassName: ").Append(ClassName).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  Breed: ").Append(Breed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public  new string ToJson()
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
            return Equals((Dog)obj);
        }

        /// <summary>
        /// Returns true if Dog instances are equal
        /// </summary>
        /// <param name="other">Instance of Dog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Dog other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.ClassName == other.ClassName ||
                    this.ClassName != null &&
                    this.ClassName.Equals(other.ClassName)
                ) && 
                (
                    this.Color == other.Color ||
                    this.Color != null &&
                    this.Color.Equals(other.Color)
                ) && 
                (
                    this.Breed == other.Breed ||
                    this.Breed != null &&
                    this.Breed.Equals(other.Breed)
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
                    if (this.ClassName != null)
                    hash = hash * 59 + this.ClassName.GetHashCode();
                    if (this.Color != null)
                    hash = hash * 59 + this.Color.GetHashCode();
                    if (this.Breed != null)
                    hash = hash * 59 + this.Breed.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(Dog left, Dog right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Dog left, Dog right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
