package week3.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBText {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login/");
		
		
		List<WebElement> elements=  driver.findElements(By.tagName("a"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement WebElement = elements.get(i);
			String Text = WebElement.getText();
			System.out.println(Text);
					
			
		}
		driver.close();
			
		}
			
		
		
		
		
	}


