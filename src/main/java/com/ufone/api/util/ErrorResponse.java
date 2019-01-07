// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.util;

import com.google.gson.annotations.SerializedName;

public class ErrorResponse {
        @SerializedName("error")
        private String error;
        @SerializedName("error_description")
        private String errorDescription;


        public ErrorResponse() {}

        public ErrorResponse(String error, String errorDescription) {
                this.error = error;
                this.errorDescription = errorDescription;
        }

}
