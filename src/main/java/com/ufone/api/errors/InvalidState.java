package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

import com.ufone.api.request.Request;
import java.io.UnsupportedEncodingException;

public class InvalidState extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "RECOMMENDED parameter state is invalid";
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
                InvalidState errorResponse = new InvalidState();
                baseResponse = errorResponse.buildBaseErrorResponse(request.getState());
                baseResponse = errorResponse.addStateQueryParam(baseResponse, request.getState());
                return errorResponse.returnResponse(baseResponse);
        }
}
