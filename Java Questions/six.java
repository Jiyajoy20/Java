package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class six {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mxplayer.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Adding a movie to watchlist
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/div/div[2]/div/div[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a/div/div")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[2]/div[1]/div/div[5]/div[2]/div[3]/a/span")).click();
		Thread.sleep(5000);
		
		System.out.println("Movie added to watchlist");
		
		// Deleting a movie from watchlist
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div/div/div/a[1]/div/div/div[1]/button")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a/div/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div/a/div/div/div[1]/button")).click();
		Thread.sleep(5000);
		
		System.out.println("Movie deleted from watchlist");
		
	}
	
}
