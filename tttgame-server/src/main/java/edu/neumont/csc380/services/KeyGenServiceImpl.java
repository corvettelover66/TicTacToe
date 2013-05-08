package edu.neumont.csc380.services;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class KeyGenServiceImpl {

	public KeyPair generateKeyPair() throws Exception {
		KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
		kpGen.initialize(2048);
		KeyPair keyPair = kpGen.generateKeyPair();
		
		KeyStorage.addKeyPair(keyPair);
			
		return keyPair;	
	}
}