// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.discovery;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

public class DiscoveryConfiguration {
        // NOTE: Not reading from file or something as that's gonna slow down
        // performance plus these fields won't be changed often so hardcoding them here
        // shouldn't be a problem and they will be compiled to bytecode so they can't be
        // changed by someone which might have malicious intent. This will be changed if a better
        // solution is brought up.
        @SerializedName("issuer") private static final String issuer = "https://api.ufone.com";
        @SerializedName("authorization_endpoint")
        private static final String authorizationEndpoint = "https://api.ufone.com/oidc/authorize";
        @SerializedName("token_endpoint")
        private static final String tokenEndpoint = "https://api.ufone.com/token";
        @SerializedName("userinfo_endpoint")
        private static final String userinfoEndpoint = "https://api.ufone.com/oidc/userinfo";
        @SerializedName("revocation_endpoint")
        private static final String revocationEndpoint = "https://api.ufone.com/oidc/revoke";
        @SerializedName("jwks_uri")
        private static final String jwksURI = "https://api.ufone.com/oidc/certs";
        @SerializedName("response_types_supported")
        private static final String[] responseTypesSupported = {"code"};
        @SerializedName("scopes_supported")
        private static final String[] scopesSupported = {"openid"};
        @SerializedName("subject_types_supported")
        private static final String[] subject_types_supported = {"public"};
        @SerializedName("id_token_signing_alg_values_supported")
        private static final String[] tokenSigningAlgorithm = {"RS256"};
        @SerializedName("acr_values_supported")
        private static final String[] acrValuesSupported = {"2"};

        /*
         * Returns the static fields initialized above.
         */
        public static String getResponseAsString() {
                Gson jsonResponse = new GsonBuilder()
                                        .excludeFieldsWithModifiers(Modifier.TRANSIENT)
                                        .setPrettyPrinting()
                                        .create();
                String responseBody = jsonResponse.toJson(new DiscoveryConfiguration());
                return responseBody;
        }
}
