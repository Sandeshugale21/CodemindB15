package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Utilities;

public class LocatorStratergiesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(Utilities.readProperty("url" ));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// By.id
		WebElement maleRadioBUtton= driver.findElement(By.id("radio1"));
		maleRadioBUtton.click();
		//By.name
		
		WebElement searchThisBlogTextField= driver.findElement(By.name("q"));
		searchThisBlogTextField.sendKeys("Welcome to pune");
		Thread.sleep(3000);
		searchThisBlogTextField.clear();
		
		//By.class
		WebElement titleOfThePage= driver.findElement(By.className("title"));
		String title =titleOfThePage.getText();
		System.out.println(title);
		
		//By.linktext
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		
		//By.partiallinktext
		driver.findElement(By.partialLinkText("niumTutor")).click();
		
		//By.tagname
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		
		System.out.println("Number Of Hyperlinks: "+links.size());
		
		for(WebElement link:links) {
		String linkText=link.getAttribute("href");
		System.out.println(linkText);
		}
		
		
		
		

	}

}
