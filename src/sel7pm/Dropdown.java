package sel7pm;

import java.time.Duration;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement crt = driver.findElement(By.linkText("Create new account"));
		crt.click();
		
		Thread.sleep(1000);
		
		WebElement mon = driver.findElement(By.id("month"));
		Select s =new Select(mon);
		
		Thread.sleep(1000);
		
		s.selectByIndex(7);
		
		Thread.sleep(1000);
		
		s.selectByValue("3");
		
		Thread.sleep(1000);
		
		s.deselectByVisibleText("Nov");
		
		Thread.sleep(1000);
		
		java.util.List<WebElement> all = s.getOptions();
		
		System.out.println("DDN Size"+all.size());
		


	}

}
