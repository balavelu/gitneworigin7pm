package sel7pm;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.amazon.in/");
		String first = driver.getWindowHandle();
		System.out.println(first);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14",Keys.ENTER);
		driver.findElement(By.xpath("//*[.='Apple iPhone 14 (128 GB) - Purple']")).click();
		 Set<String> all = driver.getWindowHandles();
		 System.out.println(all);
		 
		 for (String s : all) {
			 if (!s.equals(first)) {
				 driver.switchTo().window(s);
				
			}
			
		}
		
		
		
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
