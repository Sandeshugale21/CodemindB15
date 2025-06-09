package SeleniumPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertInTestNG {
	
	WebDriver driver;
	SoftAssert verify;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		verify = new SoftAssert();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test
	public void loginTestUsingDataProvider() {
		driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String expectedResult = "Logi Successfully";
		String loginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		String expectedResule1 ="Thank you for Loggin.";
		String thankYouText = driver.findElement(By.xpath("//b[normalize-space()='Thank you for Loggin.']")).getText();

		// Ways of use Assertion
		// verify.assertEquals(loginMsg, expectedResult);

		// Recommended way
		System.out.println("Before first verification");
		verify.assertEquals(loginMsg, expectedResult, "User not loged in successfully");
		
		System.out.println("After first verification");
		//assertEquals(thankYouText, expectedResule1,"Message is not matched");
		verify.assertTrue(thankYouText.trim().equalsIgnoreCase(expectedResule1));
		
		// verify.assertNotEquals(loginMsg, expectedResult);
		// verify.assertNotEquals(loginMsg, expectedResult, "Message is Equal");

		// verify.assertTrue(expectedResult.equals(loginMsg));
		// verify.assertTrue(expectedResult.equals(loginMsg), "User not logged in successfully");

		// verify.assertFalse(expectedResult.equals(loginMsg));
		// verify.assertFalse(expectedResult.equals(loginMsg), "User not loged in successfully");
		verify.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
