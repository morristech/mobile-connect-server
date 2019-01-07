package com.ufone.api.authentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import com.ufone.api.util.ErrorResponse;

@Path("/")
public class AuthenticationEndPointHandler {
        @GET
        @Path("authorize")
        @Produces(MediaType.APPLICATION_JSON)
        public Response ReturnParam(@QueryParam("response_type") String response_type,
                        @QueryParam("scope") String scope, @QueryParam("client_id") String client_id,
                        @QueryParam("redirect_uri") String redirect_uri, @QueryParam("state") String state) {

                if (response_type != null && client_id != null && redirect_uri != null && scope != null) {
                        try {
                                // TODO: request & client validation logic?
                                Gson json_test = new Gson();
                                String test = json_test.toJson("Initiate Authentication");
                                return Response.status(302).entity(test).build();
                        } catch (Exception serverError) {
                                Gson jsonResponse = new Gson();
                                ErrorResponse errorResponse = new ErrorResponse("server Error",
                                                "something went wrong while processing request");
                                String responseBody = jsonResponse.toJson(errorResponse);
                                return Response.status(400).entity(responseBody).build();
                        }
                        // TODO: create a function/class to find the error and create appropriate
                        // response
                } else if (response_type == null) {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse("invalid_request", "response_type is invalid");
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                } else if (scope == null) {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse("invalid_request", "scope is invalid");
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                } else if (client_id == null) {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse("invalid_request", "client_id is invalid");
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                } else if (redirect_uri == null) {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse("invalid_request", "redirect_uri is invalid");
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                } else {
                        Gson jsonResponse = new Gson();
                        ErrorResponse errorResponse = new ErrorResponse("something went wrong",
                                        "request might be invalid");
                        String responseBody = jsonResponse.toJson(errorResponse);
                        return Response.status(400).entity(responseBody).build();
                }
        }
}
