package com.ufone.api.error;

import javax.ws.rs.core.Response;
import com.ufone.api.error.BaseErrorResponse;

public class UnknownUser extends BaseErrorResponse {
        private final String error = "access_denied";
        private final String errorDescription = "Unknown user";
}
