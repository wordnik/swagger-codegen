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
    /// EnumArrays
    /// </summary>
    [DataContract]
    public partial class EnumArrays :  IEquatable<EnumArrays>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets JustSymbol
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum JustSymbolEnum
        {
            
            /// <summary>
            /// Enum GreaterThanOrEqualTo for ">="
            /// </summary>
            [EnumMember(Value = ">=")]
            GreaterThanOrEqualTo,
            
            /// <summary>
            /// Enum Dollar for "$"
            /// </summary>
            [EnumMember(Value = "$")]
            Dollar
        }


        /// <summary>
        /// Gets or Sets ArrayEnum
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ArrayEnumEnum
        {
            
            /// <summary>
            /// Enum Fish for "fish"
            /// </summary>
            [EnumMember(Value = "fish")]
            Fish,
            
            /// <summary>
            /// Enum Crab for "crab"
            /// </summary>
            [EnumMember(Value = "crab")]
            Crab
        }

        /// <summary>
        /// Gets or Sets JustSymbol
        /// </summary>
        [DataMember(Name="just_symbol", EmitDefaultValue=false)]
        public JustSymbolEnum? JustSymbol { get; set; }
        /// <summary>
        /// Gets or Sets ArrayEnum
        /// </summary>
        [DataMember(Name="array_enum", EmitDefaultValue=false)]
        public System.Collections.Generic.List<ArrayEnumEnum> ArrayEnum { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnumArrays" /> class.
        /// </summary>
        /// <param name="JustSymbol">JustSymbol.</param>
        /// <param name="ArrayEnum">ArrayEnum.</param>
        public EnumArrays(JustSymbolEnum? JustSymbol = default(JustSymbolEnum?), System.Collections.Generic.List<ArrayEnumEnum> ArrayEnum = default(System.Collections.Generic.List<ArrayEnumEnum>))
        {
            this.JustSymbol = JustSymbol;
            this.ArrayEnum = ArrayEnum;
        }
        


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnumArrays {\n");
            sb.Append("  JustSymbol: ").Append(JustSymbol).Append("\n");
            sb.Append("  ArrayEnum: ").Append(ArrayEnum).Append("\n");
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
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as EnumArrays);
        }

        /// <summary>
        /// Returns true if EnumArrays instances are equal
        /// </summary>
        /// <param name="other">Instance of EnumArrays to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnumArrays other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.JustSymbol == other.JustSymbol ||
                    this.JustSymbol != null &&
                    this.JustSymbol.Equals(other.JustSymbol)
                ) && 
                (
                    this.ArrayEnum == other.ArrayEnum ||
                    this.ArrayEnum != null &&
                    this.ArrayEnum.SequenceEqual(other.ArrayEnum)
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
                if (this.JustSymbol != null)
                    hash = hash * 59 + this.JustSymbol.GetHashCode();
                if (this.ArrayEnum != null)
                    hash = hash * 59 + this.ArrayEnum.GetHashCode();
                return hash;
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
