package Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eight {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mxplayer.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/div/div[2]/div/div[3]")).click();
		Thread.sleep(5000);
		
		// Accessing each channel name into a list
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"headerTopBar\"]/div/div/div/input[1]")).sendKeys("Channels");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"headerTopBar\"]/div[3]/div[3]/a/div")).click();
		Thread.sleep(5000);
		
		String channel1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[1]/a/div/div/h2")).getText();
		String channel2 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[2]/a/div/div/h2")).getText();
		String channel3 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[3]/a/div/div/h2")).getText();
		String channel4 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[4]/a/div/div/h2")).getText();
		
		ArrayList<String> channel_list = new ArrayList<String>();
		
		channel_list.add(channel1);
		channel_list.add(channel2);
		channel_list.add(channel3);
		channel_list.add(channel4);
		
		// Sorting channel names (ascending or descending)
		Scanner name2 = new Scanner(System.in);
		System.out.println("Sort in ascending or descending(asc or desc)?");
		String sorts= name2.nextLine();
		
		if(sorts.equals("asc")) {
			Collections.sort(channel_list);
		}
		
		else {
			Collections.sort(channel_list, Collections.reverseOrder());
		}
		
		System.out.println(channel_list);
	
	}
	
}

