package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class DuplicateParameter extends BaseErrorResponse {
	private final String error = "invalid_request";
	private final String errorDescription = "Multiple parameter names in the authorization request. Malformed request";
}
