package com.ufone.api.exceptions;

public class MissingScopeException extends Exception {
        public MissingScopeException() {
                super("MANDATORY parameter state is missing");
        }
}
