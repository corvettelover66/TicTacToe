package edu.neumont.csc380.models;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.jws.WebMethod;
import javax.jws.WebParam;

public class KeyGenerator {

	@WebMethod
	public Key generateKey(@WebParam String email) throws Exception {
		Key publicKey = null;
		
//		if authenticated using email
			KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
			kpGen.initialize(2048);
			KeyPair keyPair = kpGen.generateKeyPair();
			
			// add the keypair to a database or a text file			
//		}
		else throw new UnrecognizedEmailException("You are not recognized by the Enlightenment Security Agency." +
					" Check your email address. ");
		return publicKey;	
		
	}
}
