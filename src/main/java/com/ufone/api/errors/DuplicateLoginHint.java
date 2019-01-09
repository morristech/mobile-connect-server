package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

public class DuplicateLoginHint extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "Malformed request, duplicate parameter entries";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
