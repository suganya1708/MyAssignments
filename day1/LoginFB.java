package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) throws InterruptedException {
 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//driver.findElement(By.id("identify_email")).sendKeys("suganya.uthayasankar1708@gmail.com");
		//driver.findElement(By.name("did_submit")).click();
		//driver.findElement(By.xpath("//input[@value name = 'email'")).sendKeys("suganya.uthayasankar1708@gmail.com");
String title = driver.getTitle();
		
		System.out.println("Title of the current page is: "+ title);
		
		driver.close();
		//driver.close();
	}

}
