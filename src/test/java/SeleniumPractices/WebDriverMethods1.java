 package SeleniumPractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Load new web page in the current browser window (Launch the URL).
		driver.get("https://omayo.blogspot.com/");
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Minimize browser window
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		//The current page url loaded in the browser.
		String url=driver.getCurrentUrl();
		System.out.println("Current url : "+url);
		
		//Get the title of current page
		System.out.println("Page Title : " +driver.getTitle());
		
		System.out.println("____________________________________________");
		
		//Get the source of last loaded page
		System.out.println(driver.getPageSource());
		
		
		System.out.println("____________________________________________");
		
		WebElement textArea = driver.findElement(By.xpath("//textarea"));
		textArea.sendKeys("Welcome");
		
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='radio1']"));
		maleRadioBtn.click();
		
		List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Number of Elements in List : "+radioButtons.size());
		
		Iterator<WebElement> it= radioButtons.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getAttribute("value"));
		}
		
		//Quits this driver, closing every assosiated window
		//driver.quit();
		
		//Close the current Window
		//driver.close();
		
		
		

	}

}
