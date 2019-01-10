package com.ufone.api.validation;

import com.ufone.api.request.Request;
import com.ufone.api.exceptions.MissingClientIDException;
import com.ufone.api.exceptions.MissingScopeException;
import com.ufone.api.exceptions.InvalidRedirectURIException;
import com.ufone.api.exceptions.InvalidResponseTypeException;
import com.ufone.api.exceptions.InvalidVersionException;
import com.ufone.api.exceptions.InvalidStateException;
import com.ufone.api.exceptions.MissingNonceException;

public interface IRequestValidation {
        public boolean validateRequest(Request request)
            throws MissingClientIDException, MissingScopeException, InvalidRedirectURIException,
                   InvalidResponseTypeException, InvalidVersionException, InvalidStateException,
                   MissingNonceException;

        public boolean mandatoryParametersNull(Request request)
            throws MissingClientIDException, MissingScopeException, InvalidRedirectURIException,
                   InvalidResponseTypeException, InvalidVersionException, InvalidStateException,
                   MissingNonceException;

        public boolean areMandatoryParametersValid(Request request);

        public boolean areOptionalParametersValid();

        public boolean validateClientID(String clientID);

        public boolean validateRedirectURI(String redirectURI);

        public boolean validateResponseType(String responseType);

        public boolean validateScope(String scope);

        public boolean validateVersion(String version);

        public boolean validateState(String state);

        public boolean validateNonce(String nonce);

        public boolean validateDisplay(String display);

        public boolean validatePrompt(String prompt);

        public boolean validateMaxAge(String maxAge);

        public boolean validateUiLocales(String uiLocales);

        public boolean validateClaimsLocales(String claimsLocales);

        public boolean validateIDTokenHint(String idTokenHint);

        public boolean validateLoginHint(String loginHint);

        public boolean validateLoginHintToken(String loginHintToken);

        public boolean validateAcrValues(String acrValues);

        public boolean validateResponseMode(String responseMode);

        public boolean validateCorrelationID(String correlationID);

        public boolean validateDtbs(String dtbs);
}
