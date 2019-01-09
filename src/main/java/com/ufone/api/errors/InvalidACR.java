package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class InvalidACR extends BaseErrorResponse {
	private final String error = "invalid_request";
	private final String errorDescription = "MANDATORY parameter acr_values are missing or invalid values";
}
