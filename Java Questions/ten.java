package Automation;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ten {
	
	public static void main(String[] args) {
		 
		JSONParser parser = new JSONParser();
		 
		try {
			 	
			    // Accessing data from JSON file
			 	Object obj = parser.parse(new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Testing\\json follder\\collection.json"));
			 	
	            JSONObject jsonObject = (JSONObject)obj;
	            System.out.println("Movies:");
	            JSONArray movie = (JSONArray)jsonObject.get("Movies");
	            Iterator iterator = movie.iterator();
	            
	            // Iterating through each array 
	            while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }

	        } 
		 
		catch(Exception e) {
	            e.printStackTrace();
	    }
		 
	}
	 
}
	