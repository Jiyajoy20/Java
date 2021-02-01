package Automation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {
	
	public static void main(String[] args) throws Exception {
		
		try {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://www.imdb.com/");
				driver.manage().window().maximize();
			
				// Accessing file to read Credentials
	            File files = new File("C:\\Users\\Dell\\eclipse-workspace\\Testing\\src\\Automation\\Credentials.txt");
	            
	            Scanner name = new Scanner(files);
	            List<Check> data = new ArrayList<Check>();
            
	            while(name.hasNextLine()){
	            	
	                String line = name.nextLine();
	                String[] details = line.split(":");
	                String email = details[0];
	                String password = details[1]; 
			
					driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]/span[2]")).click();
					Thread.sleep(5000);
					
					// Credentials for login
					driver.findElement(By.name("email")).sendKeys(email);
					driver.findElement(By.name("password")).sendKeys(password);
					driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
					Thread.sleep(5000);
		        
					// Verifying login using URL
			        String actualUrl="https://www.imdb.com/?ref_=login";
			        String expectedUrl= driver.getCurrentUrl();
			        
			        if(actualUrl.equalsIgnoreCase(expectedUrl)){
			            System.out.println("Successful Login");
			        }
			        
			        else{
			            System.out.println("Login Failed");
			        }
			        
	           }
	            
		}catch (FileNotFoundException e) {         
	        e.printStackTrace();
	    }
	                     
    }
 
}