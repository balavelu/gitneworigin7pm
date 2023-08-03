package sel7pm;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.page.Page.GetAppIdResponse;

public class New {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys("bala");
		driver.findElement(By.id("join")).sendKeys("person",Keys.TAB);
		String myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myvalue);
		
		driver.findElement(By.id("clearMe")).clear();
		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);
		String readonly = driver.findElement(By.id("noEdit")).getAttribute("readonly");
		System.out.println(readonly);
		driver.quit();													
		
		
		
	

	}

}
