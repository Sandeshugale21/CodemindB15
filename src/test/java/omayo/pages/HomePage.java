package omayo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath = "//input[@id = 'radio1']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//input[@id = 'radio2']")
	WebElement femaleRadioButton;

	@FindBy(css = "#drop1")
	WebElement olderNewsLetterDropdown;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getOlderNewsLetterDropdown() {
		return olderNewsLetterDropdown;
	}

	public HomePage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);
	}

	// Methods

	public boolean isOlderNewsLettersDropdownVisible() {
		return getOlderNewsLetterDropdown().isDisplayed();
	}

}
