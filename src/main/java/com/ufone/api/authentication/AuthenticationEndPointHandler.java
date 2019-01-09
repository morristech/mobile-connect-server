// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.authentication;

import com.google.gson.Gson;
import com.ufone.api.authentication.AuthenticationMethods;
import com.ufone.api.authentication.UserAuthenticationHandler;
import com.ufone.api.errors.MissingClientID;
import com.ufone.api.errors.MissingScope;
import com.ufone.api.request.Request;
import com.ufone.api.validation.RequestValidation;
import com.ufone.api.exceptions.MissingClientIDException;
import com.ufone.api.exceptions.MissingScopeException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/*
 * This is the authentication endpoint handler. This class is responsible for calling all
 * relevant classes and returning an appropriate response raised by the called classes.
 */
@Path("/")
public class AuthenticationEndPointHandler {
        @GET
        @Path("authorize")
        @Produces(MediaType.APPLICATION_FORM_URLENCODED)
        public Response ReturnParam(@QueryParam("client_id") String clientID,
            @QueryParam("redirect_uri") String redirectURI,
            @QueryParam("response_type") String responseType, @QueryParam("scope") String scope,
            @QueryParam("version") String version, @QueryParam("state") String state,
            @QueryParam("nonce") String nonce, @QueryParam("display") String display,
            @QueryParam("prompt") String prompt, @QueryParam("max_age") String maxAge,
            @QueryParam("ui_locales") String uiLocales,
            @QueryParam("claims_locales") String claimsLocales,
            @QueryParam("id_token_hint") String idTokenHint,
            @QueryParam("login_hint") String loginHint,
            @QueryParam("login_hint_token") String loginHintToken,
            @QueryParam("acr_values") String acrValues,
            @QueryParam("response_mode") String responseMode,
            @QueryParam("correlation_id") String correlationID, @QueryParam("dtbs") String dtbs)
            throws UnsupportedEncodingException, MissingClientIDException {
                // These are error response variables
                final String baseResponse;
                final String baseResponseWithState;
                // Create a request object
                Request request =
                    new Request(clientID, redirectURI, responseType, scope, version, state, nonce)
                        .display(display)
                        .prompt(prompt)
                        .maxAge(maxAge)
                        .uiLocales(uiLocales)
                        .claimsLocales(claimsLocales)
                        .idTokenHint(idTokenHint)
                        .loginHintToken(loginHintToken)
                        .acrValues(acrValues)
                        .responseMode(responseMode)
                        .correlationID(correlationID)
                        .dtbs(dtbs)
                        .build();
                // Call Request Validator to validate request and throw appropriate exception if

                try {
                        RequestValidation requestValidation = new RequestValidation();
                        requestValidation.mandatoryParametersNull(request);
                        return Response.status(200).entity("Normal").build();
                } catch (MissingClientIDException missingClientID) {
                        MissingClientID errorResponse = new MissingClientID();
                        return errorResponse.buildAndReturnResponse(request);
                } catch (MissingScopeException missingScope) {
                        MissingScope errorResponse = new MissingScope();
                        return errorResponse.buildAndReturnResponse(request);
                }
        }
}
