package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnInteraction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		WebElement e = driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a"));
		e.click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		List<String>ChildWindow = new ArrayList<String>(handles);
		
		driver.switchTo().window(ChildWindow.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		driver.switchTo().window(ChildWindow.get(0));
		WebElement e1 = driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a"));
		e1.click();
		Set<String> handles1 = driver.getWindowHandles();
		List<String>ChildWindow1 = new ArrayList<String>(handles1);
		
		driver.switchTo().window(ChildWindow1.get(1));
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		driver.switchTo().window(ChildWindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
