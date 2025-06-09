package omayo.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		//driver=WebDriverManager1.getDriver();
		this.driver=driver;
		//this.driver = WebDriverManager1.getDriver();
	}
}
