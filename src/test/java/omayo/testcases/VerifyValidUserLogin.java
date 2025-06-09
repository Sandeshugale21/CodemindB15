package omayo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import omayo.pages.LoginPage;
import omayo.pages.LoginSuccessPage;
import util.Utilities;

public class VerifyValidUserLogin extends OmayoBaseTest {

	LoginPage loginPage;
	LoginSuccessPage loginSuccessPage;

	@Test(description = "Verify valid user login", priority = 0, groups = { "sanity}" })

	public void verifyValidLogin() {

		loginPage = new LoginPage(driver);
		loginSuccessPage = new LoginSuccessPage(driver);

		driver.navigate().to(Utilities.readProperty("newToursHomePageUrl"));

		loginPage.setUserName("Admin");
		loginPage.setPassword("Admin@123");
		loginPage.clickOnSubmitButton();

		util.Utilities.waitForElementToBeVisible(driver, 30l, loginSuccessPage.getLoginSuccessMessage());

		Assert.assertEquals(loginSuccessPage.getLoginSuccessMessageText(), "Login Successfully");
		Assert.assertEquals(loginSuccessPage.getThankYouFprLoginText().trim(), "Thank you for Loggin.");

	}
}
