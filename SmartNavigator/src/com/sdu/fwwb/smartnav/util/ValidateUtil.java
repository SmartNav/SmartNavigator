package com.sdu.fwwb.smartnav.util;

public class ValidateUtil {

	public static boolean isEmail(String email){
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1){
			return true;
		}
		return false;
	}
	
}
