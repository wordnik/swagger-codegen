/* 
 * Swagger Petstore
 *
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// DogAllOf2
    /// </summary>
    [DataContract]
        public partial class DogAllOf2 :  IEquatable<DogAllOf2>, IValidatableObject
    {
        /// <summary>
        /// Defines Breed
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum BreedEnum
        {
            /// <summary>
            /// Enum Dingo for value: Dingo
            /// </summary>
            [EnumMember(Value = "Dingo")]
            Dingo = 1,
            /// <summary>
            /// Enum Husky for value: Husky
            /// </summary>
            [EnumMember(Value = "Husky")]
            Husky = 2,
            /// <summary>
            /// Enum Retriever for value: Retriever
            /// </summary>
            [EnumMember(Value = "Retriever")]
            Retriever = 3,
            /// <summary>
            /// Enum Shepherd for value: Shepherd
            /// </summary>
            [EnumMember(Value = "Shepherd")]
            Shepherd = 4        }
        /// <summary>
        /// Gets or Sets Breed
        /// </summary>
        [DataMember(Name="breed", EmitDefaultValue=false)]
        public BreedEnum? Breed { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DogAllOf2" /> class.
        /// </summary>
        /// <param name="bark">bark.</param>
        /// <param name="breed">breed.</param>
        public DogAllOf2(bool? bark = default(bool?), BreedEnum? breed = default(BreedEnum?))
        {
            this.Bark = bark;
            this.Breed = breed;
        }
        
        /// <summary>
        /// Gets or Sets Bark
        /// </summary>
        [DataMember(Name="bark", EmitDefaultValue=false)]
        public bool? Bark { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DogAllOf2 {\n");
            sb.Append("  Bark: ").Append(Bark).Append("\n");
            sb.Append("  Breed: ").Append(Breed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as DogAllOf2);
        }

        /// <summary>
        /// Returns true if DogAllOf2 instances are equal
        /// </summary>
        /// <param name="input">Instance of DogAllOf2 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DogAllOf2 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Bark == input.Bark ||
                    (this.Bark != null &&
                    this.Bark.Equals(input.Bark))
                ) && 
                (
                    this.Breed == input.Breed ||
                    (this.Breed != null &&
                    this.Breed.Equals(input.Breed))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Bark != null)
                    hashCode = hashCode * 59 + this.Bark.GetHashCode();
                if (this.Breed != null)
                    hashCode = hashCode * 59 + this.Breed.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
