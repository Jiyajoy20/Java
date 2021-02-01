package Automation;

import java.util.regex.*; 

public class five {
	
    public static void main(String args[]) { 
    	
    		// Pattern for IP Address
    	    String ip_address = "256.256.256.256"; 	 
    	    String ip_pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
		    	                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
		    	                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
		    	                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";   
		    
    	    // checking the match
    	    Pattern pipa = Pattern.compile(ip_address);
    		Matcher match = pipa.matcher(ip_pattern);
    	        
    	    if (match.matches()) {
    	        System.out.print("The IP address is valid");
    	    }
    	        
    	    else {
    	        System.out.print("The IP address is invalid");
    	    }
    	    
    	}
}