package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCWindowHandle {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.out.println("Parent Window:" +driver.getTitle());
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>GetChildWindow = new ArrayList<String>(windowHandles);
		
			driver.switchTo().window(GetChildWindow.get(1));
			System.out.println("Childwindow:"+driver.getTitle());
			driver.close();
			driver.switchTo().window(GetChildWindow.get(0));
			driver.close();
			
		}
		
	}


