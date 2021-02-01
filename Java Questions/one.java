package Automation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) throws Exception {
		
		// Accessing chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://captchas.net/registration/");
		driver.manage().window().maximize();
		
		// User input the capcha
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the Capche");
		String capcha = name.nextLine();
		
		// Credentials to login
		driver.findElement(By.name("user")).sendKeys("lmnop");
		driver.findElement(By.name("mail")).sendKeys("lmn234@gmail.com");
		driver.findElement(By.name("password")).sendKeys(capcha);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input[2]")).click();
		
		// Checking whether login success or not
		String success = driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(success);
		
		if (success.equals("Account Created")) {
			System.out.println("Successful Login");
		}
		
	}
		
}
	
