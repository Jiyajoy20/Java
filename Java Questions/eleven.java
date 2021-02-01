package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class eleven {
	
	public static void main(String[] args) {
		
		// Creating a linked hashmap and list
		LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
		
	    ArrayList<String> list = new ArrayList<>();
	    
		// Creating a Hashmap with movie names and its rating
	    HashMap <String, String> movies = new HashMap<>();
	    
	    movies.put("Joker","8.5");
	    movies.put("Master","7.6");
	    movies.put("Soul","8.1");
	    movies.put("Inception","8.8");
	    movies.put("Tenet","7.5");
	       
	    for (Entry<String, String> entry : movies.entrySet()) {
	         list.add(entry.getValue());
	    }
	    
	    Collections.sort(list, new Comparator<String>() {	    	 
	        public int compare(String str, String str1) {
	        	return (str).compareTo(str1);
	        }	         
	    });
	     
	    for (String str : list) {	    	  
	        for (Entry<String, String> entry : movies.entrySet()) {	        	 
	            if (entry.getValue().equals(str)) {
	               sortedMap.put(entry.getKey(), str);
	            }
	        }
	    }
		    
	    // Sorted Hashmap by value
		for (Entry movie: sortedMap.entrySet()) {
		    System.out.println(movie.getKey() + ":" + movie.getValue());
		}
		  
	}
	
}
