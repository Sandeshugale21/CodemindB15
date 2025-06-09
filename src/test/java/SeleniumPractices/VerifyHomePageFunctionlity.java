/**
 * 
 */
package SeleniumPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class will used to verify Home Page Functionality.
 */
public class VerifyHomePageFunctionlity {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyHomePageTitle() {

		String PageTitle = driver.getTitle();

		Assert.assertEquals(PageTitle, "omayo (QAFox.com)","Title is not matched");

	}
	
	// Skip test case in testing while execution.
	@Test(enabled=false)
	public void verifyHomePageUrl() {

		String PageURL = driver.getCurrentUrl();

		Assert.assertEquals(PageURL, "https://omayo.blogspot.com/","URL is not matched");

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

