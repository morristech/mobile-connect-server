package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

import com.ufone.api.request.Request;
import java.io.UnsupportedEncodingException;

public class InvalidVersion extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "MANDATORY parameter version is missing / invalid.";
        private String baseResponse;

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
                InvalidVersion errorResponse = new InvalidVersion();
                baseResponse = errorResponse.buildBaseErrorResponse(request.getVersion());
                baseResponse = errorResponse.addStateQueryParam(baseResponse, request.getState());
                return errorResponse.returnResponse(baseResponse);
        }
}
