package com.ufone.api.error;

import javax.ws.rs.core.Response;
import com.ufone.api.error.BaseErrorResponse;

public class ClientNotAuthorized extends BaseErrorResponse {
	private final String error = "invalid_request";
	private final String errorDescription = "The client is not authorized to request an authorization code";
}
