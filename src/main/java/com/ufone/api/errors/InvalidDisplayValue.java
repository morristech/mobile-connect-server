package com.ufone.api.errors;

import com.ufone.api.errors.BaseErrorResponse;

import javax.ws.rs.core.Response;

public class InvalidDisplayValue extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "Invalid display value (or) not supported.";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
