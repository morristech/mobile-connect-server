package com.ufone.api.error;

import javax.ws.rs.core.Response;
import com.ufone.api.error.BaseErrorResponse;

public class MultipleTransaction extends BaseErrorResponse {
        private final String error = "access_denied";
        private final String errorDescription = "The user is busy with another transaction";
}
