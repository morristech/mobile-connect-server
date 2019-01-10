// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.authentication;

/*
 * This interface is to be used when integrating the authentication system to
 * the API. The interface for now contains USSD Authentication which should be a good place to
 * start.
 */
public interface IAuthenticationMethods { public boolean USSDAuthentication(); }
