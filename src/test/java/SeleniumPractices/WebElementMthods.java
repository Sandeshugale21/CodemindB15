package SeleniumPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMthods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textarea= driver.findElement(By.cssSelector("textarea#ta1"));
		
		textarea.sendKeys("Welcome to pune");
		//Thread.sleep(3000);
		textarea.clear();
		
		String value =textarea.getDomAttribute("cols");
		System.out.println(value);
		
		String coneditable= textarea.getAttribute("contenteditable");
		System.out.println(coneditable);
		
		String cssValueBorderStyle= textarea.getCssValue("border-style");
		System.out.println(cssValueBorderStyle);
		
		String color= driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color");
		System.out.println(color);
		
		Rectangle ract= textarea.getRect();
		System.out.println(ract.getHeight());
		System.out.println(ract.getWidth());
		
		System.out.println(ract.getX());
		System.out.println(ract.getY());
		
		String tagname= textarea.getTagName();
		System.out.println(tagname);
		
		boolean visible= textarea.isDisplayed();
		System.out.println("element is visible : " +visible);
		
		System.out.println("element is visible : " +driver.findElement(By.xpath("//div[@id='delayedText']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='delayedText']")).getCssValue("visibility"));
		//Thread.sleep(11000);
		System.out.println("element is visible : " +driver.findElement(By.xpath("//div[@id='delayedText']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='delayedText']")).getCssValue("visibility"));
		
		
		System.out.println("textarea is enebled :" + textarea.isEnabled());
		
		System.out.println("button is enabled : " +driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).getAttribute("disabled"));
		
		System.out.println("Bike redio button is selected : " +driver.findElement(By.xpath("//input[@value='Bike']")).isSelected());
		System.out.println("Bicycle redio button is selected : " +driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected());
		
		System.out.println("Pen checkbox is checked : " +driver.findElement(By.xpath("//input[@value='Pen']")).isSelected());
		System.out.println("Book checkbox is checked : " +driver.findElement(By.xpath("//input[@value='Book']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'This is a sample Text on this page.')]")).getText());
		
		driver.quit();
		

	}

}
