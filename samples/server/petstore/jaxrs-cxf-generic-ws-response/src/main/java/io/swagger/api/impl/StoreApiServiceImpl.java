package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.Map;
import io.swagger.model.Order;

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

public class StoreApiServiceImpl implements StoreApi {
    public Response deleteOrder(String orderId) {
        // TODO: Implement...
        
        
    }
    
    public Response getInventory() {
        // TODO: Implement...
        
        return null;
    }
    
    public Response getOrderById(Long orderId) {
        // TODO: Implement...
        
        return null;
    }
    
    public Response placeOrder(Order body) {
        // TODO: Implement...
        
        return null;
    }
    
}

