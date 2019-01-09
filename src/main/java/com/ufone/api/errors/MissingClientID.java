package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class MissingClientID extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "MANDATORY parameter client_id is missing";
}
