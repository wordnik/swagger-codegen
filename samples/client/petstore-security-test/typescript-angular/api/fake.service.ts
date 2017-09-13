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

/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams }               from '@angular/common/http';

import { Observable }                                        from 'rxjs/Observable';
import '../rxjs-operators';


import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';


@Injectable()
export class FakeService {

    protected basePath = 'https://petstore.swagger.io *_/ ' \" =end -- \\r\\n \\n \\r/v2 *_/ ' \" =end -- \\r\\n \\n \\r';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (let consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }



    /**
     * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     * 
     * @param test code inject * &#39; &quot; &#x3D;end  rn n r To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     */
    public testCodeInjectEndRnNR(test code inject * &#39; &quot; &#x3D;end  rn n r?: string): Observable<{}> {

        let headersObservable = Observable.of(this.defaultHeaders);

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json',
            '*_/   =end --       '
        ];
        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): void; };
        let useForm = false;
        let convertFormParamsToString = false;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }



        if (test code inject * &#39; &quot; &#x3D;end  rn n r !== undefined) {
            formParams = formParams.append('test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r', <any>test code inject * &#39; &quot; &#x3D;end  rn n r) || formParams;
        }

        return headersObservable.mergeMap((headers: HttpHeaders) => this.httpClient.put<any>(`${this.basePath}/fake`, 
          convertFormParamsToString ? formParams.toString() : formParams, {
            headers: headers,
            withCredentials: this.configuration.withCredentials,
        }));
    }

}
