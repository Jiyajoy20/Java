package Automation;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class thirteen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.imdb.com/list/ls016522954/?ref_=nv_tvv_dvd");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// User input the way to sort from list
		Scanner name = new Scanner(System.in);
		System.out.println("How to sort movies?");
		Thread.sleep(5000);
		
		String sort_list= driver.findElement(By.name("sort")).getText();
		System.out.println(sort_list);
		
		String sort = name.nextLine();
		
		// Choosing from drop down list
		Select select = new Select(driver.findElement(By.name("sort")));
	    select.selectByVisibleText(sort);
	    	
	}
	
}

