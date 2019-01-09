package com.ufone.api.error;

import javax.ws.rs.core.Response;
import com.ufone.api.error.BaseErrorResponse;

public class MissingScope extends BaseErrorResponse {
        private final String error = "invalid_scope";
        private final String errorDescription = "MANDATORY parameter scope is missing";
}
