package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFB {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sugtest");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium");
		Select objselect = new Select(driver.findElement(By.id("day")));
		
		objselect.selectByIndex(5);
				
        Select objselect1 = new Select(driver.findElement(By.id("month")));
		
		objselect1.selectByIndex(8); 		
				
      Select objselect2 = new Select(driver.findElement(By.id("year")));
		
		objselect2.selectByValue("1991");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("7550099520");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Suganya18!");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();	
		
		driver.close();
				
				
				
		
	}

}
