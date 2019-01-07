// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.util;

public class InvalidRequest {
        public String error;
        public String errorDescription;


        public InvalidRequest(String error, String errorDescription) {
                this.error = error;
                this.errorDescription = errorDescription;
        }
}
