package sel7pm;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rclick {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.name("Home"));
	Actions a = new Actions(driver);
	a.contextClick(findElement);
	Robot r = new Robot();
	for (int i = 0; i <6; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
		
		
	}
		
	}


