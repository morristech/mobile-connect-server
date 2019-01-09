package com.ufone.api.errors;

import javax.ws.rs.core.Response;
import com.ufone.api.errors.BaseErrorResponse;

public class ServerError extends BaseErrorResponse {
        private final String error = "server_error";
        private final String errorDescription = "Internal Server Error";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
