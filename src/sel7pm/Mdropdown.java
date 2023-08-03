package sel7pm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://output.jsbin.com/osebed/2");
		Select s = new Select(driver.findElement(By.id("fruits")));
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(200);
		s.selectByValue("apple");
		Thread.sleep(200);
		s.selectByVisibleText("Grape");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement w : allSelectedOptions) {
			System.out.println(w.getText());
			
			
		}
		WebElement fs = s.getFirstSelectedOption();
		System.err.println(fs.getText());
		Thread.sleep(200);
		
		s.deselectByIndex(2);
		s.deselectByValue("apple");
		Thread.sleep(200);
		s.deselectByVisibleText("Grape");
		
		
		
		Thread.sleep(200);
		
		
		
		List<WebElement> all = s.getOptions();
		for (int i = 0; i <all.size(); i++) {
			Thread.sleep(200);
			
			
			s.selectByIndex(i);
			
			Thread.sleep(300);
			
			
			s.deselectAll();
			for (WebElement w : all) {
				Thread.sleep(200);
			s.selectByValue(w.getDomAttribute("value"));	
				
			Thread.sleep(1000);
			s.deselectAll();
			}
			for (WebElement w : all) {
				s.selectByValue(w.getText());
				
				
			}
			
			Thread.sleep(200);
			s.deselectAll();
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
