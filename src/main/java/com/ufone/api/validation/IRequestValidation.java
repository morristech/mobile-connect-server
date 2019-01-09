package com.ufone.api.validation;

import com.ufone.api.request.Request;

public interface IRequestValidation {
        public boolean validateRequest(Request request);

        public boolean mandatoryParametersNull(Request request);

        public boolean areMandatoryParametersValid();

        public boolean areOptionalParametersValid();

        public boolean validateClientID(String redirectURI);

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
