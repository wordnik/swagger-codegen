package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.User;
import java.util.List;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class UserApiServiceImpl implements UserApi {
    public void  createUser(User body) {
        // TODO: Implement...
        
        
    }
    
    public void  createUsersWithArrayInput(List<User> body) {
        // TODO: Implement...
        
        
    }
    
    public void  createUsersWithListInput(List<User> body) {
        // TODO: Implement...
        
        
    }
    
    public void  deleteUser(@PathParam("username") String username) {
        // TODO: Implement...
        
        
    }
    
    public User  getUserByName(@PathParam("username") String username) {
        // TODO: Implement...
        
        return null;
    }
    
    public String  loginUser(String username, String password) {
        // TODO: Implement...
        
        return null;
    }
    
    public void  logoutUser() {
        // TODO: Implement...
        
        
    }
    
    public void  updateUser(@PathParam("username") String username, User body) {
        // TODO: Implement...
        
        
    }
    
}

