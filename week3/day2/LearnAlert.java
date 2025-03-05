package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			
			driver.get("https://www.leafground.com/alert.xhtml");
			WebElement DialogText = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));
			DialogText.click();
			Thread.sleep(3000);
			//driver.executeScript("arguments[0].click()", DialogText);
			
			Alert prompt = driver.switchTo().alert();
			String msg= prompt.getText();
			System.out.println(msg);
			prompt.sendKeys("Test");
			prompt.accept();
			String res = driver.findElement(By.id("confirm_result")).getText();
			System.out.println(res);
			driver.close();
			
			
			
			
			
			}

}
