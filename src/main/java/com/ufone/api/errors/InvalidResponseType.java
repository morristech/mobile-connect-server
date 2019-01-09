package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class InvalidResponseType extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "MANDATORY parameter response_type is missing or value is invalid";
}
