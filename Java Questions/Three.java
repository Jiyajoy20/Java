package Automation;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {
	
	public static void main(String[] args) throws Exception {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.imdb.com/");
			driver.manage().window().maximize();
			
			// Accessing JSON file to read Credentials and its xpath
			JSONParser jsonparse = new JSONParser();
			FileReader reader = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Testing\\json follder\\credentials.json");
			
			Object obj = jsonparse.parse(reader);
			JSONObject emp=(JSONObject)obj;
			
			String mailxpath = (String) emp.get("mxpath");
			String passxpath = (String) emp.get("pxpath");
			String logxpath = (String) emp.get("lxpath");
			
			String email = (String) emp.get("mail");
			String epass = (String) emp.get("pass");         
	         
			driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]/span[2]")).click();
			Thread.sleep(5000);
		    
			// Login using data from JSON file
			driver.findElement(By.name(mailxpath)).sendKeys(email);
			driver.findElement(By.name(passxpath)).sendKeys(epass);
			driver.findElement(By.xpath(logxpath)).click();
			Thread.sleep(5000);
			
	}
	
}
	
