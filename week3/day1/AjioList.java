package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		


     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		WebElement bag = driver.findElement(By.xpath("//input[@name='searchVal']"));
		bag.sendKeys("bags");
		bag.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//input[@name='genderfilter']/following-sibling::label[@for='Men']")).click();
		
		Thread.sleep(5000);
		WebElement fasbag = driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[@for='Men - Fashion Bags']"));
		fasbag.click();
		String fasbg= fasbag.getText();
		System.out.println("Total count are: " +fasbg);
		
		List <WebElement> brand = driver.findElements(By.xpath("//a[descendant::div[@class='brand']]//strong"));
		
		System.out.println();					
		System.out.println("List of Brands diaplayed are:");
		System.out.println("---------------------------------");	
		
		 for ( int i= 0; i < brand.size(); i++ )
		 {
			 WebElement wbd = brand.get(i);
			 String txt = wbd.getText();					 
			 System.out.println(txt);
		 }
		
		 List <WebElement> namesofbag = driver.findElements(By.xpath("//a[descendant::div[@class='brand']]//div[@class='nameCls']"));
		 
		 System.out.println();					 				 
		 System.out.println("List of Bag Names diaplayed are:");
		 System.out.println("---------------------------------");	
		
		 for ( int i= 0; i < namesofbag.size(); i++ )
		 {
			 WebElement wnb = namesofbag.get(i);
			 String txt = wnb.getText();
			 System.out.println(txt);
		 }
	
		
		driver.close();
		 }
	}


		
		
		
		
		
		
		
		
		
		
	


