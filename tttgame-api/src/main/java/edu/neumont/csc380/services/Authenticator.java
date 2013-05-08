package edu.neumont.csc380.services;

import java.util.ArrayList;
import java.util.List;

public final class Authenticator {

	private static List<String> email_addresses;
	
	public Authenticator() {
		email_addresses = new ArrayList<String>();
		addEmailAddress("castro_marlo@ymail.com");
		addEmailAddress("DrRomines@gmail.com");
	}
	
	public static void addEmailAddress(String email) {
		if(email != null && !email.isEmpty()) {
			if(email_addresses.contains(email)) {
				email_addresses.add(email.toLowerCase());
			}
		}
	}
	
	public static List<String> getEmail_addresses() {
		return email_addresses;
	}
	
	public static boolean authenticate(String email) {
		if(email != null && !email.isEmpty()) {
			if(email_addresses.contains(email.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
