package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class InternalServerError extends BaseErrorResponse {
	private final String error = "temporarily_unavailable";
	private final String errorDescription = "Internal Server Error";
}
