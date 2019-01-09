package com.ufone.api.error;

import javax.ws.rs.core.Response;
import java.net.URLEncoder;

public class BaseErrorResponse {
	/*
	 * This class serves as a base class for creating error responses. You should
	 * always extend this class when creating an error class.
	 *
	 * https://developer.mobileconnect.io/mobile-connect-api#tag/ERROR-HANDLING
	 *
	 * @author Shehriyar Qureshi
	 */

	private String error;
	private String errorDescription;

	/*
	 * Return error parameter of instance.
	 *
	 * @author Shehriyar Qureshi
	 *
	 * @return String error
	 */
	public String getErrorTitle() {
		return this.error;
	}

	/*
	 * Return errorDescriptino parameter of instance.
	 *
	 * @author Shehriyar Qureshi
	 *
	 * @return String errorDescription
	 */
	public String getErrorDescription() {
		return this.errorDescription;
	}

	/*
	 * This method builds the base error response which includes redirect_uri with
	 * error and error_description query params. This should always be executed when
	 * building an error response.
	 *
	 * @author Shehriyar Qureshi
	 *
	 * @param redirectURI the query parameter redirect_uri passed by service
	 * provider.
	 *
	 * @return response URL which includes redirect_uri along with query params
	 * error and error_description.
	 */
	public String buildBaseErrorResponse(String redirectURI) {
		encodedErrorTitle = URLEncoder.encode(this.getErrorTitle(), "UTF-8");
		encodedErrorDescription = URLEncoder.encode(this.getErrorDescription(), "UTF-8");
		baseErrorResponse = String.format("%s?error=%s&error_description=%s", redirectURI, encodedErrorTitle,
				encodedErrorDescription);
		return baseErrorResponse;
	}

	/*
	 * Use this method if the request contains "state" parameter
	 *
	 * @author Shehriyar Qureshi
	 *
	 * @param baseErrorResponse the response URL created by buildBaseErrorResponse.
	 */
	public String addStateQueryParam(String baseErrorResponse, String stateParam) {
		stateParam = String.format("&%s=%s", "state", stateParam);
		return responseURL = redirectURI + stateParam;
	}

	/*
	 * All errors are supposed to return a 302 EXCEPT "invalid redirect_uri" error,
	 * which has to return a 400. You should only override this if you need a
	 * different http response type.
	 */
	public Response returnResponse(String errorResponseURL) {
		return Response.status(302).header("Location", errorResponseURL).build();
	}
}
