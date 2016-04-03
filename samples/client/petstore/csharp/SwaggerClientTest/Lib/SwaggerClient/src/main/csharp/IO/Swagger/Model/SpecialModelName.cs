using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// SpecialModelName
    /// </summary>
    [DataContract]
    public partial class SpecialModelName :  IEquatable<SpecialModelName>
    { 
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SpecialModelName" /> class.
        /// Initializes a new instance of the <see cref="SpecialModelName" />class.
        /// </summary>
        /// <param name="SpecialPropertyName">SpecialPropertyName.</param>

        public SpecialModelName(long? SpecialPropertyName = null)
        {
            this.SpecialPropertyName = SpecialPropertyName;
            
        }

    
        /// <summary>
        /// Gets or Sets SpecialPropertyName
        /// </summary>
        [DataMember(Name="$special[property.name]", EmitDefaultValue=false)]
        public long? SpecialPropertyName { get; set; }
    
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SpecialModelName {\n");
            sb.Append("  SpecialPropertyName: ").Append(SpecialPropertyName).Append("\n");
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
            return this.Equals(obj as SpecialModelName);
        }

        /// <summary>
        /// Returns true if SpecialModelName instances are equal
        /// </summary>
        /// <param name="other">Instance of SpecialModelName to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SpecialModelName other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.SpecialPropertyName == other.SpecialPropertyName ||
                    this.SpecialPropertyName != null &&
                    this.SpecialPropertyName.Equals(other.SpecialPropertyName)
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
                if (this.SpecialPropertyName != null)
                    hash = hash * 59 + this.SpecialPropertyName.GetHashCode();
                return hash;
            }
        }
    }

}
