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
using PropertyChanged;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// MapTest
    /// </summary>
    [DataContract]
    [ImplementPropertyChanged]
    public partial class MapTest :  IEquatable<MapTest>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Inner
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InnerEnum
        {
            
            /// <summary>
            /// Enum UPPER for "UPPER"
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPER,
            
            /// <summary>
            /// Enum Lower for "lower"
            /// </summary>
            [EnumMember(Value = "lower")]
            Lower
        }

        /// <summary>
        /// Gets or Sets MapOfEnumString
        /// </summary>
        [DataMember(Name="map_of_enum_string", EmitDefaultValue=false)]
        public Dictionary<string, InnerEnum> MapOfEnumString { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MapTest" /> class.
        /// </summary>
        /// <param name="MapMapOfString">MapMapOfString.</param>
        /// <param name="MapOfEnumString">MapOfEnumString.</param>
        public MapTest(Dictionary<string, Dictionary<string, string>> MapMapOfString = default(Dictionary<string, Dictionary<string, string>>), Dictionary<string, InnerEnum> MapOfEnumString = default(Dictionary<string, InnerEnum>))
        {
            this.MapMapOfString = MapMapOfString;
            this.MapOfEnumString = MapOfEnumString;
        }
        
        /// <summary>
        /// Gets or Sets MapMapOfString
        /// </summary>
        [DataMember(Name="map_map_of_string", EmitDefaultValue=false)]
        public Dictionary<string, Dictionary<string, string>> MapMapOfString { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MapTest {\n");
            sb.Append("  MapMapOfString: ").Append(MapMapOfString).Append("\n");
            sb.Append("  MapOfEnumString: ").Append(MapOfEnumString).Append("\n");
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
            return this.Equals(obj as MapTest);
        }

        /// <summary>
        /// Returns true if MapTest instances are equal
        /// </summary>
        /// <param name="other">Instance of MapTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MapTest other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.MapMapOfString == other.MapMapOfString ||
                    this.MapMapOfString != null &&
                    this.MapMapOfString.SequenceEqual(other.MapMapOfString)
                ) && 
                (
                    this.MapOfEnumString == other.MapOfEnumString ||
                    this.MapOfEnumString != null &&
                    this.MapOfEnumString.SequenceEqual(other.MapOfEnumString)
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
                if (this.MapMapOfString != null)
                    hash = hash * 59 + this.MapMapOfString.GetHashCode();
                if (this.MapOfEnumString != null)
                    hash = hash * 59 + this.MapOfEnumString.GetHashCode();
                return hash;
            }
        }

        /// <summary>
        /// Property changed event handler
        /// </summary>
        public event PropertyChangedEventHandler PropertyChanged;

        /// <summary>
        /// Trigger when a property changed
        /// </summary>
        /// <param name="propertyName">Property Name</param>
        public virtual void OnPropertyChanged(string propertyName)
        {
            // NOTE: property changed is handled via "code weaving" using Fody.
            // Properties with setters are modified at compile time to notify of changes.
            var propertyChanged = PropertyChanged;
            if (propertyChanged != null)
            {
                propertyChanged(this, new PropertyChangedEventArgs(propertyName));
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
