package mouseover;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseove {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]"));
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File("E:\\Eclipse Workspace\\mouseover\\mouse ov\\sac.png"));
		Thread.sleep(10000);
		driver.close();
		
	}
}
