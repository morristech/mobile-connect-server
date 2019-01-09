package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

public class InvalidClaims extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "claims value is invalid";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
