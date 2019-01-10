// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.discovery;

import com.ufone.api.discovery.DiscoveryConfiguration;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/*
 * This is the openid-configuration endpoint. It returns an application/json response containing
 * Operator endpoints and supported configurations.
 */
@Path("/.well-known")
public class DiscoveryEndpoint {
        /*
         * Returns application/json containing Operator configurations.
         */
        @GET
        @Path("openid-configuration")
        @Produces(MediaType.APPLICATION_JSON)
        public Response ReturnParam() {
                try {
                        return Response.status(200)
                            .entity(DiscoveryConfiguration.getResponseAsString())
                            .header("Cache-Control", "public, max-age=3600")
                            .header("X-Content-Type-Options", "nosniff")
                            .header("X-XSS-Protection", "1; mode=block")
                            .header("Accept-Ranges", "bytes")
                            .build();
                } catch (Exception e) {
                        return Response.status(400).entity("wut").build();
                }
        }
}
