package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				Thread.sleep(1000);
				
			WebElement check = driver.findElement(By.xpath("//span[text()='Basic']"));
			check.click();
			if (check.isSelected()==true) {
				System.out.println("checkbox is selected");
				
			} else {
				System.out.println("Checkbox is not selected");

			}
			
	}

}
