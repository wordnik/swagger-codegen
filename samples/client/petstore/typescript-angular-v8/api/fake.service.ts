/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { Client } from '../model/client';
import { EnumFormBody } from '../model/enumFormBody';
import { FakeBody } from '../model/fakeBody';
import { FakeBody1 } from '../model/fakeBody1';
import { FakeJsonFormDataBody } from '../model/fakeJsonFormDataBody';
import { OuterBoolean } from '../model/outerBoolean';
import { OuterComposite } from '../model/outerComposite';
import { OuterNumber } from '../model/outerNumber';
import { OuterString } from '../model/outerString';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class FakeService {

    protected basePath = 'http://petstore.swagger.io:80/v2';
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
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * 
     * Test serialization of outer boolean types
     * @param body Input boolean as post body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fakeOuterBooleanSerialize(body?: boolean, observe?: 'body', reportProgress?: boolean): Observable<OuterBoolean>;
    public fakeOuterBooleanSerialize(body?: boolean, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<OuterBoolean>>;
    public fakeOuterBooleanSerialize(body?: boolean, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<OuterBoolean>>;
    public fakeOuterBooleanSerialize(body?: boolean, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<OuterBoolean>('post',`${this.basePath}/fake/outer/boolean`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * Test serialization of object with outer number type
     * @param body Input composite as post body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fakeOuterCompositeSerialize(body?: OuterComposite, observe?: 'body', reportProgress?: boolean): Observable<OuterComposite>;
    public fakeOuterCompositeSerialize(body?: OuterComposite, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<OuterComposite>>;
    public fakeOuterCompositeSerialize(body?: OuterComposite, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<OuterComposite>>;
    public fakeOuterCompositeSerialize(body?: OuterComposite, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<OuterComposite>('post',`${this.basePath}/fake/outer/composite`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * Test serialization of outer number types
     * @param body Input number as post body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fakeOuterNumberSerialize(body?: number, observe?: 'body', reportProgress?: boolean): Observable<OuterNumber>;
    public fakeOuterNumberSerialize(body?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<OuterNumber>>;
    public fakeOuterNumberSerialize(body?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<OuterNumber>>;
    public fakeOuterNumberSerialize(body?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<OuterNumber>('post',`${this.basePath}/fake/outer/number`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * Test serialization of outer string types
     * @param body Input string as post body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public fakeOuterStringSerialize(body?: string, observe?: 'body', reportProgress?: boolean): Observable<OuterString>;
    public fakeOuterStringSerialize(body?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<OuterString>>;
    public fakeOuterStringSerialize(body?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<OuterString>>;
    public fakeOuterStringSerialize(body?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<OuterString>('post',`${this.basePath}/fake/outer/string`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * @param body client model
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testClientModel(body: Client, observe?: 'body', reportProgress?: boolean): Observable<Client>;
    public testClientModel(body: Client, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Client>>;
    public testClientModel(body: Client, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Client>>;
    public testClientModel(body: Client, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling testClientModel.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<Client>('patch',`${this.basePath}/fake`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * @param body 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testEndpointParameters(body: FakeBody, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public testEndpointParameters(body: FakeBody, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public testEndpointParameters(body: FakeBody, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public testEndpointParameters(body: FakeBody, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling testEndpointParameters.');
        }

        let headers = this.defaultHeaders;

        // authentication (http_basic_test) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/xml; charset=utf-8',
            'application/json; charset=utf-8'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/fake`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * @param enumHeaderStringArray Header parameter enum test (string array)
     * @param enumHeaderString Header parameter enum test (string)
     * @param enumQueryStringArray Query parameter enum test (string array)
     * @param enumQueryString Query parameter enum test (string)
     * @param enumQueryInteger Query parameter enum test (double)
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testEnumParameters(enumHeaderStringArray?: Array<string>, enumHeaderString?: string, enumQueryStringArray?: Array<string>, enumQueryString?: string, enumQueryInteger?: number, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public testEnumParameters(enumHeaderStringArray?: Array<string>, enumHeaderString?: string, enumQueryStringArray?: Array<string>, enumQueryString?: string, enumQueryInteger?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public testEnumParameters(enumHeaderStringArray?: Array<string>, enumHeaderString?: string, enumQueryStringArray?: Array<string>, enumQueryString?: string, enumQueryInteger?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public testEnumParameters(enumHeaderStringArray?: Array<string>, enumHeaderString?: string, enumQueryStringArray?: Array<string>, enumQueryString?: string, enumQueryInteger?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {






        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (enumQueryStringArray) {
            queryParameters = queryParameters.set('enum_query_string_array', enumQueryStringArray.join(COLLECTION_FORMATS['csv']));
        }
        if (enumQueryString !== undefined && enumQueryString !== null) {
            queryParameters = queryParameters.set('enum_query_string', <any>enumQueryString);
        }
        if (enumQueryInteger !== undefined && enumQueryInteger !== null) {
            queryParameters = queryParameters.set('enum_query_integer', <any>enumQueryInteger);
        }

        let headers = this.defaultHeaders;
        if (enumHeaderStringArray) {
            headers = headers.set('enum_header_string_array', enumHeaderStringArray.join(COLLECTION_FORMATS['']));
        }
        if (enumHeaderString !== undefined && enumHeaderString !== null) {
            headers = headers.set('enum_header_string', String(enumHeaderString));
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<any>('get',`${this.basePath}/fake`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * @param body 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testEnumRequestBody(body?: EnumFormBody, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public testEnumRequestBody(body?: EnumFormBody, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public testEnumRequestBody(body?: EnumFormBody, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public testEnumRequestBody(body?: EnumFormBody, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {


        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            '*/*'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/fake/enum/form`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * test inline additionalProperties
     * 
     * @param body request body
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testInlineAdditionalProperties(body: { [key: string]: string; }, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public testInlineAdditionalProperties(body: { [key: string]: string; }, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public testInlineAdditionalProperties(body: { [key: string]: string; }, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public testInlineAdditionalProperties(body: { [key: string]: string; }, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling testInlineAdditionalProperties.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/fake/inline-additionalProperties`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * test json serialization of form data
     * 
     * @param body 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public testJsonFormData(body: FakeJsonFormDataBody, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public testJsonFormData(body: FakeJsonFormDataBody, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public testJsonFormData(body: FakeJsonFormDataBody, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public testJsonFormData(body: FakeJsonFormDataBody, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling testJsonFormData.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.request<any>('post',`${this.basePath}/fake/jsonFormData`,
            {
                body: body,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
