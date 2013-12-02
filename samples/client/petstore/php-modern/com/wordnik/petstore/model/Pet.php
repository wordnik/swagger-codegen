<?php
/**
 *  Copyright 2011 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
namespace com\wordnik\petstore\model;

/**
 * $model.description$
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
class Pet {

	public static $swaggerTypes = array(
		'id' => 'int',
		'category' => 'Category',
		'name' => 'string',
		'photoUrls' => 'array[string]',
		'tags' => 'array[Tag]',
		'status' => 'string'

	);

	/**
	* Unique identifier for the Pet
	*
	 * @var int
	 */
	public $id;
	

	/**
	* Category the pet is in
	*
	 * @var Category
	 */
	public $category;
	

	/**
	* Friendly name of the pet
	*
	 * @var string
	 */
	public $name;
	

	/**
	* Image URLs
	*
	 * @var array[string]
	 */
	public $photoUrls;
	

	/**
	* Tags assigned to this pet
	*
	 * @var array[Tag]
	 */
	public $tags;
	

	/**
	* pet status in the store
	*
	 * @var string
	 */
	public $status;
	

	}

