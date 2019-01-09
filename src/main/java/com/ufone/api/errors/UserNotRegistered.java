package com.ufone.api.errors;

import javax.ws.rs.core.Response;

import com.ufone.api.errors.BaseErrorResponse;

public class UserNotRegistered extends BaseErrorResponse {
        private final String error = "access_denied";
        private final String errorDescription = "User is not recognized";

        @Override
        public String getErrorTitle() {
                return this.error;
        }

        @Override
        public String getErrorDescription() {
                return this.errorDescription;
        }
}
