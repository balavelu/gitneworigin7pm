package sel7pm;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCRN {
public static void main(String[] args) throws IOException {
	System.setProperty("WebDriver.chrome.driver", "drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://letcode.in/buttons");
	File ff = driver.getScreenshotAs(OutputType.FILE);
	File dest =new File("./snaps/img.png");
	FileHandler.copy(ff, dest);
	WebElement ele = driver.findElement(By.id("isDisabled"));
	

	File ff1 = ele.getScreenshotAs(OutputType.FILE);
	File dest1 =new File("./snaps/img6.png");
	FileHandler.copy(ff1, dest1);
	
	driver.quit();
	
	
}
}
