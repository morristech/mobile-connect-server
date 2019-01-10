package com.ufone.api.exceptions;

public class InvalidACRException extends Exception {
        private static final long serialVersionUID = 81028L;
        public InvalidACRException() {
                super("MANDATORY parameter acr_values is missing");
        }
}
