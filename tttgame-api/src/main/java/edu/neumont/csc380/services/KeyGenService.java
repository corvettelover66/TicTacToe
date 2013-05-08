package edu.neumont.csc380.services;

import java.security.KeyPair;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface KeyGenService {

	@WebMethod
	public KeyPair generateKey(@WebParam String email) throws Exception;
	
}
