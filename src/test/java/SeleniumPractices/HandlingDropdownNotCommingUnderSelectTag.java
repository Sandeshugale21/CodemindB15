package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownNotCommingUnderSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		driver.manage().window().maximize();
		selectTripType("one way");
		Thread.sleep(2000);
		selectTripType("Return trip");
		Thread.sleep(2000);
		driver.quit();

	}

	public static void selectTripType(String tripType) {
		driver.findElement(By.xpath("//input[@id='tripType']")).click();
	List<WebElement> tripTypes = driver.findElements(By.xpath("//div[@class='tripTypeFilter']//li//p"));
		for (WebElement trip : tripTypes) {
			if (trip.getText().equalsIgnoreCase(tripType))
				
			{
				trip.click();
				break;
			}
		}

	
	}
	

}
