package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class InvalidLoginHintOrToken extends BaseErrorResponse {
	private final String error = "invalid_request";
	private final String errorDescription = "Invalid value for login_hint or login_hint_token";
}
