/* tslint:disable */
/**
 * Swagger Petstore *_/ ' \" =end -- \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
 * Contact: apiteam@swagger.io *_/ ' \" =end -- \\r\\n \\n \\r
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

export class FakeApi {

    protected basePath = 'https://petstore.swagger.io *_/ ' \" =end -- \\r\\n \\n \\r/v2 *_/ ' \" =end -- \\r\\n \\n \\r';
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
     * @summary To test code injection *_/ ' \" =end -- \\r\\n \\n \\r
     * @param test code inject * &#39; &quot; &#x3D;end  rn n r To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     */
    public testCodeInjectEndRnNR(test code inject * &#39; &quot; &#x3D;end  rn n r?: string, extraRequestOptions?: any): Promise<{}> {
        return this.testCodeInjectEndRnNRWithHttpInfo(test code inject * &#39; &quot; &#x3D;end  rn n r, extraRequestOptions)
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
     * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     * 
     * @param test code inject * &#39; &quot; &#x3D;end  rn n r To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     */
    public testCodeInjectEndRnNRWithHttpInfo(test code inject * &#39; &quot; &#x3D;end  rn n r?: string, extraRequestOptions?: any): Promise<Response> {
        const path = '/fake';

        const urlObj = new url.URL(path, this.basePath);
        const headers = new Headers(this.defaultHeaders);
        const formParams = new FormData();

        // to determine the Content-Type header
        let consumes = [
            'application/json',
            '*_/   =end --       '
        ] as string[];

        // to determine the Accept header
        let produces = [
            'application/json',
            '*_/   =end --       '
        ] as string[];

        headers.set('Content-Type', 'application/x-www-form-urlencoded');

        if (test code inject * &#39; &quot; &#x3D;end  rn n r !== undefined) {
            formParams.set('test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r', test code inject * &#39; &quot; &#x3D;end  rn n r as any);
        }

        let requestOptions = {
            method: 'PUT',
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
