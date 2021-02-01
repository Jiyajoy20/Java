package Automation;

import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twelve {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get("https://www.hotstar.com/in/genres");
		driver.manage().window().maximize();
		JSONParser parser = new JSONParser();
		 
		// User input required genre
		Scanner name = new Scanner(System.in);
		System.out.println("Enter required genre...");
		String genre= name.nextLine();
		
		try {
			 	// Read file for genre details
				Object obj = parser.parse(new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Testing\\json follder\\genre.json"));
				 
		        JSONObject jsonObject = (JSONObject)obj;
		          
			    // Check whether key is valid and not null		    
			    if(jsonObject.containsKey(genre) && jsonObject.get(genre)!=null){
			    	  
			    	if(genre.equals("action")) {
					    String videos=String.valueOf(jsonObject.get(genre));					        
					    driver.findElement(By.xpath(videos)).click();
			    	}
			    	   
			    	else if(genre.equals("drama")) {
					    String videos=String.valueOf(jsonObject.get(genre));					        
					    driver.findElement(By.xpath(videos)).click();
			    	}
			    	   
			    	else if(genre.equals("sport")) {
					    String videos=String.valueOf(jsonObject.get(genre));					        
					    driver.findElement(By.xpath(videos)).click();
			    	}
			    	   
			    	else {
			    		System.out.println("Invalid Genre!!!");
			    	}
			    	   
			    }
			      
			    else {
			    	System.out.println("No such key or its value is null!!!");
			    }
			      
		    } 
		 
		catch (Exception e) {
		    e.printStackTrace();
		} 
		 		 
	}
	 
}