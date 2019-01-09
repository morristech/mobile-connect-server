// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.discovery;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DiscoveryConfiguration {
        private static volatile DiscoveryConfiguration configInstance = null;

        // NOTE: Not reading from file or something as that's gonna slow down
        // performance plus these fields won't be changed often so hardcoding them here
        // shouldn't be a problem and they will be compiled to bytecode so they can't be
        // changed by someone which might have malicious intent.
        @SerializedName("issuer") private final String issuer = "https://api.ufone.com";
        @SerializedName("authorization_endpoint")
        private final String authorizationEndpoint = "https://api.ufone.com/oidc/authorize";
        @SerializedName("token_endpoint")
        private final String tokenEndpoint = "https://api.ufone.com/token";
        @SerializedName("userinfo_endpoint")
        private final String userinfoEndpoint = "https://api.ufone.com/oidc/userinfo";
        @SerializedName("revocation_endpoint")
        private final String revocationEndpoint = "https://api.ufone.com/oidc/revoke";
        @SerializedName("jwks_uri")
        private final String jwksURI = "https://api.ufone.com/oidc/certs";
        @SerializedName("response_types_supported")
        private final String[] responseTypesSupported = {"code"};
        @SerializedName("scopes_supported") private final String[] scopesSupported = {"openid"};
        @SerializedName("subject_types_supported")
        private final String[] subject_types_supported = {"public"};
        @SerializedName("id_token_signing_alg_values_supported")
        private final String[] tokenSigningAlgorithm = {"RS256"};
        @SerializedName("acr_values_supported") private final String[] acrValuesSupported = {"2"};

        private DiscoveryConfiguration() {}

        public static String getResponseAsString() {
                // Singleton class, don't need to create an object on every request
                if (configInstance == null) {
                        // pretty output, only google does this, other's dunno
                        Gson jsonResponse = new GsonBuilder().setPrettyPrinting().create();
                        configInstance = new DiscoveryConfiguration();
                        String responseBody = jsonResponse.toJson(configInstance);
                        return responseBody;
                } else {
                        Gson jsonResponse = new GsonBuilder().setPrettyPrinting().create();
                        String responseBody = jsonResponse.toJson(configInstance);
                        return responseBody;
                }
        }
}
