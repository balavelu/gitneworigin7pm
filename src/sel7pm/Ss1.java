package sel7pm;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class Ss1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = driver;
		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("snaps\\amahome.png");
		FileUtils.copyFile(src, f);
		WebElement td = driver.findElement(By.xpath("//h2[.='Today’s Deals']"));
		//scroll into bottom
		js.executeScript("args[0].scrollIntoView(false)",td);
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File("snaps\\amahome1.png");
		FileUtils.copyFile(src1,f1);
		//scroll top
		js.executeScript("args[0].scrollIntoView(true)",td);
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File f2 = new File("snaps\\amahome2.png");
		FileUtils.copyFile(src2,f2);
		Thread.sleep(1000);
		
		//scroll without ele
		js.executeScript("windows.scrollBy(0,1000)");
		
		
		
		
		driver.close();
		
		
	}

}
