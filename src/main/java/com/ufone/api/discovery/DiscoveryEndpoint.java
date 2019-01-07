// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.discovery;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import com.ufone.api.discovery.DiscoveryConfiguration;
import com.ufone.api.util.ErrorResponse;

import com.google.gson.Gson;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

@Path("/.well-known")
public class DiscoveryEndpoint {
        @GET
        @Path("openid-configuration")
        @Produces(MediaType.APPLICATION_JSON)
        public Response ReturnParam() {
                try {
                        return Response.status(200).entity(DiscoveryConfiguration.getResponseAsString())
                                        .header("Cache-Control", "public, max-age=3600")
                                        .header("X-Content-Type-Options", "nosniff")
                                        .header("X-XSS-Protection", "1; mode=block").header("Accept-Ranges", "bytes")
                                        .build();
                } catch (Exception e) {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse();
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                }
        }
}
