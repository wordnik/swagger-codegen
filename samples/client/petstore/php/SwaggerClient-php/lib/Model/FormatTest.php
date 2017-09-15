<?php
/**
 * FormatTest
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
use \Swagger\Client\ObjectSerializer;

/**
 * FormatTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FormatTest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'format_test';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'integer' => 'int',
        'int32' => 'int',
        'int64' => 'int',
        'number' => 'float',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'string',
        'binary' => 'string',
        'date' => '\DateTime',
        'date_time' => '\DateTime',
        'uuid' => 'string',
        'password' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'integer' => null,
        'int32' => 'int32',
        'int64' => 'int64',
        'number' => null,
        'float' => 'float',
        'double' => 'double',
        'string' => null,
        'byte' => 'byte',
        'binary' => 'binary',
        'date' => 'date',
        'date_time' => 'date-time',
        'uuid' => 'uuid',
        'password' => 'password'
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
        'integer' => 'integer',
        'int32' => 'int32',
        'int64' => 'int64',
        'number' => 'number',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'byte',
        'binary' => 'binary',
        'date' => 'date',
        'date_time' => 'dateTime',
        'uuid' => 'uuid',
        'password' => 'password'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'integer' => 'setInteger',
        'int32' => 'setInt32',
        'int64' => 'setInt64',
        'number' => 'setNumber',
        'float' => 'setFloat',
        'double' => 'setDouble',
        'string' => 'setString',
        'byte' => 'setByte',
        'binary' => 'setBinary',
        'date' => 'setDate',
        'date_time' => 'setDateTime',
        'uuid' => 'setUuid',
        'password' => 'setPassword'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'integer' => 'getInteger',
        'int32' => 'getInt32',
        'int64' => 'getInt64',
        'number' => 'getNumber',
        'float' => 'getFloat',
        'double' => 'getDouble',
        'string' => 'getString',
        'byte' => 'getByte',
        'binary' => 'getBinary',
        'date' => 'getDate',
        'date_time' => 'getDateTime',
        'uuid' => 'getUuid',
        'password' => 'getPassword'
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
        $this->container['integer'] = isset($data['integer']) ? $data['integer'] : null;
        $this->container['int32'] = isset($data['int32']) ? $data['int32'] : null;
        $this->container['int64'] = isset($data['int64']) ? $data['int64'] : null;
        $this->container['number'] = isset($data['number']) ? $data['number'] : null;
        $this->container['float'] = isset($data['float']) ? $data['float'] : null;
        $this->container['double'] = isset($data['double']) ? $data['double'] : null;
        $this->container['string'] = isset($data['string']) ? $data['string'] : null;
        $this->container['byte'] = isset($data['byte']) ? $data['byte'] : null;
        $this->container['binary'] = isset($data['binary']) ? $data['binary'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['date_time'] = isset($data['date_time']) ? $data['date_time'] : null;
        $this->container['uuid'] = isset($data['uuid']) ? $data['uuid'] : null;
        $this->container['password'] = isset($data['password']) ? $data['password'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['integer']) && ($this->container['integer'] > 100)) {
            $invalidProperties[] = "invalid value for 'integer', must be smaller than or equal to 100.";
        }

        if (!is_null($this->container['integer']) && ($this->container['integer'] < 10)) {
            $invalidProperties[] = "invalid value for 'integer', must be bigger than or equal to 10.";
        }

        if (!is_null($this->container['int32']) && ($this->container['int32'] > 200)) {
            $invalidProperties[] = "invalid value for 'int32', must be smaller than or equal to 200.";
        }

        if (!is_null($this->container['int32']) && ($this->container['int32'] < 20)) {
            $invalidProperties[] = "invalid value for 'int32', must be bigger than or equal to 20.";
        }

        if ($this->container['number'] === null) {
            $invalidProperties[] = "'number' can't be null";
        }
        if (($this->container['number'] > 543.2)) {
            $invalidProperties[] = "invalid value for 'number', must be smaller than or equal to 543.2.";
        }

        if (($this->container['number'] < 32.1)) {
            $invalidProperties[] = "invalid value for 'number', must be bigger than or equal to 32.1.";
        }

        if (!is_null($this->container['float']) && ($this->container['float'] > 987.6)) {
            $invalidProperties[] = "invalid value for 'float', must be smaller than or equal to 987.6.";
        }

        if (!is_null($this->container['float']) && ($this->container['float'] < 54.3)) {
            $invalidProperties[] = "invalid value for 'float', must be bigger than or equal to 54.3.";
        }

        if (!is_null($this->container['double']) && ($this->container['double'] > 123.4)) {
            $invalidProperties[] = "invalid value for 'double', must be smaller than or equal to 123.4.";
        }

        if (!is_null($this->container['double']) && ($this->container['double'] < 67.8)) {
            $invalidProperties[] = "invalid value for 'double', must be bigger than or equal to 67.8.";
        }

        if (!is_null($this->container['string']) && !preg_match("/[a-z]/i", $this->container['string'])) {
            $invalidProperties[] = "invalid value for 'string', must be conform to the pattern /[a-z]/i.";
        }

        if ($this->container['byte'] === null) {
            $invalidProperties[] = "'byte' can't be null";
        }
        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['password'] === null) {
            $invalidProperties[] = "'password' can't be null";
        }
        if ((strlen($this->container['password']) > 64)) {
            $invalidProperties[] = "invalid value for 'password', the character length must be smaller than or equal to 64.";
        }

        if ((strlen($this->container['password']) < 10)) {
            $invalidProperties[] = "invalid value for 'password', the character length must be bigger than or equal to 10.";
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

        if ($this->container['integer'] > 100) {
            return false;
        }
        if ($this->container['integer'] < 10) {
            return false;
        }
        if ($this->container['int32'] > 200) {
            return false;
        }
        if ($this->container['int32'] < 20) {
            return false;
        }
        if ($this->container['number'] === null) {
            return false;
        }
        if ($this->container['number'] > 543.2) {
            return false;
        }
        if ($this->container['number'] < 32.1) {
            return false;
        }
        if ($this->container['float'] > 987.6) {
            return false;
        }
        if ($this->container['float'] < 54.3) {
            return false;
        }
        if ($this->container['double'] > 123.4) {
            return false;
        }
        if ($this->container['double'] < 67.8) {
            return false;
        }
        if (!preg_match("/[a-z]/i", $this->container['string'])) {
            return false;
        }
        if ($this->container['byte'] === null) {
            return false;
        }
        if ($this->container['date'] === null) {
            return false;
        }
        if ($this->container['password'] === null) {
            return false;
        }
        if (strlen($this->container['password']) > 64) {
            return false;
        }
        if (strlen($this->container['password']) < 10) {
            return false;
        }
        return true;
    }


    /**
     * Gets integer
     *
     * @return int
     */
    public function getInteger()
    {
        return $this->container['integer'];
    }

    /**
     * Sets integer
     *
     * @param int $integer
     *
     * @return $this
     */
    public function setInteger($integer)
    {

        if (!is_null($integer) && ($integer > 100)) {
            throw new \InvalidArgumentException('invalid value for $integer when calling FormatTest., must be smaller than or equal to 100.');
        }
        if (!is_null($integer) && ($integer < 10)) {
            throw new \InvalidArgumentException('invalid value for $integer when calling FormatTest., must be bigger than or equal to 10.');
        }

        $this->container['integer'] = $integer;

        return $this;
    }

    /**
     * Gets int32
     *
     * @return int
     */
    public function getInt32()
    {
        return $this->container['int32'];
    }

    /**
     * Sets int32
     *
     * @param int $int32
     *
     * @return $this
     */
    public function setInt32($int32)
    {

        if (!is_null($int32) && ($int32 > 200)) {
            throw new \InvalidArgumentException('invalid value for $int32 when calling FormatTest., must be smaller than or equal to 200.');
        }
        if (!is_null($int32) && ($int32 < 20)) {
            throw new \InvalidArgumentException('invalid value for $int32 when calling FormatTest., must be bigger than or equal to 20.');
        }

        $this->container['int32'] = $int32;

        return $this;
    }

    /**
     * Gets int64
     *
     * @return int
     */
    public function getInt64()
    {
        return $this->container['int64'];
    }

    /**
     * Sets int64
     *
     * @param int $int64
     *
     * @return $this
     */
    public function setInt64($int64)
    {
        $this->container['int64'] = $int64;

        return $this;
    }

    /**
     * Gets number
     *
     * @return float
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     *
     * @param float $number
     *
     * @return $this
     */
    public function setNumber($number)
    {

        if (($number > 543.2)) {
            throw new \InvalidArgumentException('invalid value for $number when calling FormatTest., must be smaller than or equal to 543.2.');
        }
        if (($number < 32.1)) {
            throw new \InvalidArgumentException('invalid value for $number when calling FormatTest., must be bigger than or equal to 32.1.');
        }

        $this->container['number'] = $number;

        return $this;
    }

    /**
     * Gets float
     *
     * @return float
     */
    public function getFloat()
    {
        return $this->container['float'];
    }

    /**
     * Sets float
     *
     * @param float $float
     *
     * @return $this
     */
    public function setFloat($float)
    {

        if (!is_null($float) && ($float > 987.6)) {
            throw new \InvalidArgumentException('invalid value for $float when calling FormatTest., must be smaller than or equal to 987.6.');
        }
        if (!is_null($float) && ($float < 54.3)) {
            throw new \InvalidArgumentException('invalid value for $float when calling FormatTest., must be bigger than or equal to 54.3.');
        }

        $this->container['float'] = $float;

        return $this;
    }

    /**
     * Gets double
     *
     * @return double
     */
    public function getDouble()
    {
        return $this->container['double'];
    }

    /**
     * Sets double
     *
     * @param double $double
     *
     * @return $this
     */
    public function setDouble($double)
    {

        if (!is_null($double) && ($double > 123.4)) {
            throw new \InvalidArgumentException('invalid value for $double when calling FormatTest., must be smaller than or equal to 123.4.');
        }
        if (!is_null($double) && ($double < 67.8)) {
            throw new \InvalidArgumentException('invalid value for $double when calling FormatTest., must be bigger than or equal to 67.8.');
        }

        $this->container['double'] = $double;

        return $this;
    }

    /**
     * Gets string
     *
     * @return string
     */
    public function getString()
    {
        return $this->container['string'];
    }

    /**
     * Sets string
     *
     * @param string $string
     *
     * @return $this
     */
    public function setString($string)
    {

        if (!is_null($string) && (!preg_match("/[a-z]/i", $string))) {
            throw new \InvalidArgumentException("invalid value for $string when calling FormatTest., must conform to the pattern /[a-z]/i.");
        }

        $this->container['string'] = $string;

        return $this;
    }

    /**
     * Gets byte
     *
     * @return string
     */
    public function getByte()
    {
        return $this->container['byte'];
    }

    /**
     * Sets byte
     *
     * @param string $byte
     *
     * @return $this
     */
    public function setByte($byte)
    {
        $this->container['byte'] = $byte;

        return $this;
    }

    /**
     * Gets binary
     *
     * @return string
     */
    public function getBinary()
    {
        return $this->container['binary'];
    }

    /**
     * Sets binary
     *
     * @param string $binary
     *
     * @return $this
     */
    public function setBinary($binary)
    {
        $this->container['binary'] = $binary;

        return $this;
    }

    /**
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets date_time
     *
     * @return \DateTime
     */
    public function getDateTime()
    {
        return $this->container['date_time'];
    }

    /**
     * Sets date_time
     *
     * @param \DateTime $date_time
     *
     * @return $this
     */
    public function setDateTime($date_time)
    {
        $this->container['date_time'] = $date_time;

        return $this;
    }

    /**
     * Gets uuid
     *
     * @return string
     */
    public function getUuid()
    {
        return $this->container['uuid'];
    }

    /**
     * Sets uuid
     *
     * @param string $uuid
     *
     * @return $this
     */
    public function setUuid($uuid)
    {
        $this->container['uuid'] = $uuid;

        return $this;
    }

    /**
     * Gets password
     *
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     *
     * @param string $password
     *
     * @return $this
     */
    public function setPassword($password)
    {
        if ((strlen($password) > 64)) {
            throw new \InvalidArgumentException('invalid length for $password when calling FormatTest., must be smaller than or equal to 64.');
        }
        if ((strlen($password) < 10)) {
            throw new \InvalidArgumentException('invalid length for $password when calling FormatTest., must be bigger than or equal to 10.');
        }

        $this->container['password'] = $password;

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


