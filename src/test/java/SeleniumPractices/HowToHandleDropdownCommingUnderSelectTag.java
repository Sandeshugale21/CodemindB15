package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToHandleDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement singleSelectionDropdown= driver.findElement(By.xpath(" //select[@id='drop1']"));
		Select select= new Select(singleSelectionDropdown);
		
		List<WebElement> selectedOptions= select.getAllSelectedOptions();
		for(WebElement option:selectedOptions) {
			System.out.println(option.getText());
		}
		System.out.println("-------------------------------------------------------");
		
		// How to get All Options from dropdown.
		List<WebElement> allOptionsFromDropdown= select.getOptions();
		for(WebElement Options:allOptionsFromDropdown) {
			System.out.println(Options.getText());
		}
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Multi Select : " +select.isMultiple());
		System.out.println("-------------------------------------------------------");
		
		select.selectByContainsVisibleText("4");
		Thread.sleep(2000);
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		select.selectByValue("def");
		Thread.sleep(2000);
		
		select.selectByVisibleText("doc 2");
		Thread.sleep(2000);
		
		
		
		

		driver.quit();
	}

}
