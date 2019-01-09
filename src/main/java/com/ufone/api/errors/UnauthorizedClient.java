package com.ufone.api.error;

import javax.ws.rs.core.Response;

import com.ufone.api.error.BaseErrorResponse;

public class UnauthorizedClient extends BaseErrorResponse {
	private final String error = "access_denied";
	private final String errorDescription = "The client is not allowed to make MC service requests";
}
