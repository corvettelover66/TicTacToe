package edu.neumont.csc380.services;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@Service("keyGenService")
public class KeyGenServiceImpl {

	public Key generateKey(String email) throws Exception {
		Key publicKey = null;
		
		if(Authenticator.authenticate(email)) {
			KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
			kpGen.initialize(2048);
			KeyPair keyPair = kpGen.generateKeyPair();
			
			publicKey = keyPair.getPublic();
			KeyStorage.addKeyPair(keyPair);
			
		}
		return publicKey;	
		
	}
}