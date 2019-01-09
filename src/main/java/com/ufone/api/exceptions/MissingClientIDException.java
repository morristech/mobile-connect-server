package com.ufone.api.exceptions;

public class MissingClientIDException extends Exception {
        public MissingClientIDException() {
                super("MANDATORY parameter client_id is missing");
        }
}
