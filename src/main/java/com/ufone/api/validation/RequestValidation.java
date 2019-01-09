package com.ufone.api.validation;

import com.ufone.api.request.Request;
import com.ufone.api.exceptions.MissingClientIDException;
import com.ufone.api.errors.MissingScope;
import com.ufone.api.exceptions.MissingScopeException;

public class RequestValidation implements IRequestValidation {
        public boolean validateRequest(Request request)
            throws MissingClientIDException, MissingScopeException {
                // empty check
                mandatoryParametersNull(request);
                // validity check
                areMandatoryParametersValid(request);
                return true;
        }

        public boolean mandatoryParametersNull(Request request)
            throws MissingClientIDException, MissingScopeException {
                if (request.getClientID() == null) {
                        throw new MissingClientIDException();
                } else if (request.getScope() == null) {
                        throw new MissingScopeException();
                } else {
                        return false;
                }
        }

        public boolean areMandatoryParametersValid(Request request) {
                validateClientID(request.getClientID());
                validateRedirectURI(request.getRedirectURI());
                validateResponseType(request.getResponseType());
                validateScope(request.getScope());
                validateVersion(request.getVersion());
                validateState(request.getState());
                validateNonce(request.getNonce());
                return true;
        }

        public boolean areOptionalParametersValid() {
                return false;
        }

        public boolean validateClientID(String clientID) {
                return true;
        }

        public boolean validateRedirectURI(String redirectURI) {
                return true;
        }

        public boolean validateResponseType(String responseType) {
                return true;
        }

        public boolean validateScope(String scope) {
                return true;
        }

        public boolean validateVersion(String version) {
                return true;
        }

        public boolean validateState(String state) {
                return true;
        }

        public boolean validateNonce(String nonce) {
                return true;
        }

        public boolean validateDisplay(String display) {
                return false;
        }

        public boolean validatePrompt(String prompt) {
                return false;
        }

        public boolean validateMaxAge(String maxAge) {
                return false;
        }

        public boolean validateUiLocales(String uiLocales) {
                return false;
        }

        public boolean validateClaimsLocales(String claimsLocales) {
                return false;
        }

        public boolean validateIDTokenHint(String idTokenHint) {
                return false;
        }

        public boolean validateLoginHint(String loginHint) {
                return false;
        }

        public boolean validateLoginHintToken(String loginHintToken) {
                return false;
        }

        public boolean validateAcrValues(String acrValues) {
                return false;
        }

        public boolean validateResponseMode(String responseMode) {
                return false;
        }

        public boolean validateCorrelationID(String correlationID) {
                return false;
        }

        public boolean validateDtbs(String dtbs) {
                return false;
        }
}
