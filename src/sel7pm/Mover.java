package sel7pm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, tar).perform();
		
		
		
	}

}
/*driver.switchTo().frame(0);
WebElement src =driver.findElement(By.id("draggable"));
WebElement des =driver.findElement(By.id("droppable"));
Actions builder = new Actions(driver);
builder.dragAndDrop(src, des).perform();*/
