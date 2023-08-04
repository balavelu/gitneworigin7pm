package sel7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omni.axisbank.co.in/axisretailbanking/");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='custid'])"));
		login.sendKeys("wdwdwdwd");
		
		
		
		
	}

}
