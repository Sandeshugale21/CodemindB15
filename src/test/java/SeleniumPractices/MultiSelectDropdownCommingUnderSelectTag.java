package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement multiSelectionDropdown= driver.findElement(By.xpath(" //select[@id='multiselect1']"));
		Select select= new Select(multiSelectionDropdown);
		
		System.out.println("All Options from dropdown");
		List<WebElement> allOptionsFromDropdown = select.getOptions();
		for(WebElement options:allOptionsFromDropdown) {
			System.out.println(options.getText());
			}
		System.out.println("-------------------------------------------------------");
		
		System.out.println("MultiSelection is Allowed : "+select.isMultiple());
		
		System.out.println("-------------------------------------------------------");
		
		select.selectByContainsVisibleText("dai");
		Thread.sleep(2000);
		select.selectByIndex(0);
		System.out.println("get first selected option");
		System.out.println("First Selected Option : "+select.getFirstSelectedOption().getText());
		
		System.out.println("get all selected options");
		List<WebElement> allSelectedOptions= select.getAllSelectedOptions();
		for(WebElement allOptions:allSelectedOptions) {
			System.out.println(allOptions.getText());
		}
		select.deselectAll();
		
		System.out.println("-----------------------------------------------------------------");
		
		select.selectByContainsVisibleText("dai");
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select.deSelectByContainsVisibleText("vo");
		Thread.sleep(2000);
		select.deselectByIndex(3);
		Thread.sleep(2000);
		select.deselectByValue("Hyundaix");
		Thread.sleep(2000);
		select.deselectByVisibleText("Swift");
		
		
		driver.quit();
	}

}
