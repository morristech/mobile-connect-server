package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class InvalidVersion extends BaseErrorResponse {
	private final String error = "access_denied";
	private final String errorDescription = "The scope value is invalid";
}
