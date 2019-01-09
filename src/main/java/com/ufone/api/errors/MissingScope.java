package com.ufone.api.errors;

import javax.ws.rs.core.Response;
import com.ufone.api.errors.BaseErrorResponse;

public class MissingScope extends BaseErrorResponse {
        private String error = "invalid_scope";
        private String errorDescription = "MANDATORY parameter scope is missing";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
