package sel7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("page url"+url);
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		
		driver.findElement(By.id("home")).click();
		String homeurl = driver.getCurrentUrl();
		System.out.println("page url"+homeurl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
        nav.back();
        Thread.sleep(2000);
        nav.refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	
	
		
	
		
		
		
		
	}

}
