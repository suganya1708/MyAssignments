package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException { {
  
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Suganya1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("12");
		driver.findElement(By.className("inputBox")).sendKeys("Testtaps");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page Title is :" +driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
		
		Thread.sleep(1000);
	}

	}
}
