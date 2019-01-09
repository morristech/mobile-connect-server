package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class MissingLoginHintOrToken extends BaseErrorResponse {
        private final String error = "invalid_request";
        private final String errorDescription = "MANDATORY parameters login_hint_token (or) login_hint does not exist.";
}
