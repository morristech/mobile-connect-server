// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.authentication;

public class AuthenticationMethods implements IAuthenticationMethods {
        /*
         * The methods return true if authenticated, response should include what method
         * was used. The said response should be implemented in the calling function
         */
        public boolean USSDAuthentication() {
                return true;
        }
}
