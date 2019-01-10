package com.ufone.api.errors;

import javax.ws.rs.core.Response;
import com.ufone.api.errors.BaseErrorResponse;
import java.io.UnsupportedEncodingException;
import com.ufone.api.request.Request;

public class ServerError extends BaseErrorResponse {
        private final String error = "server_error";
        private final String errorDescription = "Internal Server Error";
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
                ServerError errorResponse = new ServerError();
                baseResponse = errorResponse.buildBaseErrorResponse(request.getRedirectURI());
                baseResponse = errorResponse.addStateQueryParam(baseResponse, request.getState());
                return errorResponse.returnResponse(baseResponse);
        }
}
