package edu.neumont.csc380.services;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;

public final class KeyStorage {

	private static List<KeyPair> keyPairs;
	
	public KeyStorage() {
		keyPairs = new ArrayList<KeyPair>();
	}
	
	public static void addKeyPair(KeyPair keyPair) {
		if(keyPair != null) {
			keyPairs.add(keyPair);
		}
	}
	
	public static List<KeyPair> getkeyPairs() {
		return keyPairs;
	}
	
	public static boolean containsKeyPair(KeyPair keyPair) {
		for(KeyPair kp : keyPairs) {
			if(kp.getPublic() == keyPair.getPublic()) {
				if(kp.getPrivate() == keyPair.getPrivate()) return true;
			}
		}
		return false;
	}
}
