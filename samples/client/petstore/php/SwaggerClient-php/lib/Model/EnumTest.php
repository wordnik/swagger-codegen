<?php
/**
 * EnumTest
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
 * Swagger Codegen version: 2.4.27-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * EnumTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class EnumTest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Enum_Test';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'enum_string' => 'string',
        'enum_string_required' => 'string',
        'enum_integer' => 'int',
        'enum_number' => 'double',
        'outer_enum' => '\Swagger\Client\Model\OuterEnum'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'enum_string' => null,
        'enum_string_required' => null,
        'enum_integer' => 'int32',
        'enum_number' => 'double',
        'outer_enum' => null
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
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'enum_string' => 'enum_string',
        'enum_string_required' => 'enum_string_required',
        'enum_integer' => 'enum_integer',
        'enum_number' => 'enum_number',
        'outer_enum' => 'outerEnum'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'enum_string' => 'setEnumString',
        'enum_string_required' => 'setEnumStringRequired',
        'enum_integer' => 'setEnumInteger',
        'enum_number' => 'setEnumNumber',
        'outer_enum' => 'setOuterEnum'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'enum_string' => 'getEnumString',
        'enum_string_required' => 'getEnumStringRequired',
        'enum_integer' => 'getEnumInteger',
        'enum_number' => 'getEnumNumber',
        'outer_enum' => 'getOuterEnum'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
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

    const ENUM_STRING_UPPER = 'UPPER';
    const ENUM_STRING_LOWER = 'lower';
    const ENUM_STRING_EMPTY = '';
    const ENUM_STRING_REQUIRED_UPPER = 'UPPER';
    const ENUM_STRING_REQUIRED_LOWER = 'lower';
    const ENUM_STRING_REQUIRED_EMPTY = '';
    const ENUM_INTEGER_1 = 1;
    const ENUM_INTEGER_MINUS_1 = -1;
    const ENUM_NUMBER_1_DOT_1 = 1.1;
    const ENUM_NUMBER_MINUS_1_DOT_2 = -1.2;
    

    
    /**
     * Gets allowable values of the enum
     *
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
     *
     * @return string[]
     */
    public function getEnumStringRequiredAllowableValues()
    {
        return [
            self::ENUM_STRING_REQUIRED_UPPER,
            self::ENUM_STRING_REQUIRED_LOWER,
            self::ENUM_STRING_REQUIRED_EMPTY,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
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
     *
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
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['enum_string'] = isset($data['enum_string']) ? $data['enum_string'] : null;
        $this->container['enum_string_required'] = isset($data['enum_string_required']) ? $data['enum_string_required'] : null;
        $this->container['enum_integer'] = isset($data['enum_integer']) ? $data['enum_integer'] : null;
        $this->container['enum_number'] = isset($data['enum_number']) ? $data['enum_number'] : null;
        $this->container['outer_enum'] = isset($data['outer_enum']) ? $data['outer_enum'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getEnumStringAllowableValues();
        if (!is_null($this->container['enum_string']) && !in_array($this->container['enum_string'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'enum_string', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['enum_string_required'] === null) {
            $invalidProperties[] = "'enum_string_required' can't be null";
        }
        $allowedValues = $this->getEnumStringRequiredAllowableValues();
        if (!is_null($this->container['enum_string_required']) && !in_array($this->container['enum_string_required'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'enum_string_required', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getEnumIntegerAllowableValues();
        if (!is_null($this->container['enum_integer']) && !in_array($this->container['enum_integer'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'enum_integer', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getEnumNumberAllowableValues();
        if (!is_null($this->container['enum_number']) && !in_array($this->container['enum_number'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'enum_number', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets enum_string
     *
     * @return string
     */
    public function getEnumString()
    {
        return $this->container['enum_string'];
    }

    /**
     * Sets enum_string
     *
     * @param string $enum_string enum_string
     *
     * @return $this
     */
    public function setEnumString($enum_string)
    {
        $allowedValues = $this->getEnumStringAllowableValues();
        if (!is_null($enum_string) && !in_array($enum_string, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'enum_string', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['enum_string'] = $enum_string;

        return $this;
    }

    /**
     * Gets enum_string_required
     *
     * @return string
     */
    public function getEnumStringRequired()
    {
        return $this->container['enum_string_required'];
    }

    /**
     * Sets enum_string_required
     *
     * @param string $enum_string_required enum_string_required
     *
     * @return $this
     */
    public function setEnumStringRequired($enum_string_required)
    {
        $allowedValues = $this->getEnumStringRequiredAllowableValues();
        if (!in_array($enum_string_required, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'enum_string_required', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['enum_string_required'] = $enum_string_required;

        return $this;
    }

    /**
     * Gets enum_integer
     *
     * @return int
     */
    public function getEnumInteger()
    {
        return $this->container['enum_integer'];
    }

    /**
     * Sets enum_integer
     *
     * @param int $enum_integer enum_integer
     *
     * @return $this
     */
    public function setEnumInteger($enum_integer)
    {
        $allowedValues = $this->getEnumIntegerAllowableValues();
        if (!is_null($enum_integer) && !in_array($enum_integer, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'enum_integer', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['enum_integer'] = $enum_integer;

        return $this;
    }

    /**
     * Gets enum_number
     *
     * @return double
     */
    public function getEnumNumber()
    {
        return $this->container['enum_number'];
    }

    /**
     * Sets enum_number
     *
     * @param double $enum_number enum_number
     *
     * @return $this
     */
    public function setEnumNumber($enum_number)
    {
        $allowedValues = $this->getEnumNumberAllowableValues();
        if (!is_null($enum_number) && !in_array($enum_number, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'enum_number', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['enum_number'] = $enum_number;

        return $this;
    }

    /**
     * Gets outer_enum
     *
     * @return \Swagger\Client\Model\OuterEnum
     */
    public function getOuterEnum()
    {
        return $this->container['outer_enum'];
    }

    /**
     * Sets outer_enum
     *
     * @param \Swagger\Client\Model\OuterEnum $outer_enum outer_enum
     *
     * @return $this
     */
    public function setOuterEnum($outer_enum)
    {
        $this->container['outer_enum'] = $outer_enum;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
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
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


