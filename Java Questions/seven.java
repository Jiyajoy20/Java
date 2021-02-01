package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seven {

	public static void main(String[] args) throws InterruptedException {
		
		// Accessing chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mxplayer.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/div/div[2]/div/div[3]")).click();
		Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a/div/div")).click();
		Thread.sleep(5000);
		
		// Check whether watchlist is empty
		String title = driver.findElement(By.className("watchlist-heading")).getText();
		
		if (title.equals("Your Watchlist is Empty")) {
			
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[1]/div/div[2]/div[2]/div[9]/a/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div/div/div/a[3]/div/div/div[2]/div[2]/div")).click();
			Thread.sleep(5000);
			
			// Adding an item to watchlist
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/div/div[1]/div[3]/div[1]")).click();
			Thread.sleep(5000);			
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/div/div[1]/div[3]/a")).click();
			Thread.sleep(5000);					
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a/div/div")).click();
			Thread.sleep(5000);
			
			// Verify whether item is added or not
			String new_title = driver.findElement(By.className("watchlist-heading")).getText();
			
			if (new_title.equals("Your Watchlist")) {
				System.out.print("Now watchlist is not empty");     
		      }	
			
			else {
				System.out.print("Still watchlist is empty"); 
			}
			
		}
		
		else {
				System.out.print("Watchlist is not empty"); 
		}
			
	}
	
}
