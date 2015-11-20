using System;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Pet {
    
  
    private Id Id;

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    public Id Id { get; set; }
    
  
    private Category Category;

    /// <summary>
    /// Gets or Sets Category
    /// </summary>
    [DataMember(Name="category", EmitDefaultValue=false)]
    public Category Category { get; set; }
    
  
    private Name Name;

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    public Name Name { get; set; }
    
  
    private PhotoUrls PhotoUrls;

    /// <summary>
    /// Gets or Sets PhotoUrls
    /// </summary>
    [DataMember(Name="photoUrls", EmitDefaultValue=false)]
    public PhotoUrls PhotoUrls { get; set; }
    
  
    private Tags Tags;

    /// <summary>
    /// Gets or Sets Tags
    /// </summary>
    [DataMember(Name="tags", EmitDefaultValue=false)]
    public Tags Tags { get; set; }
    
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Status {
  
       [EnumMember("available")]
       Available,
  
       [EnumMember("pending")]
       Pending,
  
       [EnumMember("sold")]
       Sold
    }
  
    private Status Status;

    /// <summary>
    /// pet status in the store
    /// </summary>
    /// <value>pet status in the store</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    public Status Status { get; set; }
    

    
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    public long? Id { get; set; }

    
    /// <summary>
    /// Gets or Sets Category
    /// </summary>
    [DataMember(Name="category", EmitDefaultValue=false)]
    public Category Category { get; set; }

    
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    public string Name { get; set; }

    
    /// <summary>
    /// Gets or Sets PhotoUrls
    /// </summary>
    [DataMember(Name="photoUrls", EmitDefaultValue=false)]
    public List<string> PhotoUrls { get; set; }

    
    /// <summary>
    /// Gets or Sets Tags
    /// </summary>
    [DataMember(Name="tags", EmitDefaultValue=false)]
    public List<Tag> Tags { get; set; }

    
    /// <summary>
    /// pet status in the store
    /// </summary>
    /// <value>pet status in the store</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    public string Status { get; set; }

    

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Pet {\n");
      
      sb.Append("  Id: ").Append(Id).Append("\n");
      
      sb.Append("  Category: ").Append(Category).Append("\n");
      
      sb.Append("  Name: ").Append(Name).Append("\n");
      
      sb.Append("  PhotoUrls: ").Append(PhotoUrls).Append("\n");
      
      sb.Append("  Tags: ").Append(Tags).Append("\n");
      
      sb.Append("  Status: ").Append(Status).Append("\n");
      
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
