package edu.neumont.csc380.services;

import java.security.KeyPair;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

public interface KeyGenService {

	public KeyPair generateKeyPair() throws Exception;
	
}
