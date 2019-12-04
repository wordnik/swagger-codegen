package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FakeClassnameTags123ApiService;
import io.swagger.api.factories.FakeClassnameTags123ApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Client;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/fake_classname_test")



public class FakeClassnameTags123Api  {
   private final FakeClassnameTags123ApiService delegate;

   public FakeClassnameTags123Api(@Context ServletConfig servletContext) {
      FakeClassnameTags123ApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FakeClassnameTags123Api.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FakeClassnameTags123ApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FakeClassnameTags123ApiServiceFactory.getFakeClassnameTags123Api();
      }

      this.delegate = delegate;
   }

    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "To test class name in snake case", description = "", security = {
        @SecurityRequirement(name = "api_key_query")    }, tags={ "fake_classname_tags 123#$%^" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Client.class))) })
    public Response testClassname(@Parameter(ParameterIn.DEFAULT, description = "client model" ,required=true) Client body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.testClassname(body,securityContext);
    }
}
