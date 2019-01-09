package com.ufone.api.util;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class JsonWebToken {
        @SerializedName("iss") private String issuer;
        @SerializedName("exp") private double expiry;
        @SerializedName("typ") private String type;
        @SerializedName("alg") private String algorithm;

        public boolean isValidFormat(String jsonWebToken) {
                return true;
        }

        public boolean isNotTampered(String jsonWebToken) {
                return true;
        }
}
