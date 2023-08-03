package sel7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  driver.manage().window().maximize();
		  
		  Select drpCountry = new Select(driver.findElement(By.name("country")));
		  drpCountry.selectByVisibleText("ANTARCTICA");
		 
		driver.get("http://jsbin.com/osebed/2");
		driver.manage().window().maximize();

		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		Thread.sleep(2000);
		fruits.selectByIndex(3);
		Thread.sleep(2000);

		fruits.selectByIndex(1);
		Thread.sleep(2000);

		fruits.selectByIndex(2);
		Thread.sleep(2000);

		fruits.deselectByIndex(1);
		
		Thread.sleep(2000);
		fruits.deselectByIndex(3);
		Thread.sleep(2000);

		fruits.deselectByIndex(1);
		Thread.sleep(2000);

		fruits.deselectByIndex(2);
		Thread.sleep(2000);
		fruits.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
