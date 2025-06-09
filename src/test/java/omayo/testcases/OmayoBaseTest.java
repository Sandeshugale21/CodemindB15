package omayo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import selenium.solvent.WebDriverManager1;
import util.Utilities;

public class OmayoBaseTest  {
	WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		driver=WebDriverManager1.getDriver();
		driver=new ChromeDriver();
		driver.get(Utilities.readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utilities.readProperty("timeout"))));
		
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
