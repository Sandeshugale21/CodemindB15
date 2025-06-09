package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage extends BasePage {
	
	public LoginSuccessPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//WebElement
	
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	WebElement loginSuccessMessage;
	
	@FindBy(xpath = " //b[normalize-space()='Thank you for Loggin.']")
	WebElement thankYouFprLogin;

	// getter method
	public WebElement getLoginSuccessMessage() {
		return loginSuccessMessage;
	}

	public WebElement getThankYouFprLogin() {
		return thankYouFprLogin;
	}
	
	// Method related to WebElement
	
	public String getLoginSuccessMessageText() {
		return getLoginSuccessMessage().getText();
		
	}
	
	public String getThankYouFprLoginText() {
		return getThankYouFprLogin().getText();
		
	}
	
}
