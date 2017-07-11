/* tslint:disable */
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

import * as IsomorphicFetch                                  from 'isomorphic-fetch';
import * as url                                              from 'url';
import * as models                                           from '../model/models';
import { COLLECTION_FORMATS }                                from '../variables';
import { Configuration }                                     from '../configuration';
import { PetApiInterface }                            from './PetApiInterface';

export class PetApi implements PetApiInterface {

    protected basePath = 'http://petstore.swagger.io/v2';
    public defaultHeaders: Headers = new Headers();
    public configuration: Configuration = new Configuration();

    constructor(protected isomorphicFetch = IsomorphicFetch, basePath?: string, configuration?: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
    }

    /**
     * 
     * @summary Add a new pet to the store
     * @param body Pet object that needs to be added to the store
     */
    public addPet(body: models.Pet, extraRequestOptions?: any): Promise<{}> {
        return this.addPetWithHttpInfo(body, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * 
     * @summary Deletes a pet
     * @param petId Pet id to delete
     * @param apiKey 
     */
    public deletePet(petId: number, apiKey?: string, extraRequestOptions?: any): Promise<{}> {
        return this.deletePetWithHttpInfo(petId, apiKey, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * Multiple status values can be provided with comma separated strings
     * @summary Finds Pets by status
     * @param status Status values that need to be considered for filter
     */
    public findPetsByStatus(status: Array<string>, extraRequestOptions?: any): Promise<Array<models.Pet>> {
        return this.findPetsByStatusWithHttpInfo(status, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @summary Finds Pets by tags
     * @param tags Tags to filter by
     */
    public findPetsByTags(tags: Array<string>, extraRequestOptions?: any): Promise<Array<models.Pet>> {
        return this.findPetsByTagsWithHttpInfo(tags, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * Returns a single pet
     * @summary Find pet by ID
     * @param petId ID of pet to return
     */
    public getPetById(petId: number, extraRequestOptions?: any): Promise<models.Pet> {
        return this.getPetByIdWithHttpInfo(petId, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * 
     * @summary Update an existing pet
     * @param body Pet object that needs to be added to the store
     */
    public updatePet(body: models.Pet, extraRequestOptions?: any): Promise<{}> {
        return this.updatePetWithHttpInfo(body, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * 
     * @summary Updates a pet in the store with form data
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     */
    public updatePetWithForm(petId: number, name?: string, status?: string, extraRequestOptions?: any): Promise<{}> {
        return this.updatePetWithFormWithHttpInfo(petId, name, status, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }

    /**
     * 
     * @summary uploads an image
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param file file to upload
     */
    public uploadFile(petId: number, additionalMetadata?: string, file?: any, extraRequestOptions?: any): Promise<models.ApiResponse> {
        return this.uploadFileWithHttpInfo(petId, additionalMetadata, file, extraRequestOptions)
            .then((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else if (response.status >= 200 && response.status < 300) {
                    return response.json() || {} as any;
                } else {
                    throw response;
                }
            });
    }


    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store
     */
    public addPetWithHttpInfo(body: models.Pet, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet';

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling addPet.');
        }
        // to determine the Content-Type header
        let consumes = [
            'application/json',
            'application/xml'
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        headers.set('Content-Type', 'application/json');

        let requestOptions = {
            method: 'POST',
            headers: headers,
            body: body == null ? '' : JSON.stringify(body),
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete
     * @param apiKey 
     */
    public deletePetWithHttpInfo(petId: number, apiKey?: string, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/{petId}'
                    .replace('${' + 'petId' + '}', String(petId));

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling deletePet.');
        }
        if (apiKey !== undefined && apiKey !== null) {
            headers.set('api_key', String(apiKey));
        }

        // to determine the Content-Type header
        let consumes = [
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        let requestOptions = {
            method: 'DELETE',
            headers: headers,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter
     */
    public findPetsByStatusWithHttpInfo(status: Array<string>, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/findByStatus';

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'status' is not null or undefined
        if (status === null || status === undefined) {
            throw new Error('Required parameter status was null or undefined when calling findPetsByStatus.');
        }
        if (status) {
            urlObj.searchParams.set('status', status.join(COLLECTION_FORMATS['csv']));
        }
        // to determine the Content-Type header
        let consumes = [
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        let requestOptions = {
            method: 'GET',
            headers: headers,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by
     */
    public findPetsByTagsWithHttpInfo(tags: Array<string>, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/findByTags';

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'tags' is not null or undefined
        if (tags === null || tags === undefined) {
            throw new Error('Required parameter tags was null or undefined when calling findPetsByTags.');
        }
        if (tags) {
            urlObj.searchParams.set('tags', tags.join(COLLECTION_FORMATS['csv']));
        }
        // to determine the Content-Type header
        let consumes = [
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        let requestOptions = {
            method: 'GET',
            headers: headers,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return
     */
    public getPetByIdWithHttpInfo(petId: number, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/{petId}'
                    .replace('${' + 'petId' + '}', String(petId));

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling getPetById.');
        }
        // to determine the Content-Type header
        let consumes = [
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (api_key) required
        if (this.configuration.apiKey) {
            headers.set('api_key', this.configuration.apiKey);
        }

        let requestOptions = {
            method: 'GET',
            headers: headers,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store
     */
    public updatePetWithHttpInfo(body: models.Pet, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet';

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling updatePet.');
        }
        // to determine the Content-Type header
        let consumes = [
            'application/json',
            'application/xml'
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        headers.set('Content-Type', 'application/json');

        let requestOptions = {
            method: 'PUT',
            headers: headers,
            body: body == null ? '' : JSON.stringify(body),
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     */
    public updatePetWithFormWithHttpInfo(petId: number, name?: string, status?: string, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/{petId}'
                    .replace('${' + 'petId' + '}', String(petId));

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        const formParams = new FormData();

        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling updatePetWithForm.');
        }
        // to determine the Content-Type header
        let consumes = [
            'application/x-www-form-urlencoded'
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/xml',
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        headers.set('Content-Type', 'application/x-www-form-urlencoded');

        if (name !== undefined) {
            formParams.set('name', name as any);
        }

        if (status !== undefined) {
            formParams.set('status', status as any);
        }

        let requestOptions = {
            method: 'POST',
            headers: headers,
            body: formParams,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param file file to upload
     */
    public uploadFileWithHttpInfo(petId: number, additionalMetadata?: string, file?: any, extraRequestOptions?: any): Promise<Response> {
        const path = '/pet/{petId}/uploadImage'
                    .replace('${' + 'petId' + '}', String(petId));

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        const formParams = new FormData();

        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling uploadFile.');
        }
        // to determine the Content-Type header
        let consumes = [
            'multipart/form-data'
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/json'
        ] as string[];

        // authentication (petstore_auth) required
        // oauth required
        if (this.configuration.accessToken) {
            let accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers.set('Authorization', 'Bearer ' + accessToken);
        }

        headers.set('Content-Type', 'application/x-www-form-urlencoded');

        if (additionalMetadata !== undefined) {
            formParams.set('additionalMetadata', additionalMetadata as any);
        }

        if (file !== undefined) {
            formParams.set('file', file as any);
        }

        let requestOptions = {
            method: 'POST',
            headers: headers,
            body: formParams,
        } as RequestInit;
        // https://github.com/swagger-api/swagger-codegen/issues/4037
        if (extraRequestOptions) {
            requestOptions = Object.assign(requestOptions, extraRequestOptions);
        }
        return this.isomorphicFetch(url.format(urlObj), requestOptions);
    }

}
