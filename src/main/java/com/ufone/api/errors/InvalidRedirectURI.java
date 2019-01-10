package com.ufone.api.errors;

import com.ufone.api.errors.BaseErrorResponse;

import javax.ws.rs.core.Response;

import com.ufone.api.request.Request;
import java.io.UnsupportedEncodingException;

public class InvalidRedirectURI extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "redirect_uri is invalid";
        private String baseResponse;

        @Override
        public Response returnResponse(String errorResponseURL) {
                return Response.status(400).header("Location", errorResponseURL).build();
        }

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }

        public Response buildAndReturnResponse(Request request)
            throws UnsupportedEncodingException {
                InvalidRedirectURI errorResponse = new InvalidRedirectURI();
                return errorResponse.returnResponse(baseResponse);
        }
}
