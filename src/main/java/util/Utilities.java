package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Utilities {

	public static String readProperty(String key ) {
		
		File file = new File("src/test/resources/master.properties");
		Properties properties = null;
		
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);
			properties.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
	}
	
	
	
	
	public  static void waitForElementToBeVisible(WebDriver driver, Long timeout, WebElement element) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(timeout)).ignoring(TimeoutException.class).pollingEvery(Duration.ofMillis(10))
		.until(ExpectedConditions.visibilityOf(element));
	}
	
}
