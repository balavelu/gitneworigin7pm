package sel7pm;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.err.println("simple alert"+text);
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
								
		
		
		
		
		
		
	}

}
