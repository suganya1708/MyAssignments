package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert a= driver.switchTo().alert();
		a.sendKeys("Sug");
		a.accept();
		String name = driver.findElement(By.id("demo")).getText();
        if(name.contains("Sug")) {
            System.out.println("Text Matching");
        } else {
            System.out.println("Text Not Matching");
        }

		driver.close();
		
	}

}
