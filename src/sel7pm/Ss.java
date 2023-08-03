package sel7pm;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File elefrs1 = driver.getScreenshotAs(OutputType.FILE);
		File eledes1 =new File("./snaps/img1.png");
        org.openqa.selenium.io.FileHandler.copy(elefrs1,eledes1);	
        WebElement element = driver.findElement(By.id("home"));
 
           org.openqa.selenium.io.FileHandler.copy(elefrs1, eledes1);        
        
        
        driver.quit();


	}

}
