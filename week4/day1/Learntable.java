package week4.day1;

import java.time.Duration;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learntable {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr"));
		System.out.println("Tot no of trains :" +rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr[1]/td"));
		Set<String> set = new HashSet<String>();
		//int size = Listoftrains.size();
		for (int i = 2; i <=35; i++) {
			WebElement element = driver.findElement(By.xpath("//div[@id='divTrainsList']//tbody/tr["+i+"]/td[2]"));
			
			set.add(element.getText());
			for (String string : set) {
				System.out.println(string);
				
			}
		}
		
			
	}		
			
	}