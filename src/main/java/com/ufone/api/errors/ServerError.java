package com.ufone.api.error;

import javax.ws.rs.core.Response;
import com.ufone.api.error.BaseErrorResponse;

public class MissingScope extends BaseErrorResponse {
        private final String error = "server_error";
        private final String errorDescription = "Internal Server Error";
}
