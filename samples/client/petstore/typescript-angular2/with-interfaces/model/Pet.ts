/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import { Category } from './category';
import { Tag } from './tag';


export interface Pet {
    id?: number;

    category?: Category;

    name: string;

    photoUrls: Array<string>;

    tags?: Array<Tag>;

    /**
     * pet status in the store
     */
    status?: Pet.StatusEnum;

}
export namespace Pet {
    export enum StatusEnum {
        Available = <any> 'available',
        Pending = <any> 'pending',
        Sold = <any> 'sold'
    }
}
