package Automation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class nine {
	
	public static void main(String[] args) {

			// Creating a Hashmap with movie names and its rating
		    HashMap <String, Double> movies = new HashMap<>();
		    
		    movies.put("Master",7.6);
		    movies.put("Soul",8.1);
		    movies.put("Tenet",7.5);
		    movies.put("Joker",8.5);
		    movies.put("Inception",8.8);
		    
		    System.out.println("HashMap:");		    
		    for (Entry movie: movies.entrySet()) {
		    	 System.out.println(movie.getKey() + ":" + movie.getValue());
		    }
		    
		    // removing an element from hashmap
		    Scanner name = new Scanner(System.in);
			System.out.println("Movie to be removed?");
			String movie_name= name.nextLine();
			
			if (movies.containsKey(movie_name)){
				movies.remove(movie_name);
				System.out.println("Updated HashMap: " + movies);
			}
			else {
				System.out.println("Invalid movie");
			}
	}
	
}