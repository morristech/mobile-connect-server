package com.ufone.api.authentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/*
 * This class is responsible for redirecting the user to wait screen and initiating authentication
 */
public class UserAuthenticationHandler {
        private final String waitScreenURI = "https://localhost:8080/mobile_connect/wait";

        public Response redirectToWaitScreen() {
                return Response.status(200).entity("This is the wait screen").build();
        }
}
