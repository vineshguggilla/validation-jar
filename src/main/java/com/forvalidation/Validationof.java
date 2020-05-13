package com.forvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Validationof {



	public boolean mobilevalidation(String mobileno) {
		   // The given argument to compile() method  
        // is regular expression. With the help of  
        // regular expression we can validate mobile 
        // number.  
        // 1) Begins with 0 or 91 
        // 2) Then contains 7 or 8 or 9. 
        // 3) Then contains 9 digits 
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
  
        // Pattern class contains matcher() method 
        // to find matching between given number  
        // and regular expression 
        Matcher m = p.matcher(mobileno); 
        return (m.find() && m.group().equals(mobileno));



	}
	


		public    boolean isValid(String email) {
		      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		      return email.matches(regex);
		   

		}
		
		
		
		
		
		public  boolean validateAadharNumber(String aadharNumber){
	        Pattern aadharPattern = Pattern.compile("\\d{12}");
	        boolean isValidAadhar = aadharPattern.matcher(aadharNumber).matches();


	        return isValidAadhar;
	        
	        
	    }

		

	    public boolean isValidPan(String pan) {
	        Pattern mPattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");

	        Matcher mMatcher = mPattern.matcher(pan);
	        return mMatcher.matches();
	    }
	}
		
		
		


