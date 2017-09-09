<?php
/**
 * OuterComposite
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * OuterComposite Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class OuterComposite implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'OuterComposite';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'my_number' => '\Swagger\Client\Model\OuterNumber',
        'my_string' => '\Swagger\Client\Model\OuterString',
        'my_boolean' => '\Swagger\Client\Model\OuterBoolean'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'my_number' => null,
        'my_string' => null,
        'my_boolean' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'my_number' => 'my_number',
        'my_string' => 'my_string',
        'my_boolean' => 'my_boolean'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'my_number' => 'setMyNumber',
        'my_string' => 'setMyString',
        'my_boolean' => 'setMyBoolean'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'my_number' => 'getMyNumber',
        'my_string' => 'getMyString',
        'my_boolean' => 'getMyBoolean'
    ];

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['my_number'] = isset($data['my_number']) ? $data['my_number'] : null;
        $this->container['my_string'] = isset($data['my_string']) ? $data['my_string'] : null;
        $this->container['my_boolean'] = isset($data['my_boolean']) ? $data['my_boolean'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        return true;
    }


    /**
     * Gets my_number
     * @return \Swagger\Client\Model\OuterNumber
     */
    public function getMyNumber()
    {
        return $this->container['my_number'];
    }

    /**
     * Sets my_number
     * @param \Swagger\Client\Model\OuterNumber $my_number
     * @return $this
     */
    public function setMyNumber($my_number)
    {
        $this->container['my_number'] = $my_number;

        return $this;
    }

    /**
     * Gets my_string
     * @return \Swagger\Client\Model\OuterString
     */
    public function getMyString()
    {
        return $this->container['my_string'];
    }

    /**
     * Sets my_string
     * @param \Swagger\Client\Model\OuterString $my_string
     * @return $this
     */
    public function setMyString($my_string)
    {
        $this->container['my_string'] = $my_string;

        return $this;
    }

    /**
     * Gets my_boolean
     * @return \Swagger\Client\Model\OuterBoolean
     */
    public function getMyBoolean()
    {
        return $this->container['my_boolean'];
    }

    /**
     * Sets my_boolean
     * @param \Swagger\Client\Model\OuterBoolean $my_boolean
     * @return $this
     */
    public function setMyBoolean($my_boolean)
    {
        $this->container['my_boolean'] = $my_boolean;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


