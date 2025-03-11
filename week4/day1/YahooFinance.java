package week4.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class YahooFinance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.addArguments("--incognito"); 
		
		options.addArguments("--guest"); 
		ChromeDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://finance.yahoo.com/");
		
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@aria-label='More']/span[text()='More']"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Crypto"))).click().perform();
		List<WebElement> cryptonames = driver.findElements(By.xpath("//table//tbody//td[1]"));
				int colsize = cryptonames.size();
				System.out.println("Crypto names are");
				for (int i = 1; i < colsize; i++) {
					
				 WebElement names = driver.findElement(By.xpath("//table//tbody//tr[ "+i+ "]/td[1]"));
					String ccynames = names.getText();
					System.out.println(ccynames);
				}
		;
		
		
		
		
		
		
		

	}

}
