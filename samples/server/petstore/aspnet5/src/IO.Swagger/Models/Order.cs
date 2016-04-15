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
    public partial class Order :  IEquatable<Order>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Order" /> class.
        /// </summary>
        /// <param name="Id">Id.</param>
        /// <param name="PetId">PetId.</param>
        /// <param name="Quantity">Quantity.</param>
        /// <param name="ShipDate">ShipDate.</param>
        /// <param name="Status">Order Status.</param>
        /// <param name="Complete">Complete (default to false).</param>
        public Order(long? Id = null, long? PetId = null, int? Quantity = null, DateTime? ShipDate = null, string Status = null, bool? Complete = null)
        {
            this.Id = Id;
            this.PetId = PetId;
            this.Quantity = Quantity;
            this.ShipDate = ShipDate;
            this.Status = Status;
            // use default value if no "Complete" provided
            if (Complete == null)
            {
                this.Complete = false;
            }
            else
            {
                this.Complete = Complete;
            }
            
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets PetId
        /// </summary>
        public long? PetId { get; set; }

        /// <summary>
        /// Gets or Sets Quantity
        /// </summary>
        public int? Quantity { get; set; }

        /// <summary>
        /// Gets or Sets ShipDate
        /// </summary>
        public DateTime? ShipDate { get; set; }

        /// <summary>
        /// Order Status
        /// </summary>
        /// <value>Order Status</value>
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets Complete
        /// </summary>
        public bool? Complete { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Order {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
sb.Append("  PetId: ").Append(PetId).Append("\n");
sb.Append("  Quantity: ").Append(Quantity).Append("\n");
sb.Append("  ShipDate: ").Append(ShipDate).Append("\n");
sb.Append("  Status: ").Append(Status).Append("\n");
sb.Append("  Complete: ").Append(Complete).Append("\n");
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
            return Equals((Order)obj);
        }

        /// <summary>
        /// Returns true if Order instances are equal
        /// </summary>
        /// <param name="other">Instance of Order to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Order other)
        {

            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.PetId == other.PetId ||
                    this.PetId != null &&
                    this.PetId.Equals(other.PetId)
                ) && 
                (
                    this.Quantity == other.Quantity ||
                    this.Quantity != null &&
                    this.Quantity.Equals(other.Quantity)
                ) && 
                (
                    this.ShipDate == other.ShipDate ||
                    this.ShipDate != null &&
                    this.ShipDate.Equals(other.ShipDate)
                ) && 
                (
                    this.Status == other.Status ||
                    this.Status != null &&
                    this.Status.Equals(other.Status)
                ) && 
                (
                    this.Complete == other.Complete ||
                    this.Complete != null &&
                    this.Complete.Equals(other.Complete)
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
                    if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                    if (this.PetId != null)
                    hash = hash * 59 + this.PetId.GetHashCode();
                    if (this.Quantity != null)
                    hash = hash * 59 + this.Quantity.GetHashCode();
                    if (this.ShipDate != null)
                    hash = hash * 59 + this.ShipDate.GetHashCode();
                    if (this.Status != null)
                    hash = hash * 59 + this.Status.GetHashCode();
                    if (this.Complete != null)
                    hash = hash * 59 + this.Complete.GetHashCode();
                return hash;
            }
        }

        #region Operators

        public static bool operator ==(Order left, Order right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Order left, Order right)
        {
            return !Equals(left, right);
        }

        #endregion Operators

    }
}
