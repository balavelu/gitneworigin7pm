package sel7pm;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("X=>"+x + "Y=>"+y);
		
		WebElement clr = driver.findElement(By.id("color"));
		String color = clr.getCssValue("background-color");
		System.out.println(color);
	
		
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		
		Dimension dim = rect.getDimension();
		System.out.println(dim.height);
		System.out.println(dim.width);
		
		
		boolean dis = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(dis);
		
		
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
