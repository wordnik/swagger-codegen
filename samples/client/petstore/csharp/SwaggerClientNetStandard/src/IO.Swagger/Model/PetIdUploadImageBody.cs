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
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// PetIdUploadImageBody
    /// </summary>
    [DataContract]
        public partial class PetIdUploadImageBody :  IEquatable<PetIdUploadImageBody>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PetIdUploadImageBody" /> class.
        /// </summary>
        /// <param name="additionalMetadata">Additional data to pass to server.</param>
        /// <param name="file">file to upload.</param>
        public PetIdUploadImageBody(string additionalMetadata = default(string), byte[] file = default(byte[]))
        {
            this.AdditionalMetadata = additionalMetadata;
            this.File = file;
        }
        
        /// <summary>
        /// Additional data to pass to server
        /// </summary>
        /// <value>Additional data to pass to server</value>
        [DataMember(Name="additionalMetadata", EmitDefaultValue=false)]
        public string AdditionalMetadata { get; set; }

        /// <summary>
        /// file to upload
        /// </summary>
        /// <value>file to upload</value>
        [DataMember(Name="file", EmitDefaultValue=false)]
        public byte[] File { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PetIdUploadImageBody {\n");
            sb.Append("  AdditionalMetadata: ").Append(AdditionalMetadata).Append("\n");
            sb.Append("  File: ").Append(File).Append("\n");
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
            return this.Equals(input as PetIdUploadImageBody);
        }

        /// <summary>
        /// Returns true if PetIdUploadImageBody instances are equal
        /// </summary>
        /// <param name="input">Instance of PetIdUploadImageBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PetIdUploadImageBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AdditionalMetadata == input.AdditionalMetadata ||
                    (this.AdditionalMetadata != null &&
                    this.AdditionalMetadata.Equals(input.AdditionalMetadata))
                ) && 
                (
                    this.File == input.File ||
                    (this.File != null &&
                    this.File.Equals(input.File))
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
                if (this.AdditionalMetadata != null)
                    hashCode = hashCode * 59 + this.AdditionalMetadata.GetHashCode();
                if (this.File != null)
                    hashCode = hashCode * 59 + this.File.GetHashCode();
                return hashCode;
            }
        }
    }
}
