package io.swagger.api.factories;

import io.swagger.api.UserApiService;
import io.swagger.api.impl.UserApiServiceImpl;


public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    private UserApiServiceFactory(){
    // private constructor because singleton
    }

    public static UserApiService getUserApi() {
        return service;
    }
}
