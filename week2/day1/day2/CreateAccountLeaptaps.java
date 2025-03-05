package week2.day2;

import org.apache.commons.collections4.Get;
import org.jsoup.helper.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeaptaps {
	
	public static void main(String[] args) throws InterruptedException { {
		  
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Test21");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select objselect = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		objselect.selectByValue("IND_SOFTWARE");
		Select objselect1 = new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		objselect1.selectByVisibleText("S-Corporation");
		Select objselect2 = new Select(driver.findElement(By.xpath("//select[@name='dataSourceId']")));
		objselect2.selectByValue("LEAD_EMPLOYEE");
		Select objselect3 = new Select(driver.findElement(By.xpath("//select[@name='marketingCampaignId']")));
		objselect3.selectByIndex(6);
		Select objselect4 = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		objselect4.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement e =driver.findElement(By.xpath("//span[contains(text(),'Test21')]"));
		if (e.isDisplayed()==true) {
			System.out.println("Element is displayed");
		}
		System.out.println(e.getText());
		if (driver.getPageSource().contains("Test20"))
{
			System.out.println("pass");
}
			else
				System.out.println("fail");
			
		}
		
	}
	}


