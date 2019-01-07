// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.authentication;

public class ClientValidation {
        private String client_id;
        private String redirect_uri;

        public ClientValidation(String client_id, String redirect_uri) {
                this.client_id = client_id;
                this.redirect_uri = redirect_uri;
        }

        public boolean isClientValid() {
                // add validation here
                return true;
        }
}
