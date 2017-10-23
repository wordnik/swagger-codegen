/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { Category } from './category';
import { Tag } from './tag';


/**
 * A pet for sale in the pet store
 */
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
    export type StatusEnum = 'available' | 'pending' | 'sold';
}
