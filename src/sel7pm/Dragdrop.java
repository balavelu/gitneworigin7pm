package sel7pm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dragdrop {

	
	@Test
	public  void main() throws InterruptedException  {
		System.setProperty("WebDriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		//driver.findElement(By.name("email")).sendKeys("sakthi@123");
		//driver.findElement(By.name("pass")).sendKeys("BALA12345");
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//button[.='Log in']")).click();
		//WebElement crt = driver.findElement(By.linkText("Create new account"));
		//crt.click();
		//WebElement month = driver.findElement(By.id("month"));
		//Select s = new Select(month);
		//Thread.sleep(1000);
		//s.selectByIndex(7);
		//Thread.sleep(2000);
		//s.selectByValue("10");
		//Thread.sleep(500);
		//List<WebElement> all = s.getOptions();
		//System.out.println("DDN size"+all.size());
		
		//for (int i = 0; i < all.size(); i++) {
			//String text = all.get(i).getText();
			//System.out.println(text);

		WebElement crt = driver.findElement(By.linkText("Create new account"));
		crt.click();
		Thread.sleep(200);
		
			WebElement yr = driver.findElement(By.id("year"));
			Thread.sleep(200);
			Select s = new Select(yr);
			s.selectByIndex(20);
			Thread.sleep(200);
			s.selectByValue("18");
			Thread.sleep(200);
			s.selectByVisibleText("2017");
			
			
			
			
			
		}
		
	
		
		
		

	}


