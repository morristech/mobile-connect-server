package com.ufone.api.validation;

import com.ufone.api.request.Request;
import com.ufone.api.exceptions.MissingClientIDException;

public class RequestValidation implements IRequestValidation {
        public boolean validateRequest(Request request) {
                return false;
        }

        public boolean mandatoryParametersNull(Request request) {
                return false;
        }

        public boolean areMandatoryParametersValid() {
                return false;
        }

        public boolean areOptionalParametersValid() {
                return false;
        }

        public boolean validateClientID(String redirectURI) {
                return false;
        }

        public boolean validateRedirectURI(String redirectURI) {
                return false;
        }

        public boolean validateResponseType(String responseType) {
                return false;
        }

        public boolean validateScope(String scope) {
                return false;
        }

        public boolean validateVersion(String version) {
                return false;
        }

        public boolean validateState(String state) {
                return false;
        }

        public boolean validateNonce(String nonce) {
                return false;
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
