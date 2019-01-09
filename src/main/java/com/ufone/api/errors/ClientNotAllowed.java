package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

public class ClientNotAllowed extends BaseErrorResponse {
        private final String error = "access_denied";
        private final String errorDescription =
            "The client is not allowed to make MC service requests  ";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
