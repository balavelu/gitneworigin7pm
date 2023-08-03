package sel7pm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rc1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("accept")).click();
		Thread.sleep(500);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		Thread.sleep(500);
		driver.findElement(By.id("confirm")).click();
		a.dismiss();
		
		Thread.sleep(500);
		driver.findElement(By.id("prompt")).click();
	
		a.sendKeys("Bala");
		
		a.accept();
	
		

	

		
		
			
		
		
		
		
		
		
	}

}
