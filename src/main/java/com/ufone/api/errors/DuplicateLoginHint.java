package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class DuplicateLoginHint extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "Malformed request, duplicate parameter entries";
}
