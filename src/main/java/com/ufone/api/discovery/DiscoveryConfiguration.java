package com.ufone.api.discovery;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DiscoveryConfiguration {
        private static volatile DiscoveryConfiguration configInstance = null;

        // NOTE: Not reading from file or something as that's gonna slow down
        // performance plus these fields won't be changed often so hardcoding them here
        // shouldn't be a problem, i guess XD
        @SerializedName("issuer")
        private String issuer = "https://api.ufone.com";
        @SerializedName("authorization_endpoint")
        private String authorizationEndpoint = "https://api.ufone.com/oidc/authorize";
        @SerializedName("token_endpoint")
        private String tokenEndpoint = "https://api.ufone.com/token";
        @SerializedName("userinfo_endpoint")
        private String userinfoEndpoint = "https://api.ufone.com/oidc/userinfo";
        @SerializedName("revocation_endpoint")
        private String revocationEndpoint = "https://api.ufone.com/oidc/revoke";
        @SerializedName("jwks_uri")
        private String jwksURI = "https://api.ufone.com/oidc/certs";
        @SerializedName("response_types_supported")
        private String[] responseTypesSupported = { "code" };
        @SerializedName("scopes_supported")
        private String[] scopesSupported = { "openid" };

        private DiscoveryConfiguration() {
        }

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
