<?php
/**
 * EnumTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
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
 * EnumTest Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class EnumTest implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Enum_Test';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'enum_string' => 'string',
        'enum_integer' => 'int',
        'enum_number' => 'double',
        'outer_enum' => '\Swagger\Client\Model\OuterEnum'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'enum_string' => 'enum_string',
        'enum_integer' => 'enum_integer',
        'enum_number' => 'enum_number',
        'outer_enum' => 'outerEnum'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'enum_string' => 'setEnumString',
        'enum_integer' => 'setEnumInteger',
        'enum_number' => 'setEnumNumber',
        'outer_enum' => 'setOuterEnum'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'enum_string' => 'getEnumString',
        'enum_integer' => 'getEnumInteger',
        'enum_number' => 'getEnumNumber',
        'outer_enum' => 'getOuterEnum'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    const ENUM_STRING_UPPER = 'UPPER';
    const ENUM_STRING_LOWER = 'lower';
    const ENUM_STRING_EMPTY = '';
    const ENUM_INTEGER_1 = 1;
    const ENUM_INTEGER_MINUS_1 = -1;
    const ENUM_NUMBER_1_DOT_1 = 1.1;
    const ENUM_NUMBER_MINUS_1_DOT_2 = -1.2;
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getEnumStringAllowableValues()
    {
        return [
            self::ENUM_STRING_UPPER,
            self::ENUM_STRING_LOWER,
            self::ENUM_STRING_EMPTY,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getEnumIntegerAllowableValues()
    {
        return [
            self::ENUM_INTEGER_1,
            self::ENUM_INTEGER_MINUS_1,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getEnumNumberAllowableValues()
    {
        return [
            self::ENUM_NUMBER_1_DOT_1,
            self::ENUM_NUMBER_MINUS_1_DOT_2,
        ];
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
        $this->container['enum_string'] = isset($data['enum_string']) ? $data['enum_string'] : null;
        $this->container['enum_integer'] = isset($data['enum_integer']) ? $data['enum_integer'] : null;
        $this->container['enum_number'] = isset($data['enum_number']) ? $data['enum_number'] : null;
        $this->container['outer_enum'] = isset($data['outer_enum']) ? $data['outer_enum'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["UPPER", "lower", ""];
        if (!in_array($this->container['enum_string'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'enum_string', must be one of 'UPPER', 'lower', ''.";
        }

        $allowed_values = ["1", "-1"];
        if (!in_array($this->container['enum_integer'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'enum_integer', must be one of '1', '-1'.";
        }

        $allowed_values = ["1.1", "-1.2"];
        if (!in_array($this->container['enum_number'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'enum_number', must be one of '1.1', '-1.2'.";
        }

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        $allowed_values = ["UPPER", "lower", ""];
        if (!in_array($this->container['enum_string'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["1", "-1"];
        if (!in_array($this->container['enum_integer'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["1.1", "-1.2"];
        if (!in_array($this->container['enum_number'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets enum_string
     * @return string
     */
    public function getEnumString()
    {
        return $this->container['enum_string'];
    }

    /**
     * Sets enum_string
     * @param string $enum_string
     * @return $this
     */
    public function setEnumString($enum_string)
    {
        $allowed_values = array('UPPER', 'lower', '');
        if (!is_null($enum_string) && (!in_array($enum_string, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'enum_string', must be one of 'UPPER', 'lower', ''");
        }
        $this->container['enum_string'] = $enum_string;

        return $this;
    }

    /**
     * Gets enum_integer
     * @return int
     */
    public function getEnumInteger()
    {
        return $this->container['enum_integer'];
    }

    /**
     * Sets enum_integer
     * @param int $enum_integer
     * @return $this
     */
    public function setEnumInteger($enum_integer)
    {
        $allowed_values = array('1', '-1');
        if (!is_null($enum_integer) && (!in_array($enum_integer, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'enum_integer', must be one of '1', '-1'");
        }
        $this->container['enum_integer'] = $enum_integer;

        return $this;
    }

    /**
     * Gets enum_number
     * @return double
     */
    public function getEnumNumber()
    {
        return $this->container['enum_number'];
    }

    /**
     * Sets enum_number
     * @param double $enum_number
     * @return $this
     */
    public function setEnumNumber($enum_number)
    {
        $allowed_values = array('1.1', '-1.2');
        if (!is_null($enum_number) && (!in_array($enum_number, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'enum_number', must be one of '1.1', '-1.2'");
        }
        $this->container['enum_number'] = $enum_number;

        return $this;
    }

    /**
     * Gets outer_enum
     * @return \Swagger\Client\Model\OuterEnum
     */
    public function getOuterEnum()
    {
        return $this->container['outer_enum'];
    }

    /**
     * Sets outer_enum
     * @param \Swagger\Client\Model\OuterEnum $outer_enum
     * @return $this
     */
    public function setOuterEnum($outer_enum)
    {
        $this->container['outer_enum'] = $outer_enum;

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


