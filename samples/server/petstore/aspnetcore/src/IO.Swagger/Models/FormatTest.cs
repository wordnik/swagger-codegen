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
    public partial class FormatTest :  IEquatable<FormatTest>
    {

        /// <summary>
        /// Initializes a new instance of the <see cref="FormatTest" /> class.
        /// </summary>
        /// <param name="Integer">Integer.</param>
        /// <param name="Int32">Int32.</param>
        /// <param name="Int64">Int64.</param>
        /// <param name="Number">Number (required).</param>
        /// <param name="Float">Float.</param>
        /// <param name="Double">Double.</param>
        /// <param name="String">String.</param>
        /// <param name="Byte">Byte (required).</param>
        /// <param name="Binary">Binary.</param>
        /// <param name="Date">Date (required).</param>
        /// <param name="DateTime">DateTime.</param>
        /// <param name="Uuid">Uuid.</param>
        /// <param name="Password">Password (required).</param>
        public FormatTest(int? Integer = default(int?), int? Int32 = default(int?), long? Int64 = default(long?), decimal? Number = default(decimal?), float? Float = default(float?), double? Double = default(double?), string String = default(string), byte[] Byte = default(byte[]), byte[] Binary = default(byte[]), DateTime? Date = default(DateTime?), DateTime? DateTime = default(DateTime?), Guid? Uuid = default(Guid?), string Password = default(string))
        {
            // to ensure "Number" is required (not null)
            if (Number == null)
            {
                throw new InvalidDataException("Number is a required property for FormatTest and cannot be null");
            }
            else
            {
                this.Number = Number;
            }
            // to ensure "Byte" is required (not null)
            if (Byte == null)
            {
                throw new InvalidDataException("Byte is a required property for FormatTest and cannot be null");
            }
            else
            {
                this.Byte = Byte;
            }
            // to ensure "Date" is required (not null)
            if (Date == null)
            {
                throw new InvalidDataException("Date is a required property for FormatTest and cannot be null");
            }
            else
            {
                this.Date = Date;
            }
            // to ensure "Password" is required (not null)
            if (Password == null)
            {
                throw new InvalidDataException("Password is a required property for FormatTest and cannot be null");
            }
            else
            {
                this.Password = Password;
            }
            this.Integer = Integer;
            this.Int32 = Int32;
            this.Int64 = Int64;
            this.Float = Float;
            this.Double = Double;
            this.String = String;
            this.Binary = Binary;
            this.DateTime = DateTime;
            this.Uuid = Uuid;
            
        }

        /// <summary>
        /// Gets or Sets Integer
        /// </summary>
        [DataMember(Name="integer")]
        public int? Integer { get; set; }
        /// <summary>
        /// Gets or Sets Int32
        /// </summary>
        [DataMember(Name="int32")]
        public int? Int32 { get; set; }
        /// <summary>
        /// Gets or Sets Int64
        /// </summary>
        [DataMember(Name="int64")]
        public long? Int64 { get; set; }
        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number")]
        public decimal? Number { get; set; }
        /// <summary>
        /// Gets or Sets Float
        /// </summary>
        [DataMember(Name="float")]
        public float? Float { get; set; }
        /// <summary>
        /// Gets or Sets Double
        /// </summary>
        [DataMember(Name="double")]
        public double? Double { get; set; }
        /// <summary>
        /// Gets or Sets String
        /// </summary>
        [DataMember(Name="string")]
        public string String { get; set; }
        /// <summary>
        /// Gets or Sets Byte
        /// </summary>
        [DataMember(Name="byte")]
        public byte[] Byte { get; set; }
        /// <summary>
        /// Gets or Sets Binary
        /// </summary>
        [DataMember(Name="binary")]
        public byte[] Binary { get; set; }
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date")]
        public DateTime? Date { get; set; }
        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>
        [DataMember(Name="dateTime")]
        public DateTime? DateTime { get; set; }
        /// <summary>
        /// Gets or Sets Uuid
        /// </summary>
        [DataMember(Name="uuid")]
        public Guid? Uuid { get; set; }
        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name="password")]
        public string Password { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FormatTest {\n");
            sb.Append("  Integer: ").Append(Integer).Append("\n");
            sb.Append("  Int32: ").Append(Int32).Append("\n");
            sb.Append("  Int64: ").Append(Int64).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  Float: ").Append(Float).Append("\n");
            sb.Append("  Double: ").Append(Double).Append("\n");
            sb.Append("  String: ").Append(String).Append("\n");
            sb.Append("  Byte: ").Append(Byte).Append("\n");
            sb.Append("  Binary: ").Append(Binary).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
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
            return Equals((FormatTest)obj);
        }

        /// <summary>
        /// Returns true if FormatTest instances are equal
        /// </summary>
        /// <param name="other">Instance of FormatTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FormatTest other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Integer == other.Integer ||
                    this.Integer != null &&
                    this.Integer.Equals(other.Integer)
                ) && 
                (
                    this.Int32 == other.Int32 ||
                    this.Int32 != null &&
                    this.Int32.Equals(other.Int32)
                ) && 
                (
                    this.Int64 == other.Int64 ||
                    this.Int64 != null &&
                    this.Int64.Equals(other.Int64)
                ) && 
                (
                    this.Number == other.Number ||
                    this.Number != null &&
                    this.Number.Equals(other.Number)
                ) && 
                (
                    this.Float == other.Float ||
                    this.Float != null &&
                    this.Float.Equals(other.Float)
                ) && 
                (
                    this.Double == other.Double ||
                    this.Double != null &&
                    this.Double.Equals(other.Double)
                ) && 
                (
                    this.String == other.String ||
                    this.String != null &&
                    this.String.Equals(other.String)
                ) && 
                (
                    this.Byte == other.Byte ||
                    this.Byte != null &&
                    this.Byte.Equals(other.Byte)
                ) && 
                (
                    this.Binary == other.Binary ||
                    this.Binary != null &&
                    this.Binary.Equals(other.Binary)
                ) && 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
                ) && 
                (
                    this.DateTime == other.DateTime ||
                    this.DateTime != null &&
                    this.DateTime.Equals(other.DateTime)
                ) && 
                (
                    this.Uuid == other.Uuid ||
                    this.Uuid != null &&
                    this.Uuid.Equals(other.Uuid)
                ) && 
                (
                    this.Password == other.Password ||
                    this.Password != null &&
                    this.Password.Equals(other.Password)
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
                    if (this.Integer != null)
                    hash = hash * 59 + this.Integer.GetHashCode();
                    if (this.Int32 != null)
                    hash = hash * 59 + this.Int32.GetHashCode();
                    if (this.Int64 != null)
                    hash = hash * 59 + this.Int64.GetHashCode();
                    if (this.Number != null)
                    hash = hash * 59 + this.Number.GetHashCode();
                    if (this.Float != null)
                    hash = hash * 59 + this.Float.GetHashCode();
                    if (this.Double != null)
                    hash = hash * 59 + this.Double.GetHashCode();
                    if (this.String != null)
                    hash = hash * 59 + this.String.GetHashCode();
                    if (this.Byte != null)
                    hash = hash * 59 + this.Byte.GetHashCode();
                    if (this.Binary != null)
                    hash = hash * 59 + this.Binary.GetHashCode();
                    if (this.Date != null)
                    hash = hash * 59 + this.Date.GetHashCode();
                    if (this.DateTime != null)
                    hash = hash * 59 + this.DateTime.GetHashCode();
                    if (this.Uuid != null)
                    hash = hash * 59 + this.Uuid.GetHashCode();
                    if (this.Password != null)
                    hash = hash * 59 + this.Password.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(FormatTest left, FormatTest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FormatTest left, FormatTest right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
