package com.auth.userprofileservice.util;

public class PasswordValidator {
	
	 public static void validate(String pw) {
	        if (pw == null || pw.length() <= 8) throw new IllegalArgumentException("Password must be > 8 chars");
	        if (!pw.matches(".*[a-z].*")) throw new IllegalArgumentException("Must contain lowercase");
	        if (!pw.matches(".*[A-Z].*")) throw new IllegalArgumentException("Must contain uppercase");
	        if (!pw.matches(".*\\d.*")) throw new IllegalArgumentException("Must contain digit");
	        if (!pw.matches(".*[!@#$].*")) throw new IllegalArgumentException("Must contain one of !@#$");
	    }

}
