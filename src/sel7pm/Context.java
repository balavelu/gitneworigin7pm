package sel7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Launch the Application Under Test (AUT)
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		// Right click the button to launch right click menu options
		Actions action = new Actions(driver);

		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();
		
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.cssSelector(".context-menu-icon-delete"));
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		WebElement dl = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(dl).perform();
		
		driver.switchTo().alert().accept();
		
		
		//driver.quit(); 
		
			}
}
