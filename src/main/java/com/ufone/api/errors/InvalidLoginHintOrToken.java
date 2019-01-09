package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

public class InvalidLoginHintOrToken extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "Invalid value for login_hint or login_hint_token";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
